/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.CalificacionDH;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface CalificacionDHFacadeLocal {

    public void create(CalificacionDH calificacionDH);

   public  void edit(CalificacionDH calificacionDH);

  public  void remove(CalificacionDH calificacionDH);

  public  CalificacionDH find(Object id);

  public  List<CalificacionDH> findAll();

   public List<CalificacionDH> findRange(int[] range);

  public  int count();
    
}
