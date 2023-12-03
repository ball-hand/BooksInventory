/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zero
 */
public class model_detail_pemesanan {
    private String jml_pesan,status;
    private long subtotal_pesan;
    private model_pemesanan noPesan;
    private model_barang kdBArang;

    public String getJml_pesan() {
        return jml_pesan;
    }

    public void setJml_pesan(String jml_pesan) {
        this.jml_pesan = jml_pesan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getSubtotal_pesan() {
        return subtotal_pesan;
    }

    public void setSubtotal_pesan(long subtotal_pesan) {
        this.subtotal_pesan = subtotal_pesan;
    }

    public model_pemesanan getNoPesan() {
        return noPesan;
    }

    public void setNoPesan(model_pemesanan noPesan) {
        this.noPesan = noPesan;
    }

    public model_barang getKdBArang() {
        return kdBArang;
    }

    public void setKdBArang(model_barang kdBArang) {
        this.kdBArang = kdBArang;
    }
    
}
