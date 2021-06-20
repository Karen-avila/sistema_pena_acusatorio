/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.FechaIntermedia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface FechaIntermediaFacadeLocal {

public    void create(FechaIntermedia fechaIntermedia);

  public  void edit(FechaIntermedia fechaIntermedia);

  public  void remove(FechaIntermedia fechaIntermedia);

  public  FechaIntermedia find(Object id);

   public  List<FechaIntermedia> findAll();

   public  List<FechaIntermedia> findRange(int[] range);

  public  int count();
    
}
