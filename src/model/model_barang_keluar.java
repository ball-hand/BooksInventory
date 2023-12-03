/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zero
 */
public class model_barang_keluar {
    private String no_keluar;
    private String tgl_keluar;
    private model_pengguna pengguna_id;

    public String getNo_keluar() {
        return no_keluar;
    }

    public void setNo_keluar(String no_keluar) {
        this.no_keluar = no_keluar;
    }

    public String getTgl_keluar() {
        return tgl_keluar;
    }

    public void setTgl_keluar(String tgl_keluar) {
        this.tgl_keluar = tgl_keluar;
    }

    public model_pengguna getPengguna_id() {
        return pengguna_id;
    }

    public void setPengguna_id(model_pengguna pengguna_id) {
        this.pengguna_id = pengguna_id;
    }
}
