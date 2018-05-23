package com.mindtree.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.entity.Book;
import com.mindtree.service.LibraryService;

@RestController
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
@RequestMapping(value = "/library")
public class Maincontoller
{
	@Autowired
	LibraryService lservice;
	
	@RequestMapping(value="/addBooks",method = RequestMethod.POST)
	public boolean addBooks(@RequestBody Book book)
	{
		boolean res=lservice.addBook(book);
		return res;
	}

	@RequestMapping(value="/getBooks",method = RequestMethod.GET)
	public List<Book> getBooks()
	{
		List<Book> blist=lservice.getBook();
		return blist;
	}
	
	
	@RequestMapping(value="/deleteBooks",method = RequestMethod.POST)
	public boolean deleteBooks(@RequestBody List<Book> blist)
	{
		boolean res=lservice.deleteBook(blist);
		return res;
	}
}
