/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.HidtoriaCarpeta;
import Modelo.RelacionCarpetaHistoria;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ANA
 */
@Stateless
public class RelacionCarpetaHistoriaFacade extends AbstractFacade<RelacionCarpetaHistoria> implements RelacionCarpetaHistoriaFacadeLocal {

    @PersistenceContext(unitName = "Sistema_uga7-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RelacionCarpetaHistoriaFacade() {
        super(RelacionCarpetaHistoria.class);
    }

    @Override
    public List<RelacionCarpetaHistoria> buscar(int PCodigo, int idhistoriacarp) throws Exception {
       List<RelacionCarpetaHistoria> lista;
        try{
    String jpql= " FROM RelacionCarpetaHistoria p WHERE p.persona.codigoP=?1 and p.HidtoriaCarpeta.idhistoria=?2";
    Query query = em.createQuery(jpql);
    query.setParameter(1, PCodigo);
    query.setParameter(2, idhistoriacarp);
    lista = query.getResultList();
   } catch (Exception e){
       throw e;
   }
    return lista;
}

}
