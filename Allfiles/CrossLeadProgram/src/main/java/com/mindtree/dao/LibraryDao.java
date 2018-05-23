package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.Book;

public interface LibraryDao
{
	public boolean addBook(Book book);
	public boolean deleteBook(List<Book> blist);
	public List<Book> getBook();
}
