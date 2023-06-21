package com.todoapp_backend.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.todoapp_backend.entity.Status;
import com.todoapp_backend.entity.Work;
import com.todoapp_backend.service.WorkService;

// @Configuration
public class InitData {
    @Bean("init")
    public CommandLineRunner initData(@Autowired WorkService workService) {
        return e -> {
            workService.save(new Work("Quét nhà", Status.ACTIVE));
            workService.save(new Work("Rửa bát", Status.COMPLETE));
            workService.save(new Work("Học bài", Status.COMPLETE));
            workService.save(new Work("Nấu cơm", Status.ACTIVE));
            workService.save(new Work("Chơi bóng rổ", Status.ACTIVE));
            workService.save(new Work("Giặt quần áo", Status.COMPLETE));
            workService.save(new Work("Dạy gia sư", Status.COMPLETE));
            workService.save(new Work("Đi siêu thị", Status.ACTIVE));
            workService.save(new Work("ĐỌc sách", Status.ACTIVE));
            workService.save(new Work("Học một ngôn ngữ mới", Status.COMPLETE));
            workService.save(new Work("Đan len", Status.COMPLETE));
            workService.save(new Work("Gọi điện thoại cho gia đình", Status.COMPLETE));
        };
    }
}
