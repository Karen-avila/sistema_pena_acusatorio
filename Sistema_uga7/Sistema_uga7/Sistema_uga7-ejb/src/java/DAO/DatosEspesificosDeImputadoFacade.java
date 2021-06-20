/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.DatosEspesificosDeImputado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ANA
 */
@Stateless
public class DatosEspesificosDeImputadoFacade extends AbstractFacade<DatosEspesificosDeImputado> implements DatosEspesificosDeImputadoFacadeLocal {

    @PersistenceContext(unitName = "Sistema_uga7-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DatosEspesificosDeImputadoFacade() {
        super(DatosEspesificosDeImputado.class);
    }
    
}
