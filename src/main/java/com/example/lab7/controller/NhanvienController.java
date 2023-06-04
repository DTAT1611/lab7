package com.example.lab7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.lab7.entity.Nhanvien;
import com.example.lab7.entity.Phongban;
import com.example.lab7.reposity.NhanvienRespository;
import com.example.lab7.reposity.PhongbanRepository;



@RequestMapping("/nhanvien")
@RestController
public class NhanvienController {
    @Autowired
    private NhanvienRespository nhanvienReposity;
    @Autowired
    private PhongbanRepository phongbanRepository;
    @GetMapping
    @ResponseBody
    public List<Nhanvien> index()
    {
        List<Nhanvien> listNhanvien= nhanvienReposity.findAll();
        for(Nhanvien i:listNhanvien){
            Phongban phongBan=phongbanRepository.findById(i.getMa_NV()).orElse(null);
            if(phongBan!=null)
            i.setPhongBan(phongBan);
        };
        return listNhanvien;
    }
    
 }
