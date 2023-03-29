package model;

public class KhachHang {

    private String maKH;
    private String tenKH;
    private String diaChi;
    private boolean gioiTinh;
    private String SDT;
    private String email;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, String diaChi, boolean gioiTinh, String SDT, String email) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.SDT = SDT;
        this.email = email;
    }

    public KhachHang(String maKH) {
        this.maKH = maKH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
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

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object[] toDataRow() {
        return new Object[]{
            maKH, tenKH, gioiTinh == true ? "Nam" : "Nữ", SDT, email, diaChi
        };
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", tenKH=" + tenKH + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + ", SDT=" + SDT + ", email=" + email + '}';
    }

}
