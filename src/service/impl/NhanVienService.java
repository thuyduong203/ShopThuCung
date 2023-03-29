/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.NhanVien;
import repository.NhanVienRepository;
import service.INhanVienService;

/**
 *
 * @author Admin
 */
public class NhanVienService implements INhanVienService {

    @Override
    public List<NhanVien> loadData(List<NhanVien> listNV) {
        listNV = new ArrayList<>();
        listNV = new NhanVienRepository().getAll();
        return listNV;
    }

    @Override
    public String addNV(NhanVien nv) {
        boolean kq = new NhanVienRepository().Add(nv);
        if (kq == true) {
            return "Thành công";
        } else {
            return "Thất bại";
        }
    }

    @Override
    public String updateNV(NhanVien nv, String maNV) {
        boolean kq = new NhanVienRepository().Update(nv, maNV);
        if (kq == true) {
            return "Thành công";
        } else {
            return "Thất bại";
        }
    }

    @Override
    public String removeNV(String maNV) {
        boolean kq = new NhanVienRepository().remove(maNV);
        if (kq == true) {
            return "Thành công";
        } else {
            return "Thất bại";
        }
    }

    @Override
    public List<NhanVien> searchByMa(String maNV) {
        List<NhanVien> listSearch = new ArrayList<>();
        listSearch = new NhanVienRepository().searchByMa(maNV);
        return listSearch;
    }

    @Override
    public List<NhanVien> searchByTen(String ten) {
        List<NhanVien> listSearch2 = new ArrayList<>();
        listSearch2 = new NhanVienRepository().searchByMa(ten);
        return listSearch2;
    }

    public static void main(String[] args) {
        List<NhanVien> listSearch = new ArrayList<>();
        String ten = "duy001";
        listSearch = new NhanVienService().searchByTen(ten);
        for (NhanVien nhanVien : listSearch) {
            System.out.println(nhanVien.toString());
        }
    }

    @Override
    public List<NhanVien> thuongNV() {
        return new NhanVienRepository().thuongNhanVien();
    }

    @Override
    public List<NhanVien> phatNV() {
        return new NhanVienRepository().phatNhanVien();
    }

    @Override
    public NhanVien getOne(String maNV) {
        return new NhanVienRepository().getOne(maNV);
    }

    @Override
    public List<NhanVien> getByMa(String maNV) {
        return new NhanVienRepository().getByMa(maNV);
    }

}
