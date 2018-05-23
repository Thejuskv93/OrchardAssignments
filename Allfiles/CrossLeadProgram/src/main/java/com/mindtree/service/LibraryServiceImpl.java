package com.mindtree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.dao.LibraryDao;
import com.mindtree.entity.Book;

@Service
public class LibraryServiceImpl implements LibraryService
{
	@Autowired
	LibraryDao librarydao;

	public boolean addBook(Book book) 
	{
		return librarydao.addBook(book);
	}

	@Transactional
	public List<Book> getBook() {
		return librarydao.getBook();
	}
	@Transactional
	public boolean deleteBook(List<Book> blist) {
		return librarydao.deleteBook(blist);
	}

}
