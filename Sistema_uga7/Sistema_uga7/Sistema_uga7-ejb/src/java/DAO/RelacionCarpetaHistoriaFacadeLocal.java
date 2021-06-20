

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.HidtoriaCarpeta;
import Modelo.RelacionCarpetaHistoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlos
 */
@Local
public interface RelacionCarpetaHistoriaFacadeLocal {

  public  void create(RelacionCarpetaHistoria relacionCarpetaHistoria);

  public  void edit(RelacionCarpetaHistoria relacionCarpetaHistoria);

  public  void remove(RelacionCarpetaHistoria relacionCarpetaHistoria);

  public  RelacionCarpetaHistoria find(Object id);

  public  List<RelacionCarpetaHistoria> findAll();

   public List<RelacionCarpetaHistoria> findRange(int[] range);

   public int count();
    List <RelacionCarpetaHistoria> buscar( int PCodigo,int idhistoriacarp) throws Exception; 
}


