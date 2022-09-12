package com.example.twotablesprv4.key;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class sanpham_hoadon_key implements Serializable {

    private int sanPhamId;

    private int hoaDonMuaId;
}
