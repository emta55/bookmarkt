package com.emta.bookmarkt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emta.bookmarkt.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	
}
