/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;
import model.KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author FPT
 */
public class KhachHangRepository {

    public List<KhachHang> getAll() {
        String query = "SELECT [maKH],[tenKH],[soDT],[email],[diaChi],[gioiTinh]FROM [dbo].[KhachHang]";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            List<KhachHang> lists = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lists.add(new KhachHang(rs.getString(1), rs.getString(2), rs.getString(5), rs.getBoolean(6), rs.getString(3), rs.getString(4)));
            }
            return lists;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<KhachHang> getByMa(String maKH) {
        String query = "SELECT [maKH],[tenKH],[soDT],[email],[diaChi],[gioiTinh]FROM [dbo].[KhachHang] WHERE maKH = ?";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            List<KhachHang> lists = new ArrayList<>();
            ps.setObject(1, maKH);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lists.add(new KhachHang(rs.getString(1), rs.getString(2), rs.getString(5), rs.getBoolean(6), rs.getString(3), rs.getString(4)));
            }
            return lists;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public KhachHang getOne(String maKH) {
        String query = "SELECT [maKH],[tenKH],[soDT],[email],[diaChi],[gioiTinh]FROM [dbo].[KhachHang] WHERE maKH = ?";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(0, maKH);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new KhachHang(rs.getString(1), rs.getString(2), rs.getString(5), rs.getBoolean(6), rs.getString(3), rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(KhachHang kh) {
        String query = "INSERT INTO [dbo].[KhachHang]([maKH],[tenKH],[soDT],[email],[diaChi],[gioiTinh]) VALUES (?, ?, ?, ?, ?, ?)";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, kh.getMaKH());
            ps.setObject(2, kh.getTenKH());
            ps.setObject(3, kh.getSDT());
            ps.setObject(4, kh.getEmail());
            ps.setObject(5, kh.getDiaChi());
            ps.setObject(6, kh.isGioiTinh());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(KhachHang kh, String ma) {
        String query = "UPDATE [dbo].[KhachHang]SET [tenKH] = ?,[soDT] = ?,[email] = ?,[diaChi] = ?,[gioiTinh] = ? WHERE [maKH] = ?";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, kh.getTenKH());
            ps.setObject(2, kh.getSDT());
            ps.setObject(3, kh.getEmail());
            ps.setObject(4, kh.getDiaChi());
            ps.setObject(5, kh.isGioiTinh());
            ps.setObject(6, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[KhachHang] WHERE [maKH] = ?";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public static void main(String[] args) {
        boolean delete = new KhachHangRepository().delete("2");
        System.out.println(delete);
    }
}
