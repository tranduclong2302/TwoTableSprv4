package com.example.twotablesprv4.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "PRODUCT")
public class SanPham implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "product_name")
    private String tenSanPham;

    @Column(name = "cost")
    private Float giaBanLe;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "thuong_hieu_id", nullable = false)
    private ThuongHieu thuongHieuId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "nhom_san_pham_id", nullable = false)
    private NhomSanPham nhomSanPhamId;
}
