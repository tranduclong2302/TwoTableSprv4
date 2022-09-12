package com.example.twotablesprv4.controller;

import com.example.twotablesprv4.entity.NhomSanPham;
import com.example.twotablesprv4.entity.SanPham;
import com.example.twotablesprv4.entity.ThuongHieu;
import com.example.twotablesprv4.service.INhomSanPhamService;
import com.example.twotablesprv4.service.ISanPhamService;
import com.example.twotablesprv4.service.IThuongHieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/san-pham")
public class SanPhamController {
    @Autowired
    private ISanPhamService sanPhamService;

    @Autowired
    private IThuongHieuService thuongHieuService;

    @Autowired
    private INhomSanPhamService nhomSanPhamService;

    @PostMapping("/save/{thuongHieuId}/{nhomSanPhamId}")
    public SanPham save(@RequestBody SanPham sanPham,
                        @PathVariable("thuongHieuId") int thuongHieuId,
                        @PathVariable("nhomSanPhamId") int nhomSanPhamId){
        ThuongHieu thuongHieu = thuongHieuService.findById(thuongHieuId);
        NhomSanPham nhomSanPham = nhomSanPhamService.findById(nhomSanPhamId);
        sanPham.setThuongHieuId(thuongHieu);
        sanPham.setNhomSanPhamId(nhomSanPham);
        return sanPhamService.save(sanPham);
      }

    @GetMapping("getAll-san-pham")
    public List<SanPham> getAll(){
        return sanPhamService.getAll();
    }

    @GetMapping("/find-by-id/{id}")
    public SanPham findById(@PathVariable("id") int id){
        return sanPhamService.findSanPhamById(id);
    }
    @GetMapping("/{field}")
    public List<SanPham> findSanPhamWithSorting(@PathVariable("field") String field){
        return sanPhamService.findSanPhamWithSorting(field);
    }

    @GetMapping("/page/{offset}/{pageSize}")
    public Page<SanPham> findSanPhamWithPaging(@PathVariable("offset") int offset,
                                               @PathVariable("pageSize") int pageSize){
        return sanPhamService.findSanPhamWithPaging(offset, pageSize);
    }
    @GetMapping("/page/{offset}/{pageSize}/{field}")
    public Page<SanPham> findSanPhamWithPaging(@PathVariable("offset") int offset,
                                               @PathVariable("pageSize") int pageSize,
                                               @PathVariable("field") String field){
        return sanPhamService.findSanPhamWithPagingAndSorting(offset, pageSize, field);
    }

    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable("id") int id){
        return sanPhamService.remove(id);
    }

    @PutMapping("/update/{id}")
    public SanPham update(@PathVariable("id") int id,
                          @RequestBody SanPham sanPham){
        return sanPhamService.update(id, sanPham);
    }

    @GetMapping("/find-by-name/{tenSanPham}")
    public List<SanPham> findSanPhamByTenSanPhamLike(@PathVariable("tenSanPham") String tenSanPham){
        return sanPhamService.findSanPhamByTenSanPhamLike(tenSanPham);
    }
    @GetMapping("/find-by-giaban/{giaBan}")
    public List<SanPham> findSanPhamByGiaBanLe(@PathVariable("giaBan") float giaBan){
        return sanPhamService.findSanPhamByGiaBanLe(giaBan);
    }



}
