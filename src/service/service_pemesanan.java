/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_pemesanan;


/**
 *
 * @author zero
 */
public interface service_pemesanan {
    void tambahData (model_pemesanan mod_Pemesanan);
    void sumTotal (model_pemesanan mod_Pemesanan);
    void hapusSementara (model_pemesanan mod_Pemesanan);
    
    
    model_pemesanan getById(String id);
    List<model_pemesanan> getData();
}
