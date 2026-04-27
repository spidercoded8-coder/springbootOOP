package com.myproject.demo.service;

import com.myproject.demo.model.*;
import com.myproject.demo.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    private final TaskRepository taskRepo;
    private final NoticeRepository noticeRepo;

    public ScheduleService(TaskRepository taskRepo, NoticeRepository noticeRepo) {
        this.taskRepo = taskRepo;
        this.noticeRepo = noticeRepo;
    }

    public List<Task> getTasks() {
        return taskRepo.findAll();
    }

    public void saveTask(Task t) {
        taskRepo.save(t);
    }

    public void deleteTask(Long id) {
        taskRepo.deleteById(id);
    }

    public List<Notice> getNotices() {
        return noticeRepo.findAll();
    }

    public void saveNotice(Notice n) {
        noticeRepo.save(n);
    }
}