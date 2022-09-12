package com.example.twotablesprv4.controller;

import com.example.twotablesprv4.entity.HoaDonMua;
import com.example.twotablesprv4.entity.SanPham;
import com.example.twotablesprv4.entity.SanPham_HoaDon;
import com.example.twotablesprv4.key.sanpham_hoadon_key;
import com.example.twotablesprv4.service.IHoaDonMuaService;
import com.example.twotablesprv4.service.ISanPhamService;
import com.example.twotablesprv4.service.ISanPham_HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sanpham-has-hoadon")
public class SanPham_HoaDonController {

    @Autowired
    private ISanPhamService sanPhamService;

    @Autowired
    private IHoaDonMuaService hoaDonMuaService;

    @Autowired
    private ISanPham_HoaDonService sanPham_hoaDonService;

    @PostMapping("/save/{sanPhamId}/{hoaDonMuaId}")
    public SanPham_HoaDon save(@RequestBody SanPham_HoaDon sanPham_hoaDon,
                               @PathVariable("sanPhamId") int sanPhamId,
                               @PathVariable("hoaDonMuaId") int hoaDonMuaId){
        SanPham sanPham =sanPhamService.findSanPhamById(sanPhamId);
        HoaDonMua hoaDonMua = hoaDonMuaService.findById(hoaDonMuaId);

        sanpham_hoadon_key sanpham_hoadon_key = new sanpham_hoadon_key(sanPhamId, hoaDonMuaId);
        sanPham_hoaDon.setId(sanpham_hoadon_key);
        sanPham_hoaDon.setSanPhamId(sanPham);
        sanPham_hoaDon.setHoaDonMuaId(hoaDonMua);
        return sanPham_hoaDonService.save(sanPham_hoaDon);
    }


}
