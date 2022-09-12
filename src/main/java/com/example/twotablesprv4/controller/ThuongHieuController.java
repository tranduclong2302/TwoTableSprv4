package com.example.twotablesprv4.controller;

import com.example.twotablesprv4.entity.ThuongHieu;
import com.example.twotablesprv4.service.IThuongHieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/thuong-hieu")
public class ThuongHieuController {

    @Autowired
    private IThuongHieuService thuongHieuService;

    @PostMapping("/save")
    public ThuongHieu save(@RequestBody ThuongHieu thuongHieu){
        return thuongHieuService.save(thuongHieu);
    }
    @GetMapping("getAll-thuong-hieu")
    public List<ThuongHieu> getAll(){
        return thuongHieuService.getAll();
    }
    @DeleteMapping("remove/{id}")
    public Boolean remove(@PathVariable("id") int id){
        return thuongHieuService.remove(id);
    }
    @PutMapping("/update/{id}")
    public ThuongHieu update(@PathVariable("id") int id,
                             @RequestBody ThuongHieu thuongHieu){
        return thuongHieuService.update(id, thuongHieu);
    }
}
