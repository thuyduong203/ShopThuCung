/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.KhachHang;

/**
 *
 * @author FPT
 */
public interface KhachHangService {

    List<KhachHang> getAll();

    String add(KhachHang kh);

    String update(KhachHang kh, String ma);

    String delete(String ma);

    KhachHang getOne(String maKH);

    List<KhachHang> getByMa(String maKH);
}
