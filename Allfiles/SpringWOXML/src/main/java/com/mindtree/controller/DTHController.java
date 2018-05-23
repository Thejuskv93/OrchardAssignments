package com.mindtree.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.entity.Channels;
import com.mindtree.entity.Customers;
import com.mindtree.entity.Subscription_Channel;
import com.mindtree.service.DTHService;

@Controller
public class DTHController {
	@Autowired
	DTHService serv;

	@RequestMapping(value = "/channels")
	public ModelAndView getChannels() {
		ModelAndView mv = new ModelAndView();
		List<Channels> list = serv.getChannels();
		mv.setViewName("dthSubscription");
		mv.addObject("lists", list);
		return mv;
	}

	@RequestMapping(value = "/subscribe")
	public ModelAndView subscribe(HttpServletRequest req, HttpServletResponse resp) {
		String date = req.getParameter("subsc_date");
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		Date currDate = null;
		try {
			currDate = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Channels ch = new Channels();
		Customers c = new Customers();
		Subscription_Channel sub = new Subscription_Channel();
		sub.setSubsc_date(currDate);

		ch.setChannel_id(Integer.parseInt(req.getParameter("channel_id")));
		sub.setChannel(ch);
		c.setSubscriber_ID(Integer.parseInt(req.getParameter("subscriber_ID")));
		sub.setSubscriber_ID(c);
		ModelAndView mv = new ModelAndView();

		int n = serv.subscribe(sub);
		if (n == 100) {
			mv.setViewName("redirect");
			mv.addObject("msg", "Invalid Channel");
		} else if (n != 0) {
			mv.setViewName("redirect");
			mv.addObject("msg", "Channel subscription done successfully");
		} else if (n == 0) {
			mv.setViewName("redirect");
			mv.addObject("msg", "Already Subscriberd to this channel");
		}

		return mv;
	}

	@RequestMapping(value = "/getChannels")
	public ModelAndView getChannel(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();
		int id = Integer.parseInt(req.getParameter("subscriber_ID"));
		List<Channels> clist = serv.getSubsChannel(id);
		mv.setViewName("editSubscription");
		mv.addObject("lists", clist);
		mv.addObject("sid", id);
		return mv;
	}

	@RequestMapping(value = "/unsubscribe")
	public ModelAndView unsubscribe(HttpServletRequest req, HttpServletResponse resp) {
		Channels ch = new Channels();
		Customers c = new Customers();
		Subscription_Channel sub = new Subscription_Channel();
		int cid = Integer.parseInt(req.getParameter("channel_id"));
		ch.setChannel_id(cid);
		sub.setChannel(ch);
		int sid = Integer.parseInt(req.getParameter("subscriber_ID"));
		c.setSubscriber_ID(sid);
		sub.setSubscriber_ID(c);
		ModelAndView mv = new ModelAndView();

		int n = serv.unsubscribe(sub);
		if (n != 0) {
			mv.setViewName("redirect");
			mv.addObject("msg", "Channel subscription done successfully");
		}
		return mv;
	}

	@RequestMapping(value = "/getDetails")
	public ModelAndView getDetails(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();
		int id = Integer.parseInt(req.getParameter("subscriber_ID"));
		List<Subscription_Channel> clist = serv.getDetails(id);
		double cost = 0;
		for (Subscription_Channel sub : clist) {
			cost += sub.getChannel().getCost();
		}
		String fullName = clist.get(0).getSubscriber_ID().getFname() + " " + clist.get(0).getSubscriber_ID().getLname();
		mv.setViewName("viewDetails");
		mv.addObject("lists", clist);
		mv.addObject("tcost", cost);
		mv.addObject("fullName", fullName);
		return mv;
	}
}
