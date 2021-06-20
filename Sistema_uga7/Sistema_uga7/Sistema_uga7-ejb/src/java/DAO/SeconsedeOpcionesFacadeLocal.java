/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.SeconsedeOpciones;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface SeconsedeOpcionesFacadeLocal {

  public  void create(SeconsedeOpciones seconsedeOpciones);

   public void edit(SeconsedeOpciones seconsedeOpciones);

  public  void remove(SeconsedeOpciones seconsedeOpciones);

   public SeconsedeOpciones find(Object id);

    public List<SeconsedeOpciones> findAll();

   public List<SeconsedeOpciones> findRange(int[] range);

   public int count();
    
}
