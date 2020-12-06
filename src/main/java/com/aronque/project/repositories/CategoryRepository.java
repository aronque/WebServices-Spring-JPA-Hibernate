package com.aronque.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aronque.project.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
