/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zero
 */
public class model_pemesanan {
    private String no_pesan,tgl_pesan;
    private long total_pesanan;
    private model_distributor idDistributor;
    private model_pengguna idPengguna;

    public String getNo_pesan() {
        return no_pesan;
    }

    public void setNo_pesan(String no_pesan) {
        this.no_pesan = no_pesan;
    }

    public String getTgl_pesan() {
        return tgl_pesan;
    }

    public void setTgl_pesan(String tgl_pesan) {
        this.tgl_pesan = tgl_pesan;
    }

    public long getTotal_pesanan() {
        return total_pesanan;
    }

    public void setTotal_pesanan(long total_pesanan) {
        this.total_pesanan = total_pesanan;
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
