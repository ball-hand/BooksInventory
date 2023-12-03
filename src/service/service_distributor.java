/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_distributor;

/**
 *
 * @author zero
 */
public interface service_distributor {
    void tambahData(model_distributor mod_dist);
    void perbaruiData(model_distributor mod_dist);
    void hapusData(model_distributor mod_dist);
    
    model_distributor getById(String id);
    List<model_distributor>getData();
    List<model_distributor>pencarian();
    
    String nomor();
}
