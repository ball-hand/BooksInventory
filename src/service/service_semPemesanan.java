/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_semPemesanan;

/**
 *
 * @author zero
 */
public interface service_semPemesanan {
    void tambahData (model_semPemesanan mod_sem);
    void sumTotal (model_semPemesanan mod_sem);
    void hapusSementara (model_semPemesanan mod_sem);
    
    
    model_semPemesanan getById(String id);
    List<model_semPemesanan> getData();
}
