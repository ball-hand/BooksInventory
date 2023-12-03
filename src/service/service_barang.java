/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;


import java.util.List;
import model.model_barang;

/**
 *
 * @author zero
 */
public interface service_barang {
    void tambahData(model_barang mobar);
    void perbaruiData(model_barang mobar);
    void hapusData(model_barang mobar);
    
    
    model_barang getById(String id);
    
    /**
     *
     * @return
     */
    List<model_barang> getData();
    List<model_barang> getData2();
    List<model_barang> pencarian(String id);
    List<model_barang> pencarian2(String id);
    
    String nomor();
    String nomor2();
    
    
}
