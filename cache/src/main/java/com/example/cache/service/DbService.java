package com.example.cache.service;

import com.example.cache.entity.Emp;
import com.example.cache.repo.DbRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbService {

    @Autowired
    DbRepo dbRepo;

    public List<Emp> get() {
        System.out.println("Fetching book from DB");
        return dbRepo.findAll();
    }

    @Cacheable(value = "emp", key = "#id")
    public Optional<Emp> getById(int id) {
        System.out.println("Fetching book from DB");
        return dbRepo.findById(id);
    }
}
