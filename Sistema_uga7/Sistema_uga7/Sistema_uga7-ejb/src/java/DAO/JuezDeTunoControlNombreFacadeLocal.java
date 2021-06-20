/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.JuezDeTunoControlNombre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface JuezDeTunoControlNombreFacadeLocal {

    void create(JuezDeTunoControlNombre juezDeTunoControlNombre);

    void edit(JuezDeTunoControlNombre juezDeTunoControlNombre);

    void remove(JuezDeTunoControlNombre juezDeTunoControlNombre);

    JuezDeTunoControlNombre find(Object id);

    List<JuezDeTunoControlNombre> findAll();

    List<JuezDeTunoControlNombre> findRange(int[] range);

    int count();
    
}
