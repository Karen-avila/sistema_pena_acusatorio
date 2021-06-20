/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.RelacionVictimaeCarpeta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface RelacionVictimaeCarpetaFacadeLocal {

    void create(RelacionVictimaeCarpeta relacionVictimaeCarpeta);

    void edit(RelacionVictimaeCarpeta relacionVictimaeCarpeta);

    void remove(RelacionVictimaeCarpeta relacionVictimaeCarpeta);

    RelacionVictimaeCarpeta find(Object id);

    List<RelacionVictimaeCarpeta> findAll();

    List<RelacionVictimaeCarpeta> findRange(int[] range);

    int count();
    
}
