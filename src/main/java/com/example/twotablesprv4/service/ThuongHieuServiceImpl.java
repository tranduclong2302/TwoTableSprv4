package com.example.twotablesprv4.service;

import com.example.twotablesprv4.entity.ThuongHieu;
import com.example.twotablesprv4.repository.ThuongHieuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThuongHieuServiceImpl implements IThuongHieuService {

    @Autowired
    private ThuongHieuRepository thuongHieuRespository;

    @Override
    public ThuongHieu save(ThuongHieu thuongHieu) {
        return thuongHieuRespository.save(thuongHieu);
    }

    @Override
    public ThuongHieu findById(int id) {
        return thuongHieuRespository.findById(id).get();
    }

    @Override
    public List<ThuongHieu> getAll() {
        return thuongHieuRespository.findAll();
    }

    @Override
    public boolean remove(int id) {
        if (id >= 1){
            ThuongHieu thuongHieu = thuongHieuRespository.findById(id).get();
            thuongHieuRespository.delete(thuongHieu);
            return true;
        }
        return false;
    }

    @Override
    public ThuongHieu update(int id, ThuongHieu thuongHieu) {
        ThuongHieu thuongHieu1 = thuongHieuRespository.findById(id).get();
        if (thuongHieu1 != null){
            thuongHieu1.setTenThuongHieu(thuongHieu.getTenThuongHieu());
            return thuongHieuRespository.save(thuongHieu1);
        }
        return null;
    }
}
