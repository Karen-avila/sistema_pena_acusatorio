
package vista;

import DAO.PersonaFacadeLocal;
import Modelo.Persona;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;


@Named(value = "personaBean")
@SessionScoped
public class personaBean implements Serializable {

   @EJB
    private PersonaFacadeLocal personaFacade;
    
    private Persona persona;
    private List<Persona> lista;
  

    public List<Persona> getLista() {
        lista= personaFacade.findAll();
        return lista;
    }

    public void setLista(List<Persona> lista) {
        this.lista = lista;
    }
    
    
    
    public personaBean() {
    }
    
}
