/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class HoaDonChiTiet {

    private ThuCung tc;
    private HoaDon maHD;
    private int soLuong;
    private double tongTien;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(ThuCung tc, HoaDon maHD, int soLuong, double tongTien) {
        this.tc = tc;
        this.maHD = maHD;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
    }

    public HoaDonChiTiet(ThuCung tc, HoaDon maHD, int soLuong) {
        this.tc = tc;
        this.maHD = maHD;
        this.soLuong = soLuong;
    }

    public ThuCung getTc() {
        return tc;
    }

    public void setTc(ThuCung tc) {
        this.tc = tc;
    }

    public HoaDon getMaHD() {
        return maHD;
    }

    public void setMaHD(HoaDon maHD) {
        this.maHD = maHD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getTongTien() {
        return tc.getGiaBan() * soLuong;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "tc=" + tc + ", maHD=" + maHD + ", soLuong=" + soLuong + ", tongTien=" + tongTien + '}';
    }

    public Object[] toDataRow() {
        return new Object[]{maHD.getMaNV().getMaNV(), maHD.getMaKH().getMaKH(), tc.getMaThuCung(), maHD.getMaHD(), maHD.getNgayMua(), maHD.getTrangThai(), soLuong, tc.getGiaBan(), tongTien};
    }
}
