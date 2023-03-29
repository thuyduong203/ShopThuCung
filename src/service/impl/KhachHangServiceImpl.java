/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.KhachHang;
import repository.KhachHangRepository;
import service.KhachHangService;

/**
 *
 * @author FPT
 */
public class KhachHangServiceImpl implements KhachHangService {

    private KhachHangRepository khachHangRepository = new KhachHangRepository();

    @Override
    public List<KhachHang> getAll() {
        return khachHangRepository.getAll();
    }

    @Override
    public String add(KhachHang kh) {
        boolean add = khachHangRepository.add(kh);
        if (add) {
            return "Add thành công";
        } else {
            return "Add không thành công";
        }
    }

    @Override
    public String update(KhachHang kh, String ma) {
        boolean update = khachHangRepository.update(kh, ma);
        if (update) {
            return "Sửa thành công";
        } else {
            return "Sửa không thành công";
        }
    }

    @Override
    public String delete(String ma) {
        boolean delete = khachHangRepository.delete(ma);
        if (delete) {
            return "Xóa thành công";
        } else {
            return "Xóa không thành công";
        }
    }

    @Override
    public KhachHang getOne(String maKH) {
        return khachHangRepository.getOne(maKH);
    }

    @Override
    public List<KhachHang> getByMa(String maKH) {
        return khachHangRepository.getByMa(maKH);
    }

}
