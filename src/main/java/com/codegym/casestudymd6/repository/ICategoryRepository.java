package com.codegym.casestudymd6.repository;

import com.codegym.casestudymd6.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends CrudRepository<Category, Long> {
}
