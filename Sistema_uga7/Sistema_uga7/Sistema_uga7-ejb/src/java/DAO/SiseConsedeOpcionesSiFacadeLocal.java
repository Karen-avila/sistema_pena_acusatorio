/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.SiseConsedeOpcionesSi;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface SiseConsedeOpcionesSiFacadeLocal {

    public void create(SiseConsedeOpcionesSi siseConsedeOpcionesSi);

   public  void edit(SiseConsedeOpcionesSi siseConsedeOpcionesSi);

    public void remove(SiseConsedeOpcionesSi siseConsedeOpcionesSi);

    public SiseConsedeOpcionesSi find(Object id);

   public  List<SiseConsedeOpcionesSi> findAll();

   public List<SiseConsedeOpcionesSi> findRange(int[] range);

   public int count();
    
}
