/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.HoaDon;
import model.HoaDonChiTiet;

/**
 *
 * @author DELL
 */
public interface HDCTService {

    List<HoaDonChiTiet> getAll();

    String add(HoaDonChiTiet hdct, HoaDon hd);

    String delete(String maHD);

    List<HoaDonChiTiet> getByMaThuCung(String maThuCung);
//    String update(HoaDonChiTiet hdct, String maHD, String maKH);
}
