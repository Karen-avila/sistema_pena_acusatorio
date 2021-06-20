/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.DatosEspesificosDeImputado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface DatosEspesificosDeImputadoFacadeLocal {

   public void create(DatosEspesificosDeImputado datosEspesificosDeImputado);

   public void edit(DatosEspesificosDeImputado datosEspesificosDeImputado);

   public void remove(DatosEspesificosDeImputado datosEspesificosDeImputado);

    public DatosEspesificosDeImputado find(Object id);

     public List<DatosEspesificosDeImputado> findAll();

   public List<DatosEspesificosDeImputado> findRange(int[] range);

   public int count();
    
}
