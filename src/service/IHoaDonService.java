/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.HoaDon;

/**
 *
 * @author Zoul
 */
public interface IHoaDonService {

    List<HoaDon> getAll();

    String add(HoaDon hd);

    String delete(String maHD);

    String update(String maHD, String trangThai);

    List<HoaDon> searchByMaKH(String maKH);

    List<HoaDon> searchByMaNV(String maNV);
}
