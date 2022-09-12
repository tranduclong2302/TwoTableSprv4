package com.example.twotablesprv4.repository;

import com.example.twotablesprv4.entity.HoaDonMua;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface HoaDonMuaRepository extends JpaRepository<HoaDonMua, Integer> {
    List<HoaDonMua> findByNgayTao(LocalDate date);

    List<HoaDonMua> findByNgayTaoBetween(LocalDate date1, LocalDate date2);
}
