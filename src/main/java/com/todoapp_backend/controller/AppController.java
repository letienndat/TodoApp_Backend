package com.todoapp_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Work>> getAllWorks() {
        return ResponseEntity.status(HttpStatus.OK).body(
            workService.findAll()
        );
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Work> getWork(@PathVariable(name = "id") Integer id) throws Exception {
        return ResponseEntity.status(HttpStatus.OK).body(
            workService.getOne(id)
        );
    }

    @PostMapping(path = "")
    public ResponseEntity<Work> addWork(@RequestBody Work work) {
        return ResponseEntity.status(HttpStatus.OK).body(
            workService.save(work)
        );
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Work> updateWork(@PathVariable(name = "id") Integer id, @RequestBody Work work) throws Exception {
        return ResponseEntity.status(HttpStatus.OK).body(
            workService.updateWord(id, work)
        );
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Work> deleteWork(@PathVariable(name = "id") Integer id) throws Exception {
        return ResponseEntity.status(HttpStatus.OK).body(
            workService.removeWork(id)
        );
    }
}
