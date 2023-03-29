/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.HoaDon;
import model.HoaDonChiTiet;
import model.KhachHang;
import model.NhanVien;
import model.ThuCung;

public class HDCTRepository {

    public List<HoaDonChiTiet> getAll() {
        String query = "SELECT dbo.HoaDon.maHoaDon, dbo.HoaDon.maKH, dbo.HoaDon.maNV, dbo.HoaDonChiTiet.maThuCung,\n"
                + "   dbo.HoaDon.ngayTao, dbo.HoaDon.trangThang, dbo.HoaDonChiTiet.soLuong, dbo.HoaDonChiTiet.donGia\n"
                + "        FROM     dbo.HoaDon INNER JOIN\n"
                + "                         dbo.HoaDonChiTiet ON dbo.HoaDon.maHoaDon = dbo.HoaDonChiTiet.maHoaDon";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<HoaDonChiTiet> listHDCT = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(2));
                ThuCung tc = new ThuCung(rs.getString(4), rs.getDouble(8));
                NhanVien nv = new NhanVien(rs.getString(3));
                HoaDon hoaDon = new HoaDon(rs.getString(1), kh, nv, rs.getString(5), rs.getString(6));
                HoaDonChiTiet hdct = new HoaDonChiTiet(tc, hoaDon, rs.getInt(7), rs.getDouble(8) * rs.getInt(7));
                listHDCT.add(hdct);
            }
            return listHDCT;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<HoaDonChiTiet> getByMaThuCung(String maThuCung) {
        String query = "SELECT dbo.HoaDon.maHoaDon, dbo.HoaDon.maKH, dbo.HoaDon.maNV, dbo.HoaDonChiTiet.maThuCung,\n"
                + "   dbo.HoaDon.ngayTao, dbo.HoaDon.trangThang, dbo.HoaDonChiTiet.soLuong, dbo.HoaDonChiTiet.donGia\n"
                + "        FROM     dbo.HoaDon INNER JOIN\n"
                + "                         dbo.HoaDonChiTiet ON dbo.HoaDon.maHoaDon = dbo.HoaDonChiTiet.maHoaDon WHERE maThuCung =? ";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<HoaDonChiTiet> listHDCT = new ArrayList<>();
            ps.setObject(1, maThuCung);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(2));
                ThuCung tc = new ThuCung(rs.getString(4), rs.getDouble(8));
                NhanVien nv = new NhanVien(rs.getString(3));
                HoaDon hoaDon = new HoaDon(rs.getString(1), kh, nv, rs.getString(5), rs.getString(6));
                HoaDonChiTiet hdct = new HoaDonChiTiet(tc, hoaDon, rs.getInt(7), rs.getDouble(8) * rs.getInt(7));
                listHDCT.add(hdct);
            }
            return listHDCT;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(HoaDonChiTiet hdct) {
        String query = "INSERT INTO [dbo].[HoaDonChiTiet]\n"
                + "           ([maThuCung]\n"
                + "           ,[maHoaDon]\n"
                + "           ,[soLuong]\n"
                + "           ,[donGia])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, hdct.getTc().getMaThuCung());
            ps.setObject(2, hdct.getMaHD().getMaHD());
            ps.setObject(3, hdct.getSoLuong());
            ps.setObject(4, hdct.getTc().getGiaBan());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String maHD) {
        String query = "DELETE FROM [dbo].[HoaDonChiTiet]\n"
                + "      WHERE [maHoaDon] = ?";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, maHD);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public static void main(String[] args) {

        System.out.println(new HDCTRepository().delete("HD002"));
    }
}
