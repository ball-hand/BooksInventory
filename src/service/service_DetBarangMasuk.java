/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_detail_barang_masuk;

/**
 *
 * @author zero
 */
public interface service_DetBarangMasuk {
    void tambahData (model_detail_barang_masuk mod_detKeluar);
    void sumTotal (model_detail_barang_masuk mod_detKeluar);
    void hapusSementara (model_detail_barang_masuk mod_detKeluar);
    
    
    model_detail_barang_masuk getById(String id);
    List<model_detail_barang_masuk> getData();
    
}
