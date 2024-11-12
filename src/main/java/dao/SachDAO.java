/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DbContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.NhaXuatBan;
import model.Sach;

/**
 *
 * @author nguye
 */
public class SachDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public ArrayList<Sach> getTop6() {
        ArrayList<Sach> ds = new ArrayList<>();
        String sql = "select top 6 * from Sach order by tensach asc";
        conn = DbContext.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ds.add(new Sach(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getDate(7)));
            }
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return ds;
    }
    
    public ArrayList<Sach> getByCategory(int macd) {
        ArrayList<Sach> ds = new ArrayList<>();
        String sql = "select * from Sach where macd=?";
        conn = DbContext.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, macd);
            rs = ps.executeQuery();
            while (rs.next()) {
                ds.add(new Sach(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getDate(7)));
            }
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return ds;
    }
    
    public ArrayList<Sach> getByCategoryNXB(int manxb) {
        ArrayList<Sach> ds = new ArrayList<>();
        String sql = "select * from Sach where manxb=?";
        conn = DbContext.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, manxb);
            rs = ps.executeQuery();
            while (rs.next()) {
                ds.add(new Sach(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getDate(7)));
            }
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return ds;
    }
    
    
    
}
