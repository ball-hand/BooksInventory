/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zero
 */
public class model_barang {

    private String kode_barang;
    private String nama_barang;
    private Integer satuan;
    private long harga;
    private Integer stok;
    private model_jenis_barang jns_barang;

    public String getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public Integer getSatuan() {
        return satuan;
    }

    public void setSatuan(Integer satuan) {
        this.satuan = satuan;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    public model_jenis_barang getJns_barang() {
        return jns_barang;
    }

    public void setJns_barang(model_jenis_barang jns_barang) {
        this.jns_barang = jns_barang;
    }
    
}
