/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.RelacionVI;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface RelacionVIFacadeLocal {

    void create(RelacionVI relacionVI);

    void edit(RelacionVI relacionVI);

    void remove(RelacionVI relacionVI);

    RelacionVI find(Object id);

    List<RelacionVI> findAll();

    List<RelacionVI> findRange(int[] range);

    int count();
    
}
