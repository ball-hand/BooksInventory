/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_detail_pemesanan;

/**
 *
 * @author zero
 */
public interface service_detPemesanan {
    void tambahData (model_detail_pemesanan mod_detPemesanan);
    void sumTotal (model_detail_pemesanan mod_detPemesanan);
    void hapusSementara (model_detail_pemesanan mod_detPemesanan);
    
    
    model_detail_pemesanan getById(String id);
    List<model_detail_pemesanan> getData();
}
