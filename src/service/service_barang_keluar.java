/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_barang_keluar;

/**
 *
 * @author zero
 */
public interface service_barang_keluar {
    void tambahData(model_barang_keluar modKeluar);
    void perbaruiData(model_barang_keluar modKeluar);
    void hapusData(model_barang_keluar modKeluar);
    
    
    model_barang_keluar getById(String id);
    
    /**
     *
     * @return
     */
    List<model_barang_keluar> getData();
    List<model_barang_keluar> getData2();
    List<model_barang_keluar> pencarian(String id);
    List<model_barang_keluar> pencarian2(String id);
    
    String nomor();
    String nomor2();
    
}
