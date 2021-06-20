/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.UnidadDeGestion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface UnidadDeGestionFacadeLocal {

   public void create(UnidadDeGestion unidadDeGestion);

   public void edit(UnidadDeGestion unidadDeGestion);

   public void remove(UnidadDeGestion unidadDeGestion);

    public UnidadDeGestion find(Object id);

    public List<UnidadDeGestion> findAll();

    public List<UnidadDeGestion> findRange(int[] range);

    public int count();
    
}
