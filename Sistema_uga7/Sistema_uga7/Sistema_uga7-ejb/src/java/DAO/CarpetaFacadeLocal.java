/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Carpeta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface CarpetaFacadeLocal {

    public void create(Carpeta carpeta);

  public  void edit(Carpeta carpeta);

   public void remove(Carpeta carpeta);

   public Carpeta find(Object id);

   public List<Carpeta> findAll();

   public List<Carpeta> findRange(int[] range);

   public int count();
    
}
