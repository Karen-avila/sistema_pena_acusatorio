/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ComboCSD;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface ComboCSDFacadeLocal {

   public void create(ComboCSD comboCSD);

   public void edit(ComboCSD comboCSD);

   public void remove(ComboCSD comboCSD);

    public ComboCSD find(Object id);

   public List<ComboCSD> findAll();

  public  List<ComboCSD> findRange(int[] range);

  public  int count();
    
}
