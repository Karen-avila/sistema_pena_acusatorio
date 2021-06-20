
package vista;



import DAO.PersonaFacadeLocal;
import DAO.UsuarioFacadeLocal;
import Modelo.Persona;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import Modelo.Usuario;

import org.apache.commons.codec.digest.DigestUtils;


@Named(value = "usuarioBean")
@ViewScoped
@SessionScoped
public class usuarioBean implements Serializable {

    @EJB
    private PersonaFacadeLocal personaFacade;
    
    @EJB
    private UsuarioFacadeLocal usuarioEJB;
   
     
   
    
   private Usuario usuario;
   
   private Persona persona;
 private List<Usuario> lista;
 private List <Usuario> usuariofilter;

 private String accion="";
    private String botonC="Guardar";

   
 @PostConstruct
   public void init(){
   usuario= new Usuario();
   persona = new Persona();
   
   }

    
    public List<Usuario> getUsuariofilter() {
        return usuariofilter;
    }

    public void setUsuariofilter(List<Usuario> usuariofilter) {
        this.usuariofilter = usuariofilter;
    }
   
    public String getBotonC() {
        return botonC;
    }

    public void setBotonC(String botonC) {
        this.botonC = botonC;
    }
   public  List<Usuario> getLista() {
         lista = usuarioEJB.findAll();
        
        return lista;
    }

    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }
    
   

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public void registrar (){
    
       try{
           String encript = DigestUtils.sha256Hex(this.usuario.getClave());
         //  System.out.println("Claveeeeeeeeee " + encript);
           this.usuario.setClave(encript);
           this.usuario.setPCodigo(persona);
       usuarioEJB.create(usuario);
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Se registro con exito"));
      usuario = new Usuario();
      persona = new Persona();
       }catch (Exception e){
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error"));
       }
   
   }

 public String ab(){
         
         Usuario us;
         String redireccion = null;
         try{
         us= usuarioEJB.iniciarSesion(usuario);
         //almacenar en sesion de JSF
         FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
         if (us !=null){
             
           redireccion="/usuarios/usuariocrear?faces-redirect=true";
         }
         else{
                
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Credenciales incorrectas!"));
         }  }
         catch(Exception e){
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error!"));
         }
  
     return redireccion;
     
}
  public String ag(){
         Usuario us;
         String redireccion = null;
         try{
         us= usuarioEJB.iniciarSesion(usuario);
         //almacenar en sesion de JSF
         FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
         if (us !=null){
             
           redireccion="/usuarios/carpetanew?faces-redirect=true";
         }
         else{
                
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Credenciales incorrectas!"));
         }  }
         catch(Exception e){
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error!"));
         }
     
     return redireccion;
     
}
  
   public String ac23(){
         Usuario us;
         String redireccion = null;
         try{
         us= usuarioEJB.iniciarSesion(usuario);
         //almacenar en sesion de JSF
         FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
         if (us !=null){
             
           redireccion="/usuarios/busquedaxcarpeta?faces-redirect=true";
         }
         else{
                
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Credenciales incorrectas!"));
         }  }
         catch(Exception e){
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error!"));
         }
     
     return redireccion;
     
}
 public String ac(){
         Usuario us;
         String redireccion = null;
         try{
         us= usuarioEJB.iniciarSesion(usuario);
         //almacenar en sesion de JSF
         FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
         if (us !=null){
             
           redireccion="/usuarios/consultacarpeta?faces-redirect=true";
         }
         else{
                
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Credenciales incorrectas!"));
         }  }
         catch(Exception e){
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error!"));
         }
     
     return redireccion;
     
}
 public String ae(){
         Usuario us;
         String redireccion = null;
         try{
         us= usuarioEJB.iniciarSesion(usuario);
         //almacenar en sesion de JSF
         FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
         if (us !=null){
             
           redireccion="/usuarios/consultausuario?faces-redirect=true";
         }
         else{
                
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Credenciales incorrectas!"));
         }  }
         catch(Exception e){
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error!"));
         }
     
     return redireccion;
     
} 
  public String i(){
         Usuario us;
         String redireccion = null;
         try{
         us= usuarioEJB.iniciarSesion(usuario);
         //almacenar en sesion de JSF
         FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
         if (us !=null){
             
           redireccion="/usuarios/principal?faces-redirect=true";
         }
         else{
                
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Credenciales incorrectas!"));
         }  }
         catch(Exception e){
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error!"));
         }
     
     return redireccion;
     
}
  
  public String am(){
         Usuario us;
         String redireccion = null;
         try{
         us= usuarioEJB.iniciarSesion(usuario);
         //almacenar en sesion de JSF
         FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
         if (us !=null){
             
           redireccion="/usuarios/buscarcarpeta?faces-redirect=true";
         }
         else{
                
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Credenciales incorrectas!"));
         }  }
         catch(Exception e){
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error!"));
         }
     
     return redireccion;
     
}
   public String mdu(){
         Usuario us;
         String redireccion = null;
         try{
         us= usuarioEJB.iniciarSesion(usuario);
         //almacenar en sesion de JSF
         FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
         if (us !=null){
             
           redireccion="/usuarios/modificarusuaro?faces-redirect=true";
         }
         else{
                
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Credenciales incorrectas!"));
         }  }
         catch(Exception e){
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error!"));
         }
     
     return redireccion;
     
}
 public String iniciarSesion(){
     
         Usuario us;
         String redireccion = null;
         try{
          
            String encript = DigestUtils.sha256Hex(this.usuario.getClave());
         this.usuario.setClave(encript);
         us= usuarioEJB.iniciarSesion(usuario);
         //almacenar en sesion de JSF
         FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
         if (us !=null){
             
                redireccion="/protegido/principal?faces-redirect=true";
             //if (us.getTipo().equals("A"))
             //   redireccion="/protegido/principal?faces-redirect=true";
           
         }
         
         else{
                
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Credenciales incorrectas!"));
         }  }
         catch(Exception e){
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error!"));
         }
     
     return redireccion;
     
}
  public void verificarSesion(){
    try{
         
    FacesContext context= FacesContext.getCurrentInstance();
    Usuario us=(Usuario) context.getExternalContext().getSessionMap().get("usuario");
    
    if(us == null){
    context.getExternalContext().redirect("./../index.xhtml");
    }
    
    
    }catch (Exception e){
        //log para guardar algun registro de un error
    
    
    }}
 public void cerrarSesion(){
      FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
      }
    public usuarioBean() {
        usuario =new Usuario();
    }
