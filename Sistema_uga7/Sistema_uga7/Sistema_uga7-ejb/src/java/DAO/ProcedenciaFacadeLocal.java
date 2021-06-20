/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Procedencia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface ProcedenciaFacadeLocal {

  public  void create(Procedencia procedencia);

   public void edit(Procedencia procedencia);

   public void remove(Procedencia procedencia);

   public Procedencia find(Object id);

   public List<Procedencia> findAll();

   public List<Procedencia> findRange(int[] range);

   public int count();
    
}
