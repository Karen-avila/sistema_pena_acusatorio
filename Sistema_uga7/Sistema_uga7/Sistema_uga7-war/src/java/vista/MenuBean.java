
package vista;



import DAO.MenuFacadeLocal;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import Modelo.Menu;
import Modelo.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

@Named

@SessionScoped
public class MenuBean implements Serializable{
    
     @EJB
     private MenuFacadeLocal EJBMenu;
     private List <Menu> lista;
     private MenuModel model;
     
     
     @PostConstruct
     public void init(){
     this.listarMenus();
     model = new DefaultMenuModel();
     this.establecerPermisos();
     
     }
     
     
     
     
     
     
     public void listarMenus(){
         try{
            lista=EJBMenu.findAll();
         }catch(Exception e){
             //mensaje jsf
         }
         
  
     }

    public MenuModel getModel() {
        return model;
    }

    public void setModel(MenuModel model) {
        this.model = model;
    }
    
    
     
     
     
     public void establecerPermisos(){
     Usuario us = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
     
     for(Menu m: lista){
          if(m.getTipo().equals("S")&&m.getTipoUsuario().equals(us.getTipo()))
          {
                    DefaultSubMenu firstSubmenu = new DefaultSubMenu(m.getNombre());
                   
               for(Menu i:lista){
          
                   Menu submenu = i.getSubmenu();
                     if(submenu !=null){
                         if(submenu.getCodigo()==m.getCodigo()){
                             DefaultMenuItem item = new DefaultMenuItem(i.getNombre());
                             
                                  item.setCommand(i.getUrl());
                    // item.setUrl(i.getUrl());
                           
                             firstSubmenu.addElement(item);
                            }
                      }
                 }
              model.addElement(firstSubmenu);
            }  
          else{
                    if(m.getSubmenu()==null && m.getTipoUsuario().equals(us.getTipo())){
                             DefaultMenuItem item = new DefaultMenuItem(m.getNombre());
                             item.setUrl(m.getUrl());
                             model.addElement(item);
                     }
      
              }
       }
         //codigo para meter el boton de cerrar sesion antes de cargarlo al menubar
        //     DefaultMenuItem item = new DefaultMenuItem("Cerrar ses??n");
          //            item.setIcon("ui-icon-close");
            //          item.setCommand("#{usuarioBean.cerrarSesion}");
              //        model.addElement(item);
    
               
    
     }
    
}
