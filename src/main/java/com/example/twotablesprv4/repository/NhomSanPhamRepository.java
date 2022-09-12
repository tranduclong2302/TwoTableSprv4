package com.example.twotablesprv4.repository;

import com.example.twotablesprv4.entity.NhomSanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhomSanPhamRepository extends JpaRepository<NhomSanPham, Integer> {
}
