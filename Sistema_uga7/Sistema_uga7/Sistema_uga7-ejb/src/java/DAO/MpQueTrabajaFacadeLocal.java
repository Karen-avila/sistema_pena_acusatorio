/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.MpQueTrabaja;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface MpQueTrabajaFacadeLocal {

    public void create(MpQueTrabaja mpQueTrabaja);

    public void edit(MpQueTrabaja mpQueTrabaja);

   public void remove(MpQueTrabaja mpQueTrabaja);

   public MpQueTrabaja find(Object id);

public    List<MpQueTrabaja> findAll();

  public  List<MpQueTrabaja> findRange(int[] range);

  public  int count();
    
}
