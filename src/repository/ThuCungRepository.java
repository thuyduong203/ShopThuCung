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
import model.ThuCung;

/**
 *
 * @author Ngo Duy Linh
 */
public class ThuCungRepository {

    public List<ThuCung> getAll() {
        String query = "SELECT * From ThuCung";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<ThuCung> listGetAll = new ArrayList<>();
            while (rs.next()) {
                ThuCung tc = new ThuCung(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getBoolean(6));
                listGetAll.add(tc);
            }
            return listGetAll;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<ThuCung> getByMa(String maThuCung) {
        String query = "SELECT * From ThuCung WHERE maThuCung = ?";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, maThuCung);
            ResultSet rs = ps.executeQuery();
            List<ThuCung> listGetAll = new ArrayList<>();
            while (rs.next()) {
                ThuCung tc = new ThuCung(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getBoolean(6));
                listGetAll.add(tc);
            }
            return listGetAll;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ThuCung getOne(String maTC) {
        String query = "SELECT * From ThuCung WHERE maThuCung = ?";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, maTC);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new ThuCung(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getBoolean(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(ThuCung tc) {
        int check = 0;
        String query = "INSERT INTO [dbo].[ThuCung]\n"
                + "           ([maThuCung]\n"
                + "           ,[soLuong]\n"
                + "           ,[giongLoai]\n"
                + "           ,[mauLong]\n"
                + "           ,[gia]\n"
                + "           ,[gioiTinh])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, tc.getMaThuCung());
            ps.setObject(2, tc.getSoLuong());
            ps.setObject(3, tc.getGiongLoai());
            ps.setObject(4, tc.getMauLong());
            ps.setObject(5, tc.getGiaBan());
            ps.setObject(6, tc.isGioiTinh());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(ThuCung tc, String maTC) {
        int check = 0;
        String query = "UPDATE [dbo].[ThuCung]\n"
                + "   SET [maThuCung] = ?"
                + "      ,[soLuong] = ?"
                + "      ,[giongLoai] = ?"
                + "      ,[mauLong] = ?"
                + "      ,[gia] = ?"
                + "      ,[gioiTinh] = ?"
                + " WHERE maThuCung = ?";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, tc.getMaThuCung());
            ps.setObject(2, tc.getSoLuong());
            ps.setObject(3, tc.getGiongLoai());
            ps.setObject(4, tc.getMauLong());
            ps.setObject(5, tc.getGiaBan());
            ps.setObject(6, tc.isGioiTinh());
            ps.setObject(7, maTC);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean remove(String maTC) {
        int check = 0;
        String query = "DELETE FROM [dbo].[ThuCung]\n"
                + "      WHERE maThuCung=?";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, maTC);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }
}
