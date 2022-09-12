package com.example.twotablesprv4.controller;

import com.example.twotablesprv4.entity.NhomSanPham;
import com.example.twotablesprv4.service.INhomSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/nhom-san-pham")
public class NhomSanPhamController {
    @Autowired
    private INhomSanPhamService nhomSanPhamService;

    @PostMapping("/save")
    public NhomSanPham save(@RequestBody NhomSanPham nhomSanPham){
        return nhomSanPhamService.save(nhomSanPham);
    }

    @GetMapping("/getAll")
    public List<NhomSanPham> getAll(){
        return nhomSanPhamService.getAll();
    }
}
