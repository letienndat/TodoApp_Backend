package com.todoapp_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todoapp_backend.entity.Work;

@Repository
public interface WorkRepository extends JpaRepository<Work, Integer> {
    
}
