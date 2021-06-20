/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.PuestaADisposicion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface PuestaADisposicionFacadeLocal {

 public   void create(PuestaADisposicion puestaADisposicion);

 public void edit(PuestaADisposicion puestaADisposicion);

  public  void remove(PuestaADisposicion puestaADisposicion);

   public PuestaADisposicion find(Object id);

   public List<PuestaADisposicion> findAll();

   public List<PuestaADisposicion> findRange(int[] range);

   public int count();
    
}
