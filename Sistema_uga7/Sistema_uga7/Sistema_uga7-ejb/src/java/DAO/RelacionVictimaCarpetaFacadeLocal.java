/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.RelacionVictimaCarpeta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface RelacionVictimaCarpetaFacadeLocal {

    void create(RelacionVictimaCarpeta relacionVictimaCarpeta);

    void edit(RelacionVictimaCarpeta relacionVictimaCarpeta);

    void remove(RelacionVictimaCarpeta relacionVictimaCarpeta);

    RelacionVictimaCarpeta find(Object id);

    List<RelacionVictimaCarpeta> findAll();

    List<RelacionVictimaCarpeta> findRange(int[] range);

    int count();
    
}
