/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ResolucionApelacionMp;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ANA
 */
@Stateless
public class ResolucionApelacionMpFacade extends AbstractFacade<ResolucionApelacionMp> implements ResolucionApelacionMpFacadeLocal {

    @PersistenceContext(unitName = "Sistema_uga7-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ResolucionApelacionMpFacade() {
        super(ResolucionApelacionMp.class);
    }
    
}
