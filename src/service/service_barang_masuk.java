/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_barang_masuk;

/**
 *
 * @author zero
 */
public interface service_barang_masuk {
    void tambahData(model_barang_masuk modMasuk);
    void perbaruiData(model_barang_masuk modMasuk);
    void hapusData(model_barang_masuk modMasuk);
    
    void perbaruiStatus(String kode_barang);
    
    
    model_barang_masuk getById(String id);
    
    /**
     *
     * @return
     */
    List<model_barang_masuk> getData();
    List<model_barang_masuk> getData2();
    List<model_barang_masuk> pencarian(String id);
    List<model_barang_masuk> pencarian2(String id);
    
    String nomor();
    String nomor2();
}
