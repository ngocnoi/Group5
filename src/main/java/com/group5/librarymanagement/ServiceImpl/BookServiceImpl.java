package com.group5.librarymanagement.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group5.librarymanagement.Entity.Book;
import com.group5.librarymanagement.Repositories.BookRepository;
import com.group5.librarymanagement.Service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book getBook(Integer id) {
		return bookRepository.findById(id).get();
	}

	@Override
	public void addBook(Book book) {
		bookRepository.saveAndFlush(book);
	}

	@Override
	public void updateBook(Integer id, Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBook(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Book> listBook() {
		return bookRepository.findAll();
	}

}
