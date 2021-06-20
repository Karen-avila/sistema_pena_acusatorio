/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.VictimaP;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface VictimaPFacadeLocal {

    void create(VictimaP victimaP);

    void edit(VictimaP victimaP);

    void remove(VictimaP victimaP);

    VictimaP find(Object id);

    List<VictimaP> findAll();

    List<VictimaP> findRange(int[] range);

    int count();
    
}
