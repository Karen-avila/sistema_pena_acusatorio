
package vista;

import DAO.HidtoriaCarpetaFacadeLocal;
import DAO.RelacionCarpetaHistoriaFacadeLocal;
import Modelo.HidtoriaCarpeta;
import Modelo.RelacionCarpetaHistoria;
import Modelo.Usuario;
import javax.inject.Named;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@Named(value = "buscadorBean")
@SessionScoped
public class BuscadorBean implements Serializable {
    
    
      @EJB 
 private HidtoriaCarpetaFacadeLocal Historiacarpetafacade; 
         @EJB 
 private RelacionCarpetaHistoriaFacadeLocal relacioncarphistofacade;
         
private  RelacionCarpetaHistoria  relacioncarpetahistoria= new  RelacionCarpetaHistoria();       
private HidtoriaCarpeta hidtoriacarpeta= new HidtoriaCarpeta();

  private List< RelacionCarpetaHistoria>  RelacionCarpetaHistoriaa;
private List<HidtoriaCarpeta> hidtoriacarpetaa; 

  private int idhistoriacarp;
 
 
 @PostConstruct
 public void init(){
 hidtoriacarpetaa =  Historiacarpetafacade.findAll();
 }

    public int getIdhistoriacarp() {
        return idhistoriacarp;
    }

    public void setIdhistoriacarp(int idhistoriacarp) {
        this.idhistoriacarp = idhistoriacarp;
    }

    public List<HidtoriaCarpeta> getHidtoriacarpetaa() {
        return hidtoriacarpetaa;
    }

    public void setHidtoriacarpetaa(List<HidtoriaCarpeta> hidtoriacarpetaa) {
        this.hidtoriacarpetaa = hidtoriacarpetaa;
    }


    public HidtoriaCarpeta getHidtoriacarpeta() {
        return hidtoriacarpeta;
    }

    public void setHidtoriacarpeta(HidtoriaCarpeta hidtoriacarpeta) {
        this.hidtoriacarpeta = hidtoriacarpeta;
    }

    public RelacionCarpetaHistoriaFacadeLocal getRelacioncarphistofacade() {
        return relacioncarphistofacade;
    }

    public void setRelacioncarphistofacade(RelacionCarpetaHistoriaFacadeLocal relacioncarphistofacade) {
        this.relacioncarphistofacade = relacioncarphistofacade;
    }

    public RelacionCarpetaHistoria getRelacioncarpetahistoria() {
        return relacioncarpetahistoria;
    }

    public void setRelacioncarpetahistoria(RelacionCarpetaHistoria relacioncarpetahistoria) {
        this.relacioncarpetahistoria = relacioncarpetahistoria;
    }

    public List<RelacionCarpetaHistoria> getRelacionCarpetaHistoriaa() {
        return RelacionCarpetaHistoriaa;
    }

    public void setRelacionCarpetaHistoriaa(List<RelacionCarpetaHistoria> RelacionCarpetaHistoriaa) {
        this.RelacionCarpetaHistoriaa = RelacionCarpetaHistoriaa;
    }

 
   public void buscar() {
       try{
       Usuario us= (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
     RelacionCarpetaHistoriaa =relacioncarphistofacade.buscar(us.getPCodigo().getCodigoP(),idhistoriacarp);
      
            
   }catch (Exception e){
System.out.println(e.getMessage());
}
   }  
    
    public BuscadorBean() {
    }
    
}
