/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.HoaDon;
import model.HoaDonChiTiet;
import repository.HDCTRepository;
import repository.HoaDonRepository;
import service.HDCTService;

/**
 *
 * @author DELL
 */
public class HDCTServiceImpl implements HDCTService {

    private HDCTRepository hdctRepository = new HDCTRepository();
    private HoaDonRepository hdRepository = new HoaDonRepository();
   

    @Override
    public List<HoaDonChiTiet> getAll() {
        return hdctRepository.getAll();
    }

    @Override
    public String delete(String maHD) {
        if (hdctRepository.delete(maHD) && hdRepository.delete(maHD)) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }
//
//    @Override
//    public String update(HoaDonChiTiet hdct, String maHD, String maKH) {
//        boolean update = hdctRepository.update(hdct, maHD, maKH);
//        if (update) {
//            return "Update thành công";
//        } else {
//            return "Update thất bại";
//        }
//    }

    @Override
    public String add(HoaDonChiTiet hdct, HoaDon hd) {
        if (hdRepository.add(hd) && hdctRepository.add(hdct)) {
            return "Thành công";
        } else {
            return "Thất bại";
        }
    }

    @Override
    public List<HoaDonChiTiet> getByMaThuCung(String maThuCung) {
        return hdctRepository.getByMaThuCung(maThuCung);
    }

}
