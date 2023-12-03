/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zero
 */
public class model_barang_masuk {
    private String no_masuk,tgl_masuk;
    private long total_masuk;
    private model_distributor idDistributor;
    private model_pengguna idPengguna;

    public String getNo_masuk() {
        return no_masuk;
    }

    public void setNo_masuk(String no_masuk) {
        this.no_masuk = no_masuk;
    }

    public String getTgl_masuk() {
        return tgl_masuk;
    }

    public void setTgl_masuk(String tgl_masuk) {
        this.tgl_masuk = tgl_masuk;
    }

    public long getTotal_masuk() {
        return total_masuk;
    }

    public void setTotal_masuk(long total_masuk) {
        this.total_masuk = total_masuk;
    }

    public model_distributor getIdDistributor() {
        return idDistributor;
    }

    public void setIdDistributor(model_distributor idDistributor) {
        this.idDistributor = idDistributor;
    }

    public model_pengguna getIdPengguna() {
        return idPengguna;
    }

    public void setIdPengguna(model_pengguna idPengguna) {
        this.idPengguna = idPengguna;
    }

}
