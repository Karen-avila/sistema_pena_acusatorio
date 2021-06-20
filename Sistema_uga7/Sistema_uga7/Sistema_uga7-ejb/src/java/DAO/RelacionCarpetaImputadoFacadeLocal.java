/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.RelacionCarpetaImputado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface RelacionCarpetaImputadoFacadeLocal {

  public  void create(RelacionCarpetaImputado relacionCarpetaImputado);

   public void edit(RelacionCarpetaImputado relacionCarpetaImputado);

   public void remove(RelacionCarpetaImputado relacionCarpetaImputado);

   public RelacionCarpetaImputado find(Object id);

   public List<RelacionCarpetaImputado> findAll();

   public List<RelacionCarpetaImputado> findRange(int[] range);

    public int count();
    
}
