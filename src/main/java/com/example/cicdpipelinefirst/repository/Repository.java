package com.example.cicdpipelinefirst.repository;

import com.example.cicdpipelinefirst.entity.Hp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Hp,Integer> {
}
