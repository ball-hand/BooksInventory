/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_pengguna;


/**
 *
 * @author zero
 */
public interface service_pengguna {
    void tambahData(model_pengguna mod_pengguna);
    void perbaruiData(model_pengguna mod_pengguna);
    void hapusData(model_pengguna mod_pengguna);
    
    
    model_pengguna getById(String id);
    
    /**
     *
     * @return
     */
    List<model_pengguna> getData();
    List<model_pengguna> getData2();
    List<model_pengguna> pencarian(String id);
    List<model_pengguna> pencarian2(String id);
    
    String nomor();
    String nomor2();;
}
