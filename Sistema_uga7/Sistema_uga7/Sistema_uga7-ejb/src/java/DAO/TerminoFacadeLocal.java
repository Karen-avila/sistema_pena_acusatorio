/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Termino;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface TerminoFacadeLocal {

   public void create(Termino termino);

    public void edit(Termino termino);

   public void remove(Termino termino);

   public Termino find(Object id);

   public List<Termino> findAll();

   public List<Termino> findRange(int[] range);

   public int count();
    
}
