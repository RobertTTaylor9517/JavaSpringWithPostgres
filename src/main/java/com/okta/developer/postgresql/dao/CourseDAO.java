package com.okta.developer.postgresql.dao;

import java.util.UUID;

import com.okta.developer.postgresql.entities.Course;

import org.springframework.data.repository.CrudRepository;

public interface CourseDAO extends CrudRepository<Course, UUID> {
    
}