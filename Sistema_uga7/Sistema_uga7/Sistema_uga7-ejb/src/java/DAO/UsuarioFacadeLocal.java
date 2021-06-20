
package DAO;

import Modelo.Usuario;
import java.util.List;



@javax.ejb.Local
public interface UsuarioFacadeLocal {

  public  void create(Usuario usuario);

  public  void edit(Usuario usuario);

public    void remove(Usuario usuario);

  public  Usuario find(Object id);

 public   List<Usuario> findAll();

   public List<Usuario> findRange(int[] range);

   public int count();
      Usuario iniciarSesion (Usuario us);
}
