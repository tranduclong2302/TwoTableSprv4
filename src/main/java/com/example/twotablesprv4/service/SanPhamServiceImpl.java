package com.example.twotablesprv4.service;

import com.example.twotablesprv4.entity.SanPham;
import com.example.twotablesprv4.repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamServiceImpl implements ISanPhamService{
    @Autowired
    private SanPhamRepository sanPhamRepository;

    @Override
    public SanPham save(SanPham sanPham) {
        return sanPhamRepository.save(sanPham);
    }

    @Override
    public SanPham update(int id, SanPham sanPham) {
        if (id >= 1){
            SanPham sanPham1 = sanPhamRepository.findById(id).get();
            if (sanPham1 != null){
                sanPham1.setTenSanPham(sanPham.getTenSanPham());
                sanPham1.setGiaBanLe(sanPham.getGiaBanLe());
                sanPham1.setThuongHieuId(sanPham.getThuongHieuId());
                return sanPhamRepository.save(sanPham1);
            }
        }
        return null;
    }

    @Override
    public boolean remove(int id) {
        if (id >= 1){
            SanPham sanPham = sanPhamRepository.findById(id).get();
            sanPhamRepository.delete(sanPham);
            return true;
        }
        return false;
    }

    @Override
    public List<SanPham> getAll() {
        return sanPhamRepository.findAll();
    }

    @Override
    public SanPham findSanPhamById(int id) {
        return sanPhamRepository.findSanPhamById(id);
    }


    @Override
    public List<SanPham> findSanPhamWithSorting(String field) {
        return sanPhamRepository.findAll(Sort.by(Sort.Direction.ASC, field));
    }

    @Override
    public Page<SanPham> findSanPhamWithPaging(int offset, int pageSize) {
        Page<SanPham> sanPhams = sanPhamRepository.findAll(PageRequest.of(offset, pageSize));
        return sanPhams;
    }

    @Override
    public Page<SanPham> findSanPhamWithPagingAndSorting(int offset, int pageSize, String field) {
        //Sap xep giam dan
        return sanPhamRepository.findAll(PageRequest.of(offset,pageSize).withSort(Sort.by(field).descending()));
    }


    @Override
    public List<SanPham> findSanPhamByTenSanPhamLike(String tenSanPham) {
        return sanPhamRepository.findSanPhamByTenSanPhamLike("%" + tenSanPham + "%");
    }

    @Override
    public List<SanPham> findSanPhamByGiaBanLe(float giaBan) {
        return sanPhamRepository.findSanPhamByGiaBanLe(giaBan);
    }
}
