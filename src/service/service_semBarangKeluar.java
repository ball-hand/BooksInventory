/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_semBarangKeluar;

/**
 *
 * @author zero
 */
public interface service_semBarangKeluar {
    
     void tambahData (model_semBarangKeluar mod_semBK);
    void sumTotal (model_semBarangKeluar mod_semBK);
    void hapusSementara (model_semBarangKeluar mod_semBK);
    
    
    model_semBarangKeluar getById(String id);
    List<model_semBarangKeluar> getData();
}
