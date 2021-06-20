/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.EtapaIntermedia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface EtapaIntermediaFacadeLocal {

  public  void create(EtapaIntermedia etapaIntermedia);

   public void edit(EtapaIntermedia etapaIntermedia);

     public void remove(EtapaIntermedia etapaIntermedia);

 public   EtapaIntermedia find(Object id);

  public  List<EtapaIntermedia> findAll();

  public  List<EtapaIntermedia> findRange(int[] range);

  public  int count();
    
}
