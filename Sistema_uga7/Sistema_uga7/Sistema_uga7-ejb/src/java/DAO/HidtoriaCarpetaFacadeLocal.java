/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.HidtoriaCarpeta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface HidtoriaCarpetaFacadeLocal {

  public  void create(HidtoriaCarpeta hidtoriaCarpeta);

   public void edit(HidtoriaCarpeta hidtoriaCarpeta);

    public void remove(HidtoriaCarpeta hidtoriaCarpeta);

   public  HidtoriaCarpeta find(Object id);

  public  List<HidtoriaCarpeta> findAll();

  public  List<HidtoriaCarpeta> findRange(int[] range);
 
  public   int count();
   
}
