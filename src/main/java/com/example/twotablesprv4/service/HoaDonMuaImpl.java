package com.example.twotablesprv4.service;

import com.example.twotablesprv4.entity.HoaDonMua;
import com.example.twotablesprv4.repository.HoaDonMuaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class HoaDonMuaImpl implements IHoaDonMuaService {

    @Autowired
    private HoaDonMuaRepository hoaDonMuaRepository;

    @Override
    public HoaDonMua findById(int id) {
        return hoaDonMuaRepository.findById(id).get();
    }

    @Override
    public List<HoaDonMua> findAll() {
        return hoaDonMuaRepository.findAll();
    }

    @Override
    public List<HoaDonMua> findByNgayTao(LocalDate date) {
        return hoaDonMuaRepository.findByNgayTao(date);
    }

    @Override
    public List<HoaDonMua> findByNgayTaoBetween(LocalDate date1, LocalDate date2) {
        return hoaDonMuaRepository.findByNgayTaoBetween(date1, date2);
    }

    @Override
    public HoaDonMua save(HoaDonMua hoaDonMua) {
        return hoaDonMuaRepository.save(hoaDonMua);
    }

    @Override
    public boolean remove(int id) {
        HoaDonMua hoaDonMua = hoaDonMuaRepository.findById(id).get();
        if (hoaDonMua != null){
            hoaDonMuaRepository.delete(hoaDonMua);
            return true;
        }
        return false;
    }
}
