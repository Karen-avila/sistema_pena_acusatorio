/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Vempresaorg;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface VempresaorgFacadeLocal {

    void create(Vempresaorg vempresaorg);

    void edit(Vempresaorg vempresaorg);

    void remove(Vempresaorg vempresaorg);

    Vempresaorg find(Object id);

    List<Vempresaorg> findAll();

    List<Vempresaorg> findRange(int[] range);

    int count();
    
}
