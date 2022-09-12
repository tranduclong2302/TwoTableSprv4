package com.example.twotablesprv4.service;

import com.example.twotablesprv4.entity.ThuongHieu;

import java.util.List;

public interface IThuongHieuService {
    ThuongHieu save(ThuongHieu thuongHieu);

    ThuongHieu findById(int id);

    List<ThuongHieu> getAll();

    boolean remove(int id);

    ThuongHieu update(int id, ThuongHieu thuongHieu);
}
