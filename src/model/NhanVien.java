/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
//maNV nvarchar(50) primary key,
//	tenNV nvarchar(50) ,
//	chucVu nvarchar(50) ,
//	email nvarchar(50) ,
//	soDienThoai varchar(10),
//	diaChi nvarchar(max) ,
//	gioiTinh bit , --0 :nam , 1:nữ
//	Luong money ,
//	namSinh date 
public class NhanVien {

    private String maNV;
    private String tenNV;
    private String chucVu;
    private String email;
    private String soDienThoai;
    private String diaChi;
    private boolean gioiTinh;
    private float luong;
    private String namSinh;
    private String matKhau;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, String chucVu, String email, String soDienThoai, String diaChi, boolean gioiTinh, float luong, String namSinh) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.chucVu = chucVu;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.luong = luong;
        this.namSinh = namSinh;
    }

    public NhanVien(String maNV, String tenNV, String chucVu, String email, String soDienThoai, String diaChi, boolean gioiTinh, float luong, String namSinh, String matKhau) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.chucVu = chucVu;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.luong = luong;
        this.namSinh = namSinh;
        this.matKhau = matKhau;
    }

    public NhanVien(String maNV) {
        this.maNV = maNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Object[] toDataRow() {
        return new Object[]{maNV, tenNV, chucVu, email, soDienThoai, diaChi, (gioiTinh == true ? "Nam" : "Nữ"), luong, namSinh, matKhau};
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", tenNV=" + tenNV + ", chucVu=" + chucVu + ", email=" + email + ", soDienThoai=" + soDienThoai + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + ", luong=" + luong + ", namSinh=" + namSinh + ", matKhau=" + matKhau + '}';
    }

}
