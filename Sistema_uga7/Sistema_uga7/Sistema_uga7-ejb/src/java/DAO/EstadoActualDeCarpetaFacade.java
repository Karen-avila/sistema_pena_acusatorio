
package DAO;

import Modelo.EstadoActualDeCarpeta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ANA
 */
@Stateless
public class EstadoActualDeCarpetaFacade extends AbstractFacade<EstadoActualDeCarpeta> implements EstadoActualDeCarpetaFacadeLocal {

    @PersistenceContext(unitName = "Sistema_uga7-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstadoActualDeCarpetaFacade() {
        super(EstadoActualDeCarpeta.class);
    }
    
}
