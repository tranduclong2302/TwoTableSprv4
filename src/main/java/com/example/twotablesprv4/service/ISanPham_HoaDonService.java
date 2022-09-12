package com.example.twotablesprv4.service;

import com.example.twotablesprv4.entity.SanPham_HoaDon;

import java.util.List;

public interface ISanPham_HoaDonService {


    SanPham_HoaDon findById_SanPhamIdAndId_HoaDonMuaId(int sanPhamId, int hoaDonMuaId);

    List<SanPham_HoaDon> findById_SanPhamId(int sanPhamId);

    List<SanPham_HoaDon> findById_HoaDonMuaId(int hoaDonMuaId);

    SanPham_HoaDon save(SanPham_HoaDon sanPham_hoaDon);

    boolean remove(int sanPhamId, int hoaDonMuaId);
}
