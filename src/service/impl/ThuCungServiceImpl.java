/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.ThuCung;
import repository.ThuCungRepository;
import service.ThuCungService;

/**
 *
 * @author Ngo Duy Linh
 */
public class ThuCungServiceImpl implements ThuCungService {

    @Override
    public String add(ThuCung tc) {
        if (new ThuCungRepository().getOne(tc.getMaThuCung()) != null) {
            return "Mã nhân viên không tồn tại";
        }
        boolean check = new ThuCungRepository().add(tc);
        if (check) {
            return "Them Thanh Cong";
        } else {
            return "Them That Bai";
        }
    }

    @Override
    public List<ThuCung> getAll() {
        return new ThuCungRepository().getAll();
    }

    @Override
    public String updateTC(ThuCung tc, String maTC) {
        boolean check = new ThuCungRepository().update(tc, maTC);
        if (check) {
            return "Sửa Thanh Cong";
        } else {
            return "Sửa That Bai";
        }
    }

    @Override
    public String removeTC(String maTC) {
        boolean check = new ThuCungRepository().remove(maTC);
        if (check) {
            return "Xoá Thanh Cong";
        } else {
            return "Xoá That Bai";
        }
    }

    @Override
    public ThuCung getOne(String maTC) {
        return new ThuCungRepository().getOne(maTC);
    }

    @Override
    public List<ThuCung> getByMa(String maTC) {
        return new ThuCungRepository().getByMa(maTC);
    }

}
