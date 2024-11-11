/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nguye
 */
public class ChuDe {
    private int macd;
    private String tencd;

    public ChuDe() {
    }

    public ChuDe(int macd, String tencd) {
        this.macd = macd;
        this.tencd = tencd;
    }

    public int getMacd() {
        return macd;
    }

    public void setMacd(int macd) {
        this.macd = macd;
    }

    public String getTencd() {
        return tencd;
    }

    public void setTencd(String tencd) {
        this.tencd = tencd;
    }

    @Override
    public String toString() {
        return "ChuDe{" + "macd=" + macd + ", tencd=" + tencd + '}';
    }
    
}
