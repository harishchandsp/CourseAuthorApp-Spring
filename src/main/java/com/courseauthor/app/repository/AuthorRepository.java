package com.courseauthor.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseauthor.app.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{

}
