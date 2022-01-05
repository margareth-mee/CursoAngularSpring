package com.superdev.crudspring.repository;

import org.springframework.stereotype.Repository;

import com.superdev.crudspring.model.Course;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
