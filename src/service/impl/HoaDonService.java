/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.HoaDon;
import repository.HoaDonRepository;
import service.IHoaDonService;

/**
 *
 * @author Zoul
 */
public class HoaDonService implements IHoaDonService {

    private HoaDonRepository repository = new HoaDonRepository();

    @Override
    public List<HoaDon> getAll() {
        return repository.getAll();
    }

    @Override
    public String add(HoaDon hd) {
        boolean add = repository.add(hd);
        if (add = true) {
            return "Add thành công";
        } else {
            return "Add thất bại";
        }
    }

    @Override
    public String delete(String maHD) {
        boolean delete = repository.delete(maHD);
        if (delete = true) {
            return "Delete thành công";
        } else {
            return "Delete thất bại";
        }
    }

    @Override
    public String update(String maHD, String trangThai) {
        boolean update = repository.update(maHD, trangThai);
        if (update = true) {
            return "Update thành công";
        } else {
            return "Update thất bại";
        }
    }

    @Override
    public List<HoaDon> searchByMaKH(String maKH) {
        return repository.searchByMaKH(maKH);
    }

    @Override
    public List<HoaDon> searchByMaNV(String maNV) {
        return repository.searchByMaNV(maNV);
    }
}
