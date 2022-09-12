package com.example.twotablesprv4.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hoa_don_mua")
public class HoaDonMua implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "ngay_tao", nullable = false)
    @CreationTimestamp
    private LocalDate ngayTao;

    @Column(name = "phi_van_chuyen", nullable = false)
    private float phiVanChuyen;

    @Column(name = "tong_tien", nullable = false)
    private float tongTien;

    @Column(name = "tinh_trang", nullable = false)
    private String tinhTrang;
}
