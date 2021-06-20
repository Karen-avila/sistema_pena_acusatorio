/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ModificaCarpetaUsuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANA
 */
@Local
public interface ModificaCarpetaUsuarioFacadeLocal {

    void create(ModificaCarpetaUsuario modificaCarpetaUsuario);

    void edit(ModificaCarpetaUsuario modificaCarpetaUsuario);

    void remove(ModificaCarpetaUsuario modificaCarpetaUsuario);

    ModificaCarpetaUsuario find(Object id);

    List<ModificaCarpetaUsuario> findAll();

    List<ModificaCarpetaUsuario> findRange(int[] range);

    int count();
    
}
