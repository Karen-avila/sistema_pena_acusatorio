/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.SiseConsedeOpcionesSi;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ANA
 */
@Stateless
public class SiseConsedeOpcionesSiFacade extends AbstractFacade<SiseConsedeOpcionesSi> implements SiseConsedeOpcionesSiFacadeLocal {

    @PersistenceContext(unitName = "Sistema_uga7-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SiseConsedeOpcionesSiFacade() {
        super(SiseConsedeOpcionesSi.class);
    }
    
}
