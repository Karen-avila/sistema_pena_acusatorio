/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.DatosEspesificosV;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface DatosEspesificosVFacadeLocal {

    void create(DatosEspesificosV datosEspesificosV);

    void edit(DatosEspesificosV datosEspesificosV);

    void remove(DatosEspesificosV datosEspesificosV);

    DatosEspesificosV find(Object id);

    List<DatosEspesificosV> findAll();

    List<DatosEspesificosV> findRange(int[] range);

    int count();
    
}
