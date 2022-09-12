package com.example.twotablesprv4.repository;

import com.example.twotablesprv4.entity.SanPham_HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SanPham_HoaDonRepository extends JpaRepository<SanPham_HoaDon, Integer>,
                                                  JpaSpecificationExecutor<SanPham_HoaDon> {
    SanPham_HoaDon findById_SanPhamIdAndId_HoaDonMuaId(int sanPhamId, int hoaDonMuaId);

    List<SanPham_HoaDon> findById_SanPhamId(int sanPhamId);

    List<SanPham_HoaDon> findById_HoaDonMuaId(int hoaDonMuaId);
}
