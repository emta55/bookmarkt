package com.emta.bookmarkt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emta.bookmarkt.entity.MyBookList;
import com.emta.bookmarkt.repository.MyBookRepository;

@Service
public class MyBookListService {
	@Autowired
	private MyBookRepository mybook;
	
	public void saveMyBooks(MyBookList book) {
		mybook.save(book);
	}
	
	public List<MyBookList> getAllMyBooks(){
		return mybook.findAll();
	}
	
	public void deleteById(int id) {
		mybook.deleteById(id);
	}
}
