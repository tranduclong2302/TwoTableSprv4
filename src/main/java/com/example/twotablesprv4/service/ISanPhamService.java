package com.example.twotablesprv4.service;

import com.example.twotablesprv4.entity.SanPham;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ISanPhamService {
    SanPham save(SanPham sanPham);

    SanPham update(int id, SanPham sanPham);
    boolean remove(int id);

    List<SanPham> getAll();


    SanPham findSanPhamById(int id);

    List<SanPham> findSanPhamWithSorting(String field);

    Page<SanPham> findSanPhamWithPaging(int offset, int pageSize); //vi tri trang - so phan tu trong 1 trang

    Page<SanPham> findSanPhamWithPagingAndSorting(int offset, int pageSize, String field);

    List<SanPham> findSanPhamByTenSanPhamLike(String tenSanPham);

    List<SanPham> findSanPhamByGiaBanLe(float giaBan);


}
