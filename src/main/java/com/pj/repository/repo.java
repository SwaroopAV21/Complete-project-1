package com.pj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pj.model.complete;

@Repository
public interface repo extends JpaRepository<complete ,Long> {
    
}
