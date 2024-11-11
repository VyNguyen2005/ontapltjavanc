/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author nguye
 */
public class Sach {
    private int masach;
    private String tensach;
    private int dongia;
    private int macd;
    private int manxb;
    private String hinh;
    private Date ngaycapnhat;

    public Sach() {
    }

    public Sach(int masach, String tensach, int dongia, int macd, int manxb, String hinh, Date ngaycapnhat) {
        this.masach = masach;
        this.tensach = tensach;
        this.dongia = dongia;
        this.macd = macd;
        this.manxb = manxb;
        this.hinh = hinh;
        this.ngaycapnhat = ngaycapnhat;
    }

    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getMacd() {
        return macd;
    }

    public void setMacd(int macd) {
        this.macd = macd;
    }

    public int getManxb() {
        return manxb;
    }

    public void setManxb(int manxb) {
        this.manxb = manxb;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public Date getNgaycapnhat() {
        return ngaycapnhat;
    }

    public void setNgaycapnhat(Date ngaycapnhat) {
        this.ngaycapnhat = ngaycapnhat;
    }

    @Override
    public String toString() {
        return "Sach{" + "masach=" + masach + ", tensach=" + tensach + ", dongia=" + dongia + ", macd=" + macd + ", manxb=" + manxb + ", hinh=" + hinh + ", ngaycapnhat=" + ngaycapnhat + '}';
    }
    
}
