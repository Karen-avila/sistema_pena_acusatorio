
package DAO;

import Modelo.Persona;
import java.util.List;
import javax.ejb.Local;


@Local
public interface PersonaFacadeLocal {

public    void create(Persona persona);

public    void edit(Persona persona);

public     void remove(Persona persona);

public     Persona find(Object id);

public     List<Persona> findAll();

public     List<Persona> findRange(int[] range);

public     int count();
    
}
