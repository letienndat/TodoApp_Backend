package com.todoapp_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todoapp_backend.entity.Work;

@Service
public interface WorkService {
    Work save(Work work);
    List<Work> findAll();
    Work getOne(Integer id) throws Exception;
    Work updateWord(Integer id, Work work) throws Exception;
    Work removeWork(Integer id) throws Exception;
}
