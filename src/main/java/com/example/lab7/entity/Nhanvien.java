package com.example.lab7.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
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
@Table(name="nhanvien")
public class Nhanvien {
    @Id
    private String Ma_NV;
    @Column
    private String Ten_NV;
    @Column
    private String Phai;
    @Column
    private String Noi_Sinh;
    @Column
    private int Luong;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Ma_Phong")
    @Transient
    private Phongban phongBan;
}
