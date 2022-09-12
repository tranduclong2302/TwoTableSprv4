package com.example.twotablesprv4.service;

import com.example.twotablesprv4.entity.NhomSanPham;
import com.example.twotablesprv4.repository.NhomSanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhomSanPhamServiceImpl implements INhomSanPhamService{

    @Autowired
    private NhomSanPhamRepository nhomSanPhamRepository;

    @Override
    public NhomSanPham save(NhomSanPham nhomSanPham) {
        return nhomSanPhamRepository.save(nhomSanPham);
    }

    @Override
    public NhomSanPham update(int id, NhomSanPham nhomSanPham) {
        if (id >= 1){
            NhomSanPham nhomSanPham1 = nhomSanPhamRepository.findById(id).get();
            if (nhomSanPham1 != null){
                nhomSanPham1.setProductGroupName(nhomSanPham.getProductGroupName());
                return nhomSanPhamRepository.save(nhomSanPham1);
            }
        }
        return null;
    }

    @Override
    public boolean remove(int id) {
        if (id >= 1){
            NhomSanPham nhomSanPham = nhomSanPhamRepository.findById(id).get();
            nhomSanPhamRepository.delete(nhomSanPham);
            return true;
        }
        return false;
    }

    @Override
    public List<NhomSanPham> getAll() {
        return nhomSanPhamRepository.findAll();
    }

    @Override
    public NhomSanPham findById(int id) {
        return nhomSanPhamRepository.findById(id).get();
    }
}
