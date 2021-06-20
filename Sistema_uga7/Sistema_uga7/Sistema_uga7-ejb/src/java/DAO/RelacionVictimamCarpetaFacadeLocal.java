/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.RelacionVictimamCarpeta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface RelacionVictimamCarpetaFacadeLocal {

    void create(RelacionVictimamCarpeta relacionVictimamCarpeta);

    void edit(RelacionVictimamCarpeta relacionVictimamCarpeta);

    void remove(RelacionVictimamCarpeta relacionVictimamCarpeta);

    RelacionVictimamCarpeta find(Object id);

    List<RelacionVictimamCarpeta> findAll();

    List<RelacionVictimamCarpeta> findRange(int[] range);

    int count();
    
}
