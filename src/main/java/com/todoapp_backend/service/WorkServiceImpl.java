package com.todoapp_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todoapp_backend.entity.Status;
import com.todoapp_backend.entity.Work;
import com.todoapp_backend.repository.WorkRepository;

@Service
public class WorkServiceImpl implements WorkService {
    @Autowired
    private WorkRepository workRepository;

    @Override
    public Work save(Work work) {
        return workRepository.save(new Work(work.getTitle(), work.getStatus() == null ? Status.ACTIVE : work.getStatus()));
    }

    @Override
    public List<Work> findAll() {
        return workRepository.findAll();
    }

    public Work getOne(Integer id) throws Exception {
        return workRepository.findById(id)
                .orElseThrow(() -> new Exception("Không tìm thấy công việc nào chứa id = " + id));
    }

    @Override
    public Work updateWord(Integer id, Work work) throws Exception {
        Work res = workRepository.findById(id)
                .orElseThrow(() -> new Exception("Không tìm thấy sản phẩm nào chứa id = " + id));

        res.setTitle(work.getTitle());
        res.setStatus(work.getStatus());

        return workRepository.save(res);
    }

    @Override
    public Work removeWork(Integer id) throws Exception {
        Work res = workRepository.findById(id)
                .orElseThrow(() -> new Exception("Không tìm thấy sản phẩm nào chứa id = " + id));

        workRepository.deleteById(id);

        return res;
    }
}
