/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_jenis_barang;


/**
 *
 * @author zero
 */
public interface service_jenisBarang {
   void tambahData (model_jenis_barang mod_jenis);
    void sumTotal (model_jenis_barang mod_jenis);
    void hapusSementara (model_jenis_barang mod_jenis);
    
    
    model_jenis_barang getById(String id);
    List<model_jenis_barang> getData();
    
    boolean validasiJB(model_jenis_barang mod_jenis);
}
