/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Abogado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface AbogadoFacadeLocal {

   public void create(Abogado abogado);

   public void edit(Abogado abogado);

  public  void remove(Abogado abogado);

   public Abogado find(Object id);

    public List<Abogado> findAll();

   public List<Abogado> findRange(int[] range);

   public int count();
    
}
