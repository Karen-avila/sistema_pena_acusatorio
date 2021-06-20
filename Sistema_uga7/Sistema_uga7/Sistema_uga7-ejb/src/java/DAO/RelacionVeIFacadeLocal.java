/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.RelacionVeI;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface RelacionVeIFacadeLocal {

    void create(RelacionVeI relacionVeI);

    void edit(RelacionVeI relacionVeI);

    void remove(RelacionVeI relacionVeI);

    RelacionVeI find(Object id);

    List<RelacionVeI> findAll();

    List<RelacionVeI> findRange(int[] range);

    int count();
    
}
