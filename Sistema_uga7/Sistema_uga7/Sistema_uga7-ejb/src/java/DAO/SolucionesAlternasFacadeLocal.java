/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.SolucionesAlternas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface SolucionesAlternasFacadeLocal {

   public void create(SolucionesAlternas solucionesAlternas);

    public void edit(SolucionesAlternas solucionesAlternas);

   public void remove(SolucionesAlternas solucionesAlternas);

   public SolucionesAlternas find(Object id);

   public List<SolucionesAlternas> findAll();

   public List<SolucionesAlternas> findRange(int[] range);

   public int count();
    
}
