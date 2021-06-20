/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ModificaCarpetaUsuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ANA
 */
@Stateless
public class ModificaCarpetaUsuarioFacade extends AbstractFacade<ModificaCarpetaUsuario> implements ModificaCarpetaUsuarioFacadeLocal {

    @PersistenceContext(unitName = "Sistema_uga7-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ModificaCarpetaUsuarioFacade() {
        super(ModificaCarpetaUsuario.class);
    }
    
}
