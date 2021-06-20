/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Imputado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface ImputadoFacadeLocal {

    void create(Imputado imputado);

    void edit(Imputado imputado);

    void remove(Imputado imputado);

    Imputado find(Object id);

    List<Imputado> findAll();

    List<Imputado> findRange(int[] range);

    int count();
    
}
