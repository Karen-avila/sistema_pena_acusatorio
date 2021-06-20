/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.TipoDeFallo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface TipoDeFalloFacadeLocal {

   public void create(TipoDeFallo tipoDeFallo);

   public void edit(TipoDeFallo tipoDeFallo);

   public void remove(TipoDeFallo tipoDeFallo);

  public  TipoDeFallo find(Object id);

  public  List<TipoDeFallo> findAll();

  public  List<TipoDeFallo> findRange(int[] range);

   public int count();
    
}
