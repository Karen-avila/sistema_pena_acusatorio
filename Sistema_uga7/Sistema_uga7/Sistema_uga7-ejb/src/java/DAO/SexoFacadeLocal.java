/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Sexo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface SexoFacadeLocal {

    void create(Sexo sexo);

    void edit(Sexo sexo);

    void remove(Sexo sexo);

    Sexo find(Object id);

    List<Sexo> findAll();

    List<Sexo> findRange(int[] range);

    int count();
    
}
