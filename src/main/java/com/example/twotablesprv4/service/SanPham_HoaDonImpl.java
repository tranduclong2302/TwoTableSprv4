package com.example.twotablesprv4.service;

import com.example.twotablesprv4.entity.SanPham_HoaDon;
import com.example.twotablesprv4.repository.SanPham_HoaDonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPham_HoaDonImpl implements ISanPham_HoaDonService {

    @Autowired
    private SanPham_HoaDonRepository sanPham_hoaDonRepository;


    @Override
    public SanPham_HoaDon findById_SanPhamIdAndId_HoaDonMuaId(int sanPhamId, int hoaDonMuaId) {
        return sanPham_hoaDonRepository.findById_SanPhamIdAndId_HoaDonMuaId(sanPhamId, hoaDonMuaId);
    }

    @Override
    public List<SanPham_HoaDon> findById_SanPhamId(int sanPhamId) {
        return sanPham_hoaDonRepository.findById_SanPhamId(sanPhamId);
    }

    @Override
    public List<SanPham_HoaDon> findById_HoaDonMuaId(int hoaDonMuaId) {
        return sanPham_hoaDonRepository.findById_HoaDonMuaId(hoaDonMuaId);
    }

    @Override
    public SanPham_HoaDon save(SanPham_HoaDon sanPham_hoaDon) {
        return sanPham_hoaDonRepository.save(sanPham_hoaDon);
    }

    @Override
    public boolean remove(int sanPhamId, int hoaDonMuaId) {
        SanPham_HoaDon sanPham_hoaDon = sanPham_hoaDonRepository.findById_SanPhamIdAndId_HoaDonMuaId(sanPhamId, hoaDonMuaId);
        if (sanPham_hoaDon!= null){
            sanPham_hoaDonRepository.delete(sanPham_hoaDon);
            return true;
        }
        return false;
    }
}
