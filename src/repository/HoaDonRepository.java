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
import model.KhachHang;
import model.NhanVien;

/**
 *
 * @author Zoul
 */
public class HoaDonRepository {

    public List<HoaDon> getAll() {
        String query = "SELECT [maHoaDon]\n"
                + "      ,[maKH]\n"
                + "      ,[maNV]\n"
                + "      ,[ngayTao]\n"
                + "      ,[trangThang]\n"
                + "  FROM [dbo].[HoaDon]";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<HoaDon> listHD = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //  HoaDon hd = new HoaDon(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
                //  listHD.add(hd);
            }
            return listHD;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<HoaDon> searchByMaKH(String maKH) {
        String query = "SELECT [maHoaDon]\n"
                + "      ,[maKH]\n"
                + "      ,[maNV]\n"
                + "      ,[ngayTao]\n"
                + "      ,[trangThang]\n"
                + "  FROM [dbo].[HoaDon] WHERE maKH = ?";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, maKH);
            List<HoaDon> listHD = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString(3));
                KhachHang kh = new KhachHang(rs.getString(2));
                HoaDon hd = new HoaDon(rs.getString(1), kh, nv, rs.getString(4), rs.getString(5));
                listHD.add(hd);
            }
            return listHD;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<HoaDon> searchByMaNV(String maNV) {
        String query = "SELECT [maHoaDon]\n"
                + "      ,[maKH]\n"
                + "      ,[maNV]\n"
                + "      ,[ngayTao]\n"
                + "      ,[trangThang]\n"
                + "  FROM [dbo].[HoaDon] WHERE maNV = ?";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, maNV);
            List<HoaDon> listHD = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString(3));
                KhachHang kh = new KhachHang(rs.getString(2));
                HoaDon hd = new HoaDon(rs.getString(1), kh, nv, rs.getString(4), rs.getString(5));
                listHD.add(hd);
            }
            return listHD;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(HoaDon hd) {
        String query = "INSERT INTO [dbo].[HoaDon]\n"
                + "           ([maHoaDon]\n"
                + "           ,[maKH]\n"
                + "           ,[maNV]\n"
                + "           ,[ngayTao]\n"
                + "           ,[trangThang])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, hd.getMaHD());
            ps.setObject(2, hd.getMaKH().getMaKH());
            ps.setObject(3, hd.getMaNV().getMaNV());
            ps.setObject(4, hd.getNgayMua());
            ps.setObject(5, hd.getTrangThai());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String maHD) {
        String query = "DELETE FROM [dbo].[HoaDon]\n"
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

    public boolean update(String maHD, String trangThai) {
        String query = "UPDATE [dbo].[HoaDon]\n"
                + "   SET[trangThang] = ?\n"
                + " WHERE [maHoaDon] =?";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, trangThai);
            ps.setObject(2, maHD);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public static void main(String[] args) {

        System.out.println(new HoaDonRepository().update("HD001", "asdfgh"));
    }
}
