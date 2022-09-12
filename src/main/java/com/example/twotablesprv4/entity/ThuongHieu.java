package com.example.twotablesprv4.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "thuong_hieu")
public class ThuongHieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ten_thuong_hieu", nullable = false)
    private String tenThuongHieu;

//    @Column(name = "deleted", nullable = false)
//    private Boolean deleted;
}
