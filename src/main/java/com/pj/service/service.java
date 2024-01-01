package com.pj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pj.repository.repo;

@Service
public class service {
    
    @Autowired
    repo repo;
}
