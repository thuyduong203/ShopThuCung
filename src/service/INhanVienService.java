/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.NhanVien;

/**
 *
 * @author Admin
 */
public interface INhanVienService {

    List<NhanVien> loadData(List<NhanVien> listNV);

    String addNV(NhanVien nv);

    String updateNV(NhanVien nv, String maNV);

    String removeNV(String maNV);

    List<NhanVien> searchByMa(String maNV);

    List<NhanVien> searchByTen(String ten);

    List<NhanVien> thuongNV();

    List<NhanVien> phatNV();

    NhanVien getOne(String maNV);

    List<NhanVien> getByMa(String maNV);
}
