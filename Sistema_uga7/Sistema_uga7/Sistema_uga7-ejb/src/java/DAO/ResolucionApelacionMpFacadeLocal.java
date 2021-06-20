/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ResolucionApelacionMp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface ResolucionApelacionMpFacadeLocal {

    public void create(ResolucionApelacionMp resolucionApelacionMp);

   public void edit(ResolucionApelacionMp resolucionApelacionMp);

   public void remove(ResolucionApelacionMp resolucionApelacionMp);

   public ResolucionApelacionMp find(Object id);

   public List<ResolucionApelacionMp> findAll();

   public List<ResolucionApelacionMp> findRange(int[] range);

   public int count();
    
}
