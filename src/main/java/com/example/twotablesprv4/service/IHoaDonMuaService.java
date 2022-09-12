package com.example.twotablesprv4.service;

import com.example.twotablesprv4.entity.HoaDonMua;

import java.time.LocalDate;
import java.util.List;

public interface IHoaDonMuaService {
    HoaDonMua findById(int id);

    List<HoaDonMua> findAll();

    List<HoaDonMua> findByNgayTao(LocalDate date);

    List<HoaDonMua> findByNgayTaoBetween(LocalDate date1, LocalDate date2);

    HoaDonMua save(HoaDonMua hoaDonMua);

    boolean remove(int id);
}
