package com.example.bai_kt1;

public class BongDa {
    private String Ten;
    private String MoTa;
    private String QuocGia;
    private String NgheDanh;
    private int Hinh;

    public BongDa(String ten, String moTa, String quocGia, String ngheDanh, int hinh) {
        Ten = ten;
        MoTa = moTa;
        QuocGia = quocGia;
        NgheDanh = ngheDanh;
        Hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String quocGia) {
        QuocGia = quocGia;
    }

    public String getNgheDanh() {
        return NgheDanh;
    }

    public void setNgheDanh(String ngheDanh) {
        NgheDanh = ngheDanh;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
