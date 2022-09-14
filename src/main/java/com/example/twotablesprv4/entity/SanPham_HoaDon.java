package com.example.twotablesprv4.entity;

import com.example.twotablesprv4.key.sanpham_hoadon_key;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "SanPham_HoaDon")
public class SanPham_HoaDon implements Serializable {

    @EmbeddedId
    private sanpham_hoadon_key id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @MapsId("sanPhamId") //// tên của khóa ngoại trong embeddedId
    @JoinColumn(name = "san_pham_id") //ten cua khoa ngoai trong db
    private SanPham sanPhamId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @MapsId("hoaDonMuaId")
    @JoinColumn(name = "hoa_don_mua_id")
    private HoaDonMua hoaDonMuaId;

    @Column(name = "so_luong", nullable = false)
    private int soLuong;
    //comment

}
