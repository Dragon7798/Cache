package com.example.cache.repo;

import com.example.cache.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DbRepo extends JpaRepository<Emp, Integer> {
}
