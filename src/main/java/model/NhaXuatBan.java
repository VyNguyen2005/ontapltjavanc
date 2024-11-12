/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nguye
 */
public class NhaXuatBan {
    private int manxb;
    private String tennxb;
    private String email;
    private String dienthoai;

    public NhaXuatBan() {
    }

    public NhaXuatBan(int manxb, String tennxb, String email, String dienthoai) {
        this.manxb = manxb;
        this.tennxb = tennxb;
        this.email = email;
        this.dienthoai = dienthoai;
    }

    public int getManxb() {
        return manxb;
    }

    public void setManxb(int manxb) {
        this.manxb = manxb;
    }

    public String getTennxb() {
        return tennxb;
    }

    public void setTennxb(String tennxb) {
        this.tennxb = tennxb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    @Override
    public String toString() {
        return "NhaXuatBan{" + "manxb=" + manxb + ", tennxb=" + tennxb + ", email=" + email + ", dienthoai=" + dienthoai + '}';
    }
    
}
