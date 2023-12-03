/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_detail_barang_keluar;

/**
 *
 * @author zero
 */
public interface service_DetBarangKeluar {
    void tambahData (model_detail_barang_keluar mod_detKeluar);
    void sumTotal (model_detail_barang_keluar mod_detKeluar);
    void hapusSementara (model_detail_barang_keluar mod_detKeluar);
    
    
    model_detail_barang_keluar getById(String id);
    List<model_detail_barang_keluar> getData();
    List<model_detail_barang_keluar> pencarian();
    
    boolean validasiStok(model_detail_barang_keluar mod_detKeluar);
    
    
    
}
