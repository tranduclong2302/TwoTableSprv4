package com.example.twotablesprv4.controller;


import com.example.twotablesprv4.entity.HoaDonMua;
import com.example.twotablesprv4.service.IHoaDonMuaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/hoa-don-mua")
public class HoaDonMuaController {

    @Autowired
    private IHoaDonMuaService hoaDonMuaService;

    @GetMapping("/find-by-id/{id}")
    public HoaDonMua findById(@PathVariable("id") int id){
        return hoaDonMuaService.findById(id);
    }

    @GetMapping("find-all")
    public List<HoaDonMua> findAll(){
        return hoaDonMuaService.findAll();
    }

    @GetMapping("/find-by-ngay-tao/{date}")
    public List<HoaDonMua> findByNgayTao(@PathVariable("date") String date){
        LocalDate localDate =LocalDate.parse(date);
        return hoaDonMuaService.findByNgayTao(localDate);
    }

    @GetMapping("/find-by-ngay-tao/{date1}/{date2}")
    public List<HoaDonMua> findByNgayTaoBetween(@PathVariable("date1") String date1,
                                                @PathVariable("date2") String date2){
        LocalDate localDate1 = LocalDate.parse(date1);
        LocalDate localDate2 = LocalDate.parse(date2);
        return hoaDonMuaService.findByNgayTaoBetween(localDate1, localDate2);
    }

    @PostMapping("/save")
    public HoaDonMua save(@RequestBody HoaDonMua hoaDonMua){
        hoaDonMua.setNgayTao(LocalDate.now());
        return hoaDonMuaService.save(hoaDonMua);
    }

    @DeleteMapping("/remove/{id}")
    public boolean remove(int id){
        return hoaDonMuaService.remove(id);
    }
}
