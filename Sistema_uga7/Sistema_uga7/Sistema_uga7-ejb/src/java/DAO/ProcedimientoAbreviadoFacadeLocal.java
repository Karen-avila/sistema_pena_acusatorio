/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ProcedimientoAbreviado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface ProcedimientoAbreviadoFacadeLocal {

   public void create(ProcedimientoAbreviado procedimientoAbreviado);

   public void edit(ProcedimientoAbreviado procedimientoAbreviado);

  public  void remove(ProcedimientoAbreviado procedimientoAbreviado);

   public ProcedimientoAbreviado find(Object id);

   public List<ProcedimientoAbreviado> findAll();

  public  List<ProcedimientoAbreviado> findRange(int[] range);

   public int count();
    
}
