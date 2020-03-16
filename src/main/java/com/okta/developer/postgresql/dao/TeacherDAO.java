package com.okta.developer.postgresql.dao;

import java.util.UUID;

import com.okta.developer.postgresql.entities.Teacher;

import org.springframework.data.repository.CrudRepository;

public interface TeacherDAO extends CrudRepository<Teacher, UUID> {
    
}