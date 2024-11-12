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

/**
 *
 * @author nguye
 */
public class NhaXuatBanDAO {
    
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
    public ArrayList<NhaXuatBan> getAll(){
       ArrayList<NhaXuatBan> ds = new ArrayList<>();
       String sql = "select * from NhaXuatBan";
       conn = DbContext.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
               ds.add(new NhaXuatBan(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
        } catch (Exception e) {
            System.out.println("Loi: " +e.toString());
        }
        return ds;
    }
}
