/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class HoaDon {

    private String maHD;
    private KhachHang maKH;
    private NhanVien maNV;
    private String ngayMua;
    private String trangThai;

    public HoaDon() {
    }

    public HoaDon(String maHD) {
        this.maHD = maHD;
    }

    public HoaDon(String maHD, String trangThai) {
        this.maHD = maHD;
        this.trangThai = trangThai;
    }

    public HoaDon(String maHD, KhachHang maKH, NhanVien maNV, String ngayMua, String trangThai) {
        this.maHD = maHD;
        this.maKH = maKH;
        this.maNV = maNV;
        this.ngayMua = ngayMua;
        this.trangThai = trangThai;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public KhachHang getMaKH() {
        return maKH;
    }

    public void setMaKH(KhachHang maKH) {
        this.maKH = maKH;
    }

    public NhanVien getMaNV() {
        return maNV;
    }

    public void setMaNV(NhanVien maNV) {
        this.maNV = maNV;
    }

    public String getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(String ngayMua) {
        this.ngayMua = ngayMua;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "maHD=" + maHD + ", maKH=" + maKH + ", maNV=" + maNV + ", ngayMua=" + ngayMua + ", trangThai=" + trangThai + '}';
    }

    public Object[] toDataRow() {
        return new Object[]{maHD, maKH.getMaKH(), maNV.getMaNV(), ngayMua, trangThai};
    }
}
