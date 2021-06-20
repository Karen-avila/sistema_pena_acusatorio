/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.RelacionCarpetaJuez;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface RelacionCarpetaJuezFacadeLocal {

    void create(RelacionCarpetaJuez relacionCarpetaJuez);

    void edit(RelacionCarpetaJuez relacionCarpetaJuez);

    void remove(RelacionCarpetaJuez relacionCarpetaJuez);

    RelacionCarpetaJuez find(Object id);

    List<RelacionCarpetaJuez> findAll();

    List<RelacionCarpetaJuez> findRange(int[] range);

    int count();
    
}
