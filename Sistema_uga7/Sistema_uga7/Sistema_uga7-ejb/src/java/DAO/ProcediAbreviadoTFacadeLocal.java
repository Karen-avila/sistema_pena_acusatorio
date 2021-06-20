/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ProcediAbreviadoT;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface ProcediAbreviadoTFacadeLocal {

   public void create(ProcediAbreviadoT procediAbreviadoT);

   public void edit(ProcediAbreviadoT procediAbreviadoT);

   public void remove(ProcediAbreviadoT procediAbreviadoT);

   public ProcediAbreviadoT find(Object id);

   public List<ProcediAbreviadoT> findAll();

    public List<ProcediAbreviadoT> findRange(int[] range);

   public int count();
    
}