//****************************************************************************************************************
    
    public void prepararModificar(ActionEvent e){
      
       int indice = Integer.parseInt(e.getComponent().getClientId().split(":")[2]);
        System.out.println("Dato " + e.getComponent().getClientId());
       usuario = lista.get(indice);   
       persona = usuario.getPCodigo();
       // System.out.println("Persona " + persona.getNombres());
       //persona = personaFacade.find(usuario.getPCodigo().getCodigoP());
        accion="modificar";
        botonC="Guardar";
        usuarioEJB.edit(usuario); 
        personaFacade.edit(persona);
    }
       public void prepararEliminar(ActionEvent e){
        //System.out.println("Valorrrr  " + e.getComponent().getClientId());
        int indice = Integer.parseInt(e.getComponent().getClientId().split(":")[2]);
        usuario = lista.get(indice);
        accion="eliminar";
        botonC="Eliminar";
    }
   public void procesarAccion(){
       
     
//     if(accion.equals("nuevo"))
  //      usuarioEJB.create(usuario );
  //   if(accion.equals("modificar"))
  //              usuarioEJB.edit(usuario); 
  //    if(accion.equals("eliminar"))
  //          usuarioEJB.remove(usuario  );
  try{
   String encript = DigestUtils.sha256Hex(this.usuario.getClave());
         this.usuario.setClave(encript);
         usuarioEJB.edit(usuario); 
         personaFacade.edit(persona);
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Registro Modificado"));
  usuario = new Usuario();
      persona = new Persona();
  }catch (Exception e){
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error"));
    }}
    public String  procesarCancelar(){
         
        if(accion.equals("modificar"))
           return"modificarusuaro" ;
        if(accion.equals("eliminar"))
            return "carreraLista";
        return "consultausuario";

    }
    public void procesar(){
          
        addMessage("Confirmar valores :");
      
            }
    
    public void editarAccion(){ 
        usuarioEJB.edit(usuario);
                  
                
    }
    //***********************************************************************************************************
    private void addMessage(String confirmar_valores_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
