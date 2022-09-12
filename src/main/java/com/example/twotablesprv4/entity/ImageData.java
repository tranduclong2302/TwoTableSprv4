package com.example.twotablesprv4.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ImageData")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ImageData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String type;
    @Lob //LOB hoặc Large OBject đề cập đến một kiểu dữ liệu có độ dài thay đổi để lưu trữ các đối tượng lớn.
    @Column(name = "image_data", length = 1000)
    private byte[] imageData;
}
