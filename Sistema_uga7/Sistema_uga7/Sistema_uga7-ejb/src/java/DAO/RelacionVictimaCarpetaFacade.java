/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.RelacionVictimaCarpeta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ANA
 */
@Stateless
public class RelacionVictimaCarpetaFacade extends AbstractFacade<RelacionVictimaCarpeta> implements RelacionVictimaCarpetaFacadeLocal {

    @PersistenceContext(unitName = "Sistema_uga7-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RelacionVictimaCarpetaFacade() {
        super(RelacionVictimaCarpeta.class);
    }
    
}
