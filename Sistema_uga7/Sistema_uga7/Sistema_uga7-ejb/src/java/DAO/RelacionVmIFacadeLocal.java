/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.RelacionVmI;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface RelacionVmIFacadeLocal {

    void create(RelacionVmI relacionVmI);

    void edit(RelacionVmI relacionVmI);

    void remove(RelacionVmI relacionVmI);

    RelacionVmI find(Object id);

    List<RelacionVmI> findAll();

    List<RelacionVmI> findRange(int[] range);

    int count();
    
}
