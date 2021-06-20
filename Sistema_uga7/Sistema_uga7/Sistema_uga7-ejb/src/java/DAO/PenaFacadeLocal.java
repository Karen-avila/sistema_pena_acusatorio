/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Pena;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface PenaFacadeLocal {

     public void create(Pena pena);

  public  void edit(Pena pena);

   public void remove(Pena pena);

   public Pena find(Object id);

   public List<Pena> findAll();

   public List<Pena> findRange(int[] range);

   public int count();
    
}
