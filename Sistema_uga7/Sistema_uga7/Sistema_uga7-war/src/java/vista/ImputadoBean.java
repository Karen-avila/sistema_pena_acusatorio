package vista;


import DAO.ImputadoFacadeLocal;
import DAO.SexoFacadeLocal;

import Modelo.Imputado;
import Modelo.Sexo;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@Named(value = "imputadoBean")
@ViewScoped
@SessionScoped

public class ImputadoBean implements Serializable {

  @EJB
  private ImputadoFacadeLocal imputadoEJB;
  @EJB
  private SexoFacadeLocal sexoEJB;
  
  private Imputado imputado;
   private List<Imputado> imputados;
   //https://es.stackoverflow.com/questions/77030/resetear-valores-de-un-bean-de-sesion-en-jsf
 
  @PostConstruct
    public void init() {
        imputado = new Imputado();
        imputados = new ArrayList<Imputado>();
         
    }
  private Sexo sexo = new Sexo();
  
  private List<Sexo> sexoo;
  
  
  private String idsexo;

    public String getIdsexo() {
        return idsexo;
    }

    public void setIdsexo(String idsexo) {
        this.idsexo = idsexo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Imputado getImputado() {
        return imputado;
    }

    public void setImputado(Imputado imputado) {
        this.imputado = imputado;
    }

    public List<Sexo> getSexoo()     {
           sexoo= sexoEJB.findAll();
        return sexoo;
    }

    public void setSexoo(List<Sexo> sexoo) {
        this.sexoo = sexoo;
    }

    public List<Imputado> getImputados() {
        imputados=imputadoEJB.findAll();
        return imputados;
    }

    public void setImputados(List<Imputado> imputados) {
        this.imputados = imputados;
    }
    
  
    public void prepararNuevo(){
        
    } 

       

    public void registrar(){
      try{
     // sexo=sexoEJB.find((Integer)Integer.parseInt( idsexo));
     this.imputado.setFkSexo(sexo);
     
     
       imputadoEJB.create(imputado);
      
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Se registro con exito")); ;
       imputado = new Imputado();
        }catch (Exception e){
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error"));
       }
        
   }
    
  
  
    public ImputadoBean() {
        imputado = new Imputado();
        
    }
    
}