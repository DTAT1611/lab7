package com.example.lab7.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="phongban")
public class Phongban {
    @Id
    private String  Ma_Phong;
    @Column
    private String Ten_Phong;
    @OneToMany(mappedBy = "category" , fetch = FetchType.LAZY)
    private List<Nhanvien> listNhanviens;
}

