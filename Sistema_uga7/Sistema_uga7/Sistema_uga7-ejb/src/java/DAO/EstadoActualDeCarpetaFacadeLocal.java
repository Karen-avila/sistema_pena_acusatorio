/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.EstadoActualDeCarpeta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface EstadoActualDeCarpetaFacadeLocal {

   public void create(EstadoActualDeCarpeta estadoActualDeCarpeta);

   public void edit(EstadoActualDeCarpeta estadoActualDeCarpeta);

   public void remove(EstadoActualDeCarpeta estadoActualDeCarpeta);

   public EstadoActualDeCarpeta find(Object id);

   public List<EstadoActualDeCarpeta> findAll();

   public List<EstadoActualDeCarpeta> findRange(int[] range);

     public int count();
    
}
