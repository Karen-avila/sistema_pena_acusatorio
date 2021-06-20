
package vista;

import DAO.RelacionVictimaCarpetaFacadeLocal;
import DAO.RelacionVictimaeCarpetaFacadeLocal;
import DAO.RelacionVictimamCarpetaFacadeLocal;
import Modelo.Carpeta;
import Modelo.ComboCSD;
import Modelo.RelacionVictimaCarpeta;
import Modelo.VictimaP;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;


@Named(value = "victimaBean")
@SessionScoped
public class VictimaBean implements Serializable {

    
    @EJB
   private RelacionVictimaCarpetaFacadeLocal relacionvictimaEJB;
    @EJB
  private  RelacionVictimaeCarpetaFacadeLocal relacionemEJB;
    @EJB
  private  RelacionVictimamCarpetaFacadeLocal relacionmmEJB;
    
  
    
    private RelacionVictimaCarpeta relacionvictima;
    
     private VictimaP victimap = new VictimaP();
    
     
    public VictimaBean() {
    }
    
}
