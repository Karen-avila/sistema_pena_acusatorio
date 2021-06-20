/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.RelacionCarpetaImputado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ANA
 */
@Stateless
public class RelacionCarpetaImputadoFacade extends AbstractFacade<RelacionCarpetaImputado> implements RelacionCarpetaImputadoFacadeLocal {

    @PersistenceContext(unitName = "Sistema_uga7-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RelacionCarpetaImputadoFacade() {
        super(RelacionCarpetaImputado.class);
    }
    
}
