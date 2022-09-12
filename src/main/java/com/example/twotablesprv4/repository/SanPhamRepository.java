package com.example.twotablesprv4.repository;

import com.example.twotablesprv4.entity.SanPham;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Integer>{
    List<SanPham> findSanPhamByTenSanPhamLike(String tenSanPham);

    List<SanPham> findSanPhamByGiaBanLe(float giaBan);

    SanPham findSanPhamById(int id);

//    Page<SanPham> findAll(Pageable pageable);

//    List<SanPham> findAllByGiaBanLe(float giaBan, Pageable pageable);

}
