package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.Book;

public interface LibraryService 
{
	public boolean addBook(Book book);

	public boolean deleteBook(List<Book> blist);

	public List<Book> getBook();
}
