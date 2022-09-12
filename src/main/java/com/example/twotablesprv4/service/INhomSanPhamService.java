package com.example.twotablesprv4.service;

import com.example.twotablesprv4.entity.NhomSanPham;

import java.util.List;

public interface INhomSanPhamService {
    NhomSanPham save(NhomSanPham nhomSanPham);

    NhomSanPham update(int id, NhomSanPham nhomSanPham);

    boolean remove(int id);

    List<NhomSanPham> getAll();

    NhomSanPham findById(int id);
}
