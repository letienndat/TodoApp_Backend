package com.todoapp_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todoapp_backend.entity.Work;
import com.todoapp_backend.service.WorkService;

@RestController
@RequestMapping(path = "/api/todoapp")
@CrossOrigin(originPatterns = "*")
public class AppController {
    @Autowired
    private WorkService workService;

    // localhost:8080/api/todoapp or localhost:8080/api/todoapp/
    @GetMapping(path = {"", "/"})
    public List<Work> getAllWorks() {
        return workService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Work getWork(@PathVariable(name = "id") Integer id) throws Exception {
        return workService.getOne(id);
    }

    @PostMapping(path = "")
    public Work addWork(@RequestBody Work work) {
        return workService.save(work);
    }

    @PutMapping(path = "/{id}")
    public Work updateWork(@PathVariable(name = "id") Integer id, @RequestBody Work work) throws Exception {
        return workService.updateWord(id, work);
    }

    @DeleteMapping(path = "/{id}")
    public Work deleteWork(@PathVariable(name = "id") Integer id) throws Exception {
        return workService.removeWork(id);
    }
}
