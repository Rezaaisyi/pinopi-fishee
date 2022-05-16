package com.pam.mypets;

import com.google.gson.annotations.SerializedName;

public class Pets {

    @SerializedName("id")
    private int id;
    @SerializedName("varietas")
    private String varietas;
    @SerializedName("no_soliter")
    private String no_soliter;
    @SerializedName("is_aduan")
    private int is_aduan;
    @SerializedName("tgl_pembelian")
    private String tgl_pembelian;
    @SerializedName("harga_beli")
    private String harga_beli;
    @SerializedName("picture")
    private String picture;

    @SerializedName("love")
    private Boolean love;
    @SerializedName("value")
    private String value;
    @SerializedName("message")
    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVarietas() {
        return varietas;
    }

    public void setVarietas(String varietas) {
        this.varietas = varietas;
    }

    public String getNo_soliter() {
        return no_soliter;
    }

    public void setNo_soliter(String no_soliter) {
        this.no_soliter = no_soliter;
    }

    public int getIs_aduan() {
        return is_aduan;
    }

    public void setIs_aduan(int is_aduan) {
        this.is_aduan = is_aduan;
    }

    public String getTgl_pembelian() {
        return tgl_pembelian;
    }

    public void setTgl_pembelian(String tgl_pembelian) {
        this.tgl_pembelian = tgl_pembelian;
    }

    public String getHarga_beli() {
        return harga_beli;
    }

    public void setHarga_beli(String harga_beli) {
        this.harga_beli = harga_beli;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Boolean getLove() {
        return love;
    }

    public void setLove(Boolean love) {
        this.love = love;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
