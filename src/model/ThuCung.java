/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class ThuCung {

    private String maThuCung;
    private int soLuong;
    private String giongLoai;
    private String mauLong;
    private double giaBan;
    private boolean gioiTinh; // 1 :nam , 2:nữ

    public ThuCung() {
    }

    public ThuCung(String maThuCung, int soLuong, String giongLoai, String mauLong, double giaBan, boolean gioiTinh) {
        this.maThuCung = maThuCung;
        this.soLuong = soLuong;
        this.giongLoai = giongLoai;
        this.mauLong = mauLong;
        this.giaBan = giaBan;
        this.gioiTinh = gioiTinh;
    }

    public ThuCung(String maThuCung, double giaBan) {
        this.maThuCung = maThuCung;
        this.giaBan = giaBan;
    }

    public String getMaThuCung() {
        return maThuCung;
    }

    public void setMaThuCung(String maThuCung) {
        this.maThuCung = maThuCung;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getGiongLoai() {
        return giongLoai;
    }

    public void setGiongLoai(String giongLoai) {
        this.giongLoai = giongLoai;
    }

    public String getMauLong() {
        return mauLong;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "ThuCung{" + "maThuCung=" + maThuCung + ", soLuong=" + soLuong + ", giongLoai=" + giongLoai + ", mauLong=" + mauLong + ", giaBan=" + giaBan + ", gioiTinh=" + gioiTinh + '}';
    }

    public Object[] toDataRowThuCung() {
        return new Object[]{maThuCung, soLuong, giongLoai, mauLong, giaBan, gioiTinh == true ? "Đực" : "Cái"};
    }
}
