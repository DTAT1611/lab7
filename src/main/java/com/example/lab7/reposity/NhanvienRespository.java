package com.example.lab7.reposity;

import org.springframework.stereotype.Repository;

import com.example.lab7.entity.Nhanvien;

import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface NhanvienRespository extends JpaRepository<Nhanvien, String> {

    
}   
