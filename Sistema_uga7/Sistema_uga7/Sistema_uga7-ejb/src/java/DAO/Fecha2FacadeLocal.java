/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Fecha2;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface Fecha2FacadeLocal {

   public void create(Fecha2 fecha2);

   public void edit(Fecha2 fecha2);

   public void remove(Fecha2 fecha2);

   public Fecha2 find(Object id);

   public List<Fecha2> findAll();

   public List<Fecha2> findRange(int[] range);

    public int count();
    
}
