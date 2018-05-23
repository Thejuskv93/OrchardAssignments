package com.mindtree.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.entity.Project;
import com.mindtree.entity.User;
import com.mindtree.service.UserService;

@Controller
public class UserController
{
	@Autowired
	UserService userv;
	
	@RequestMapping(value="/val")
	public  ModelAndView valUser(@RequestParam("uid") String uid,@RequestParam("pwd") String pwd,HttpServletRequest req,HttpServletResponse resp)
	{
		ModelAndView mv=new ModelAndView();
		if(uid.equals("admin") && pwd.equals("admin"))
		{
			mv.setViewName("adminHome");
		}
		else
		{
			User usr=new User();
			usr.setUname(uid);
			usr.setPassword(pwd);
			int n=userv.valUser(usr);
			
			if(n!=0)
			{
				mv.setViewName("userHome");
			}
			else
			{
				mv.setViewName("invalid");
			}
		}
		
		return mv;
	}
	
	
	@RequestMapping(value="/addUser")
	public  ModelAndView addUser(@ModelAttribute("userData") User user)
	{
		ModelAndView mv=new ModelAndView();
		int id=userv.addUser(user);
		if(id!=0)
		{
			mv.setViewName("adminHome");
		}
		return mv;
	}
	
	@RequestMapping(value="/addProj")
	public  ModelAndView addProject(@ModelAttribute("projectData") Project project)
	{
		ModelAndView mv=new ModelAndView();
		String id=userv.addProject(project);
		if(id!=null)
		{
			mv.setViewName("adminHome");
		}
		return mv;
	}
	
	@RequestMapping(value="/viewProj")
	public  ModelAndView viewProject()
	{
		ModelAndView mv=new ModelAndView();
		List<Project> list=userv.viewProjects();
		if(!list.isEmpty())
		{
			mv.setViewName("displayProj");
			mv.addObject("userList",list);
		}
		return mv;
	}
	
	@RequestMapping(value="/viewUsers")
	public  ModelAndView viewUsers()
	{
		ModelAndView mv=new ModelAndView();
		List<User> list=userv.viewUsers();
		if(!list.isEmpty())
		{
			mv.setViewName("displayUser");
			mv.addObject("userList",list);
		}
		return mv;
	}
	
	@RequestMapping(value="/viewEmpById")
	public  ModelAndView viewEmpById(@RequestParam("uid") int uid)
	{
		ModelAndView mv=new ModelAndView();
		User user=userv.getUserById(uid);
		
		if(user.getUserId()!=0)
		{
			mv.setViewName("displayEmpById");
			mv.addObject("users",user);
		}
		else
		{
			mv.setViewName("invalid");
		}
		return mv;
	}
}
