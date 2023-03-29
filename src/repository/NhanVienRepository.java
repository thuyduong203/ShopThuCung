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
import model.NhanVien;

/**
 *
 * @author Admin
 */
public class NhanVienRepository {

    public List<NhanVien> getAll() {
        String query = "SELECT * From NhanVien";
        try ( Connection cnn = SQLServerConnection.getConnection();  PreparedStatement ps = cnn.prepareStatement(query);) {
            List<NhanVien> listNV = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listNV.add(new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getBoolean(7), rs.getFloat(8), rs.getString(9), rs.getString(10)));
            }
            return listNV;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<NhanVien> getByMa(String maNV) {
        String query = "SELECT * From NhanVien WHERE maNV = ?";
        try ( Connection cnn = SQLServerConnection.getConnection();  PreparedStatement ps = cnn.prepareStatement(query);) {
            List<NhanVien> listNV = new ArrayList<>();
            ps.setObject(1, maNV);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listNV.add(new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getBoolean(7), rs.getFloat(8), rs.getString(9), rs.getString(10)));
            }
            return listNV;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public NhanVien getOne(String maNV) {
        String query = "SELECT * From NhanVien WHERE maNV = ?";
        try ( Connection cnn = SQLServerConnection.getConnection();  PreparedStatement ps = cnn.prepareStatement(query);) {
            ps.setObject(1, maNV);
            List<NhanVien> listNV = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getBoolean(7), rs.getFloat(8), rs.getString(9), rs.getString(10));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<NhanVien> thuongNhanVien() {
        String query = "SELECT top 1 dbo.NhanVien.maNV, dbo.NhanVien.tenNV, dbo.NhanVien.chucVu, \n"
                + "			dbo.NhanVien.email, dbo.NhanVien.soDienThoai, dbo.NhanVien.diaChi, dbo.NhanVien.gioiTinh, \n"
                + "			dbo.NhanVien.Luong, dbo.NhanVien.namSinh, dbo.HoaDon.maKH\n"
                + "FROM		dbo.HoaDon INNER JOIN dbo.NhanVien ON dbo.HoaDon.maNV = dbo.NhanVien.maNV\n"
                + "GROUP By	dbo.NhanVien.maNV,dbo.NhanVien.tenNV, dbo.NhanVien.chucVu,\n"
                + "			dbo.NhanVien.email, dbo.NhanVien.soDienThoai, dbo.NhanVien.diaChi, dbo.NhanVien.gioiTinh,\n"
                + "			dbo.NhanVien.Luong, dbo.NhanVien.namSinh, dbo.HoaDon.maKH\n"
                + "HAVING ((COUNT(NhanVien.maNV)) >10)";
        try ( Connection cnn = SQLServerConnection.getConnection();  PreparedStatement ps = cnn.prepareStatement(query)) {
            List<NhanVien> nhanVien = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getBoolean(7), rs.getFloat(8), rs.getString(9));
                nhanVien.add(nv);
            }
            return nhanVien;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<NhanVien> phatNhanVien() {
        String query = "SELECT top 1 dbo.NhanVien.maNV, dbo.NhanVien.tenNV, dbo.NhanVien.chucVu, \n"
                + "			dbo.NhanVien.email, dbo.NhanVien.soDienThoai, dbo.NhanVien.diaChi, dbo.NhanVien.gioiTinh, \n"
                + "			dbo.NhanVien.Luong, dbo.NhanVien.namSinh, dbo.HoaDon.maKH\n"
                + "FROM		dbo.HoaDon INNER JOIN dbo.NhanVien ON dbo.HoaDon.maNV = dbo.NhanVien.maNV\n"
                + "GROUP By	dbo.NhanVien.maNV,dbo.NhanVien.tenNV, dbo.NhanVien.chucVu,\n"
                + "			dbo.NhanVien.email, dbo.NhanVien.soDienThoai, dbo.NhanVien.diaChi, dbo.NhanVien.gioiTinh,\n"
                + "			dbo.NhanVien.Luong, dbo.NhanVien.namSinh, dbo.HoaDon.maKH\n"
                + "HAVING ((COUNT(NhanVien.maNV)) <2)";
        try ( Connection cnn = SQLServerConnection.getConnection();  PreparedStatement ps = cnn.prepareStatement(query)) {
            List<NhanVien> nhanVien = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getBoolean(7), rs.getFloat(8), rs.getString(9));
                nhanVien.add(nv);
            }
            return nhanVien;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean Add(NhanVien nv) {
        String query = "INSERT INTO [dbo].[NhanVien]\n"
                + "           ([maNV]\n"
                + "           ,[tenNV]\n"
                + "           ,[chucVu]\n"
                + "           ,[email]\n"
                + "           ,[soDienThoai]\n"
                + "           ,[diaChi]\n"
                + "           ,[gioiTinh]\n"
                + "           ,[Luong]\n"
                + "           ,[namSinh]\n"
                + "           ,[matKhau])\n"
                + "     VALUES\n"
                + "           (?"
                + "           ,?"
                + "           ,?"
                + "           ,?"
                + "           ,?"
                + "           ,?"
                + "           ,?"
                + "           ,?"
                + "           ,?"
                + "           ,?)";
        int check = 0;
        try ( Connection cnn = SQLServerConnection.getConnection();  PreparedStatement ps = cnn.prepareStatement(query);) {
//            ResultSet rs = ps.executeQuery();
            ps.setObject(1, nv.getMaNV());
            ps.setObject(2, nv.getTenNV());
            ps.setObject(3, nv.getChucVu());
            ps.setObject(4, nv.getEmail());
            ps.setObject(5, nv.getSoDienThoai());
            ps.setObject(6, nv.getDiaChi());
            ps.setObject(7, nv.isGioiTinh());
            ps.setObject(8, nv.getLuong());
            ps.setObject(9, nv.getNamSinh());
            ps.setObject(10, nv.getMatKhau());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean Update(NhanVien nv, String maNV) {
        String query = "UPDATE [dbo].[NhanVien]\n"
                + "   SET [maNV] = ?"
                + "      ,[tenNV] = ?"
                + "      ,[chucVu] = ?"
                + "      ,[email] = ?"
                + "      ,[soDienThoai] = ?"
                + "      ,[diaChi] = ?"
                + "      ,[gioiTinh] = ?"
                + "      ,[Luong] = ?"
                + "      ,[namSinh] = ?"
                + "      ,[matKhau] = ?"
                + " WHERE maNV=?";
        int check = 0;
        try ( Connection cnn = SQLServerConnection.getConnection();  PreparedStatement ps = cnn.prepareStatement(query);) {
//            ResultSet rs = ps.executeQuery();
            ps.setObject(1, nv.getMaNV());
            ps.setObject(2, nv.getTenNV());
            ps.setObject(3, nv.getChucVu());
            ps.setObject(4, nv.getEmail());
            ps.setObject(5, nv.getSoDienThoai());
            ps.setObject(6, nv.getDiaChi());
            ps.setObject(7, nv.isGioiTinh());
            ps.setObject(8, nv.getLuong());
            ps.setObject(9, nv.getNamSinh());
            ps.setObject(10, nv.getMatKhau());
            ps.setObject(11, maNV);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean remove(String maNV) {
        String query = "DELETE FROM [dbo].[NhanVien]\n"
                + "      WHERE maNV=?";
        int check = 0;
        try ( Connection cnn = SQLServerConnection.getConnection();  PreparedStatement ps = cnn.prepareStatement(query);) {
//            ResultSet rs = ps.executeQuery();
            ps.setObject(1, maNV);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public List<NhanVien> searchByMa(String maNV) {
        String query = "SELECT * From NhanVien where maNV=?";
        try ( Connection cnn = SQLServerConnection.getConnection();  PreparedStatement ps = cnn.prepareStatement(query);) {
            List<NhanVien> listNV = new ArrayList<>();
            ps.setObject(1, maNV);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listNV.add(new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getBoolean(7), rs.getFloat(8), rs.getString(9), rs.getString(10)));
            }
            return listNV;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<NhanVien> searchByTen(String ten) {
        String query = "SELECT * From NhanVien where tenNV = ?";
        try ( Connection cnn = SQLServerConnection.getConnection();  PreparedStatement ps = cnn.prepareStatement(query);) {
            List<NhanVien> listNV = new ArrayList<>();
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listNV.add(new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getBoolean(7), rs.getFloat(8), rs.getString(9), rs.getString(10)));
            }
            return listNV;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        List<NhanVien> listNV = new NhanVienRepository().searchByTen("duy001");
        for (NhanVien nhanVien : listNV) {
            System.out.println(nhanVien.toString());
        }

    }
}
