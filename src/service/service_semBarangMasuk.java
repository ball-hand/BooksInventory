/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_semBarangMasuk;

/**
 *
 * @author zero
 */
public interface service_semBarangMasuk {
     void tambahData (model_semBarangMasuk mod_semBK);
    void sumTotal (model_semBarangMasuk mod_semBK);
    void hapusSementara (model_semBarangMasuk mod_semBK);
    
    
    model_semBarangMasuk getById(String id);
    List<model_semBarangMasuk> getData();
    
}
