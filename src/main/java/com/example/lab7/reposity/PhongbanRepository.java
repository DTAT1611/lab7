package com.example.lab7.reposity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lab7.entity.Phongban;


@Repository
    public interface PhongbanRepository extends JpaRepository<Phongban,String>{
    }

