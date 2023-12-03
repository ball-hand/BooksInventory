/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zero
 */
public class model_detail_barang_keluar {
    private model_barang_keluar noKeluar;
    private long jml_keluar;
    private long subtotal_keluar;
    private model_barang brng;

    public model_barang_keluar getNoKeluar() {
        return noKeluar;
    }

    public void setNoKeluar(model_barang_keluar noKeluar) {
        this.noKeluar = noKeluar;
    }

    public long getJml_keluar() {
        return jml_keluar;
    }

    public void setJml_keluar(long jml_keluar) {
        this.jml_keluar = jml_keluar;
    }

    public long getSubtotal_keluar() {
        return subtotal_keluar;
    }

    public void setSubtotal_keluar(long subtotal_keluar) {
        this.subtotal_keluar = subtotal_keluar;
    }

    public model_barang getBrng() {
        return brng;
    }

    public void setBrng(model_barang brng) {
        this.brng = brng;
    }

    
}
