/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ReparacionDelDaño;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface ReparacionDelDañoFacadeLocal {

   public void create(ReparacionDelDaño reparacionDelDaño);

   public void edit(ReparacionDelDaño reparacionDelDaño);

  public  void remove(ReparacionDelDaño reparacionDelDaño);

  public  ReparacionDelDaño find(Object id);

  public  List<ReparacionDelDaño> findAll();

  public  List<ReparacionDelDaño> findRange(int[] range);

 public   int count();
    
}
