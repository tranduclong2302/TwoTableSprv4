package com.example.twotablesprv4.repository;

import com.example.twotablesprv4.entity.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StorageRepository extends JpaRepository<ImageData, Integer> {
    Optional<ImageData> findByName(String name);
}
