

package vista;

import DAO.AbogadoFacadeLocal;
import DAO.CalificacionDHFacadeLocal;
import DAO.CarpetaFacadeLocal;
import DAO.ComboCSDFacadeLocal;
import DAO.DatosEspesificosDeImputadoFacadeLocal;
import DAO.DatosEspesificosVFacadeLocal;
import DAO.EstadoActualDeCarpetaFacadeLocal;
import DAO.EtapaIntermediaFacadeLocal;
import DAO.Fecha2FacadeLocal;
import DAO.FechaIntermediaFacadeLocal;
import DAO.FechasFacadeLocal;
import DAO.HidtoriaCarpetaFacadeLocal;
import DAO.ImputadoFacadeLocal;
import DAO.JuezDeTunoControlNombreFacadeLocal;
import DAO.MpQueTrabajaFacadeLocal;
import DAO.PenaFacadeLocal;
import DAO.PersonaFacadeLocal;
import DAO.ProcedenciaFacadeLocal;
import DAO.ProcediAbreviadoTFacadeLocal;
import DAO.ProcedimientoAbreviadoFacadeLocal;
import DAO.PuestaADisposicionFacadeLocal;
import DAO.RelacionCarpetaHistoriaFacadeLocal;
import DAO.RelacionCarpetaImputadoFacadeLocal;
import DAO.RelacionCarpetaJuezFacadeLocal;
import DAO.RelacionVictimaCarpetaFacadeLocal;
import DAO.RelacionVictimaeCarpetaFacadeLocal;
import DAO.RelacionVictimamCarpetaFacadeLocal;
import DAO.ReparacionDelDañoFacadeLocal;
import DAO.ResolucionApelacionMpFacadeLocal;
import DAO.SeconsedeOpcionesFacadeLocal;
import DAO.SexoFacadeLocal;
import DAO.SiseConsedeOpcionesSiFacadeLocal;
import DAO.SolucionesAlternasFacadeLocal;
import DAO.TerminoFacadeLocal;
import DAO.TipoDeFalloFacadeLocal;
import DAO.UnidadDeGestionFacadeLocal;
import DAO.VMenorFacadeLocal;
import DAO.VempresaorgFacadeLocal;
import DAO.VictimaPFacadeLocal;
import Modelo.Abogado;
import Modelo.CalificacionDH;
import Modelo.Carpeta;
import Modelo.ComboCSD;
import Modelo.DatosEspesificosDeImputado;
import Modelo.DatosEspesificosV;
import Modelo.EstadoActualDeCarpeta;
import Modelo.EtapaIntermedia;
import Modelo.Fecha2;
import Modelo.FechaIntermedia;
import Modelo.Fechas;
import Modelo.HidtoriaCarpeta;
import Modelo.Imputado;
import Modelo.JuezDeTunoControlNombre;
import Modelo.MpQueTrabaja;
import Modelo.Pena;
import Modelo.Persona;
import Modelo.Procedencia;
import Modelo.ProcediAbreviadoT;
import Modelo.ProcedimientoAbreviado;
import Modelo.PuestaADisposicion;
import Modelo.RelacionCarpetaHistoria;
import Modelo.RelacionCarpetaImputado;
import Modelo.RelacionCarpetaJuez;
import Modelo.RelacionVictimaCarpeta;
import Modelo.RelacionVictimaeCarpeta;
import Modelo.RelacionVictimamCarpeta;
import Modelo.ReparacionDelDaño;
import Modelo.ResolucionApelacionMp;
import Modelo.SeconsedeOpciones;
import Modelo.Sexo;
import Modelo.SiseConsedeOpcionesSi;
import Modelo.SolucionesAlternas;
import Modelo.Termino;
import Modelo.TipoDeFallo;
import Modelo.UnidadDeGestion;
import Modelo.Usuario;
import Modelo.VMenor;
import Modelo.Vempresaorg;
import Modelo.VictimaP;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@Named(value = "carpetaBean")
@SessionScoped
public class CarpetaBean implements Serializable {

    //EJB
    @EJB
    private PersonaFacadeLocal personaEJB;
    
   @EJB
 private CarpetaFacadeLocal carpetaEJB;
   @EJB
 private ComboCSDFacadeLocal combocsdEJB;
   @EJB
 private PuestaADisposicionFacadeLocal puestaadispoEJB;
   @EJB
 private ProcedenciaFacadeLocal procedenciaEJB;
   @EJB
 private UnidadDeGestionFacadeLocal unidadgestionEJB;
   @EJB
 private MpQueTrabajaFacadeLocal mptrabajaEJB;
   @EJB 
 private HidtoriaCarpetaFacadeLocal Historiacarpetafacade;   
   @EJB 
 private RelacionCarpetaHistoriaFacadeLocal relacioncarphistofacade;
   @EJB
 private RelacionCarpetaImputadoFacadeLocal relacioncarpetaimputadoEJB;
   @EJB
  private ImputadoFacadeLocal imputadoEJB;
   @EJB
  private SexoFacadeLocal sexoEJB;
  @EJB
  private DatosEspesificosDeImputadoFacadeLocal datosespecificosEJB;
  @EJB
  private AbogadoFacadeLocal abogadoEJB;
  @EJB
  private CalificacionDHFacadeLocal calificacionEJB;
  @EJB
  private ProcediAbreviadoTFacadeLocal procediabreviadEJB;
  @EJB
  private ProcedimientoAbreviadoFacadeLocal procedimientoEJB;
  @EJB
  private TipoDeFalloFacadeLocal tipofalloEJB;
  @EJB
  private FechaIntermediaFacadeLocal fechaintermediaEJB;
  @EJB
  private EtapaIntermediaFacadeLocal etapaintermediaEJB;
  @EJB
  private PenaFacadeLocal penaEJB;
  @EJB
  private ReparacionDelDañoFacadeLocal reparaciondeldañoEJB;
  @EJB
  private Fecha2FacadeLocal fecha2EJB;
  @EJB
  private FechasFacadeLocal fechasEJB;
  @EJB
  private SolucionesAlternasFacadeLocal solucionesEJB;
  @EJB
  private TerminoFacadeLocal terminoEJB;
  @EJB
  private ResolucionApelacionMpFacadeLocal resolucionEJB;
  @EJB
  private SeconsedeOpcionesFacadeLocal seconsedeEJB;
  @EJB
  private SiseConsedeOpcionesSiFacadeLocal siconsedeEJB;
  @EJB
  private  EstadoActualDeCarpetaFacadeLocal estadoEJB;
  @EJB
  private VempresaorgFacadeLocal victimaempresaEJB;
  @EJB
  private VMenorFacadeLocal victimaMenorEJB;
  @EJB
  private VictimaPFacadeLocal victimaPersonaEJB;
  @EJB
  private RelacionVictimamCarpetaFacadeLocal relacionvictimacarpetaEJB;
  @EJB
  private RelacionVictimaeCarpetaFacadeLocal relacionvictimaEJB;
  @EJB
  private RelacionVictimaCarpetaFacadeLocal relacionvicperEJB;
  @EJB
  private DatosEspesificosVFacadeLocal datosespecificosvEJB;
  @EJB
  private RelacionCarpetaJuezFacadeLocal relacioncarpetajuezEJB;
  @EJB
  private JuezDeTunoControlNombreFacadeLocal juezcontrolEJB;
  
//Modelo
 private Carpeta carpeta;
 private ComboCSD combocsd = new ComboCSD();
 private PuestaADisposicion puestaadispo = new PuestaADisposicion();
 private Procedencia procedencia = new Procedencia();
 private UnidadDeGestion unidadgestion= new UnidadDeGestion();
 private MpQueTrabaja mptrabaja= new MpQueTrabaja();
 private HidtoriaCarpeta hidtoriacarpeta= new HidtoriaCarpeta();
 private  RelacionCarpetaHistoria  relacioncarpetahistoria= new  RelacionCarpetaHistoria();
 private  RelacionCarpetaImputado relacioncarpetaimputado = new RelacionCarpetaImputado();
  private Imputado imputado = new Imputado();
  private Sexo sexo = new Sexo();
  private DatosEspesificosDeImputado datosespecificosdeimputado = new DatosEspesificosDeImputado();
  private Abogado abogado = new Abogado ();
  private CalificacionDH calificacion = new CalificacionDH();
  private ProcediAbreviadoT procedimiento = new ProcediAbreviadoT ();
  private Persona persona= new Persona();
  
 
  private ProcedimientoAbreviado proceabreviado = new ProcedimientoAbreviado();
  private TipoDeFallo tipofallo = new TipoDeFallo ();
  private FechaIntermedia fechaintermedia = new FechaIntermedia ();
  private EtapaIntermedia etapainter = new EtapaIntermedia ();
  private Pena pena = new Pena ();
  private ReparacionDelDaño  reparacion = new ReparacionDelDaño();
  private Fecha2 fecha2= new Fecha2 ();
  private SolucionesAlternas  solucionesalternas= new SolucionesAlternas ();
  private Fechas fecha = new Fechas ();  
  private Termino termino = new Termino ();
  private ResolucionApelacionMp resolucionmp= new ResolucionApelacionMp ();
  private SeconsedeOpciones seconsede = new SeconsedeOpciones ();
  private SiseConsedeOpcionesSi siconsede = new SiseConsedeOpcionesSi ();
  private EstadoActualDeCarpeta estadoactual = new EstadoActualDeCarpeta ();
  private Vempresaorg victimaempresa =  new Vempresaorg(); 
  private VMenor victimamenor= new VMenor ();
  private VictimaP victimapersona = new VictimaP();
  private RelacionVictimaCarpeta relacionvictimacar = new RelacionVictimaCarpeta ();
  private RelacionVictimaeCarpeta relacionvictimaempresa = new RelacionVictimaeCarpeta();
  private RelacionVictimamCarpeta relacionmenor = new RelacionVictimamCarpeta();
  private DatosEspesificosV datosv= new DatosEspesificosV();
  private RelacionCarpetaJuez carpetajuez= new RelacionCarpetaJuez ();
  private JuezDeTunoControlNombre juezcontrol = new JuezDeTunoControlNombre ();
  
  
  
 //Lista
  private List <Persona> listapersona;
  private List <Imputado> imputadosfilter;
  private List<Carpeta> listaCarpeta;
  private List <Carpeta> carpetafilter;
  private List <RelacionCarpetaImputado> relacioncarpetaimputadofilter;
  private List<ComboCSD> combocsdd;
  private List<PuestaADisposicion> puestaadispoo;
  private List<Procedencia> procedenciaa;
  private List<UnidadDeGestion> unidadgestionn;
  private List<MpQueTrabaja> mptrabajaa;
  private List<HidtoriaCarpeta> hidtoriacarpetaa; 
  private List< RelacionCarpetaHistoria>  RelacionCarpetaHistoriaa;
  private List <RelacionCarpetaImputado> relacioncarpetaimpp;
  private List<Imputado> imputados;
  private List<Sexo> sexoo;
  private List <DatosEspesificosDeImputado>datoslista;
  private List <Abogado> abogadolista;
  private List <CalificacionDH> calificaciondh;
  private List <ProcediAbreviadoT> listaprocedimiento;
  private List <ProcedimientoAbreviado> listaproceabreviado;
  private List <TipoDeFallo> listatipofallo;
  private List <FechaIntermedia> listafechaintermedia;
  private List <EtapaIntermedia> listaetapaintermedia;
  private List <Pena> listapena;
  private List <ReparacionDelDaño> listareparacion;
  private List <Fecha2> listafecha2;
   private List <SolucionesAlternas> listasolucionesalternas ;
  private List <Fechas> listafecha; 
  private List <Termino> listatermino ;
  private List <ResolucionApelacionMp> listaresolucionapelacion ;
  private List <SeconsedeOpciones> listaseconsede;
  private List <SiseConsedeOpcionesSi> listasiseconsede;
  private List <EstadoActualDeCarpeta> listaestadoactualdecarpeta;
  private List <Vempresaorg> listavempresa ;
  private List <VMenor> listavmenor;
  private List <VictimaP> listavictimap ;
  private List <RelacionVictimaCarpeta> listarelacionvictimacarpet;
  private List <RelacionVictimaeCarpeta> listarelacionvempresacarp ;
  private List <RelacionVictimamCarpeta> listarelacionvictimamenor ;
  private List <DatosEspesificosV> listadatosespecificos;
  private List <RelacionCarpetaJuez> listarelacioncarpetajuez;
  private List <JuezDeTunoControlNombre> listajuezcontrol;
  
 private String idpersona; 
 private String idcarpeta; 
 private String idCSD;
 private String idpuestadisp;
 private String idprocedencia;
 private String idunidadgestion ;
 private String idmptrabaja;
 private String idhistoria;
 private String idhistoriacarp;
 private String idRelacionCarpetaHistoria; 
 private String idRelacionCarpetaImputado;
 private String idimputado;
 private String idsexo;
 private String idespecificosimputado;
 private String idabogado;
 private String idcalificaciondh;
 private String idprocediabreviadot;
 private String idprocedimiento;
 private String idtipodefallo;
 private String idefechaintermedia;
 private String idetapaintermedia;
 private String idpena;
 private String idreparaciondeldaño;
 private String idfecha2;
 private String idfechas;
 private String idsolucionesalternas;
 private String idtermino;
 private String idresolucionMp;
 private String idseconsede;
 private String idsiseconsede;
 private String idestadoactualcarpeta;
private String idvictimaempresa;
private String idvictimamenor;
private String idvictimapersona;
private String idvictimapcarpeta;
private String idvictimaecarpeta;
private String idvictimamcarpeta;
private String iddatosv;
private String idrelacioncarpetajuez;
private String idjuezdeturno;                            


 private String accion="";
    private String botonC="Guardar";

    public String getBotonC() {
        return botonC;
    }

    public void setBotonC(String botonC) {
        this.botonC = botonC;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getListapersona() {
        return listapersona;
    }

    public void setListapersona(List<Persona> listapersona) {
        this.listapersona = listapersona;
    }

    public String getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(String idpersona) {
        this.idpersona = idpersona;
    }

    
    
    
    public List<RelacionCarpetaImputado> getRelacioncarpetaimputadofilter() {
        return relacioncarpetaimputadofilter;
    }

    public void setRelacioncarpetaimputadofilter(List<RelacionCarpetaImputado> relacioncarpetaimputadofilter) {
        this.relacioncarpetaimputadofilter = relacioncarpetaimputadofilter;
    }
    
    
    public List<Imputado> getImputadosfilter() {
        return imputadosfilter;
    }

    public void setImputadosfilter(List<Imputado> imputadosfilter) {
        this.imputadosfilter = imputadosfilter;
    }




    public List<Carpeta> getCarpetafilter() {
        return carpetafilter;
    }

//Relacion carpeta victima
    public void setCarpetafilter(List<Carpeta> carpetafilter) {
        this.carpetafilter = carpetafilter;
    }

    public DatosEspesificosDeImputado getDatosespecificosdeimputado() {
        return datosespecificosdeimputado;
    }

    public void setDatosespecificosdeimputado(DatosEspesificosDeImputado datosespecificosdeimputado) {
        this.datosespecificosdeimputado = datosespecificosdeimputado;
    }

    public Vempresaorg getVictimaempresa() {
        return victimaempresa;
    }

    public void setVictimaempresa(Vempresaorg victimaempresa) {
        this.victimaempresa = victimaempresa;
    }

    public VMenor getVictimamenor() {
        return victimamenor;
    }

    public void setVictimamenor(VMenor victimamenor) {
        this.victimamenor = victimamenor;
    }

    public VictimaP getVictimapersona() {
        return victimapersona;
    }

    public void setVictimapersona(VictimaP victimapersona) {
        this.victimapersona = victimapersona;
    }

    public RelacionVictimaCarpeta getRelacionvictimacar() {
        return relacionvictimacar;
    }

    public void setRelacionvictimacar(RelacionVictimaCarpeta relacionvictimacar) {
        this.relacionvictimacar = relacionvictimacar;
    }

    public RelacionVictimaeCarpeta getRelacionvictimaempresa() {
        return relacionvictimaempresa;
    }

    public void setRelacionvictimaempresa(RelacionVictimaeCarpeta relacionvictimaempresa) {
        this.relacionvictimaempresa = relacionvictimaempresa;
    }

    public RelacionVictimamCarpeta getRelacionmenor() {
        return relacionmenor;
    }

    public void setRelacionmenor(RelacionVictimamCarpeta relacionmenor) {
        this.relacionmenor = relacionmenor;
    }

    public DatosEspesificosV getDatosv() {
        return datosv;
    }

    public void setDatosv(DatosEspesificosV datosv) {
        this.datosv = datosv;
    }

    public RelacionCarpetaJuez getCarpetajuez() {
        return carpetajuez;
    }

    public void setCarpetajuez(RelacionCarpetaJuez carpetajuez) {
        this.carpetajuez = carpetajuez;
    }

    public JuezDeTunoControlNombre getJuezcontrol() {
        return juezcontrol;
    }

    public void setJuezcontrol(JuezDeTunoControlNombre juezcontrol) {
        this.juezcontrol = juezcontrol;
    }

    public List<Vempresaorg> getListavempresa() {
        return listavempresa;
    }

    public void setListavempresa(List<Vempresaorg> listavempresa) {
        this.listavempresa = listavempresa;
    }

    public List<VMenor> getListavmenor() {
        return listavmenor;
    }

    public void setListavmenor(List<VMenor> listavmenor) {
        this.listavmenor = listavmenor;
    }

    public List<VictimaP> getListavictimap() {
        return listavictimap;
    }

    public void setListavictimap(List<VictimaP> listavictimap) {
        this.listavictimap = listavictimap;
    }

    public List<RelacionVictimaCarpeta> getListarelacionvictimacarpet() {
        return listarelacionvictimacarpet;
    }

    public void setListarelacionvictimacarpet(List<RelacionVictimaCarpeta> listarelacionvictimacarpet) {
        this.listarelacionvictimacarpet = listarelacionvictimacarpet;
    }

    public List<RelacionVictimaeCarpeta> getListarelacionvempresacarp() {
        return listarelacionvempresacarp;
    }

    public void setListarelacionvempresacarp(List<RelacionVictimaeCarpeta> listarelacionvempresacarp) {
        this.listarelacionvempresacarp = listarelacionvempresacarp;
    }

    public List<RelacionVictimamCarpeta> getListarelacionvictimamenor() {
        return listarelacionvictimamenor;
    }

    public void setListarelacionvictimamenor(List<RelacionVictimamCarpeta> listarelacionvictimamenor) {
        this.listarelacionvictimamenor = listarelacionvictimamenor;
    }

    public List<DatosEspesificosV> getListadatosespecificos() {
        return listadatosespecificos;
    }

    public void setListadatosespecificos(List<DatosEspesificosV> listadatosespecificos) {
        this.listadatosespecificos = listadatosespecificos;
    }

    public List<RelacionCarpetaJuez> getListarelacioncarpetajuez() {
        return listarelacioncarpetajuez;
    }

    public void setListarelacioncarpetajuez(List<RelacionCarpetaJuez> listarelacioncarpetajuez) {
        this.listarelacioncarpetajuez = listarelacioncarpetajuez;
    }

    public List<JuezDeTunoControlNombre> getListajuezcontrol() {
        return listajuezcontrol;
    }

    public void setListajuezcontrol(List<JuezDeTunoControlNombre> listajuezcontrol) {
        this.listajuezcontrol = listajuezcontrol;
    }

    public String getIdvictimaempresa() {
        return idvictimaempresa;
    }

    public void setIdvictimaempresa(String idvictimaempresa) {
        this.idvictimaempresa = idvictimaempresa;
    }

    public String getIdvictimamenor() {
        return idvictimamenor;
    }

    public void setIdvictimamenor(String idvictimamenor) {
        this.idvictimamenor = idvictimamenor;
    }

    public String getIdvictimapersona() {
        return idvictimapersona;
    }

    public void setIdvictimapersona(String idvictimapersona) {
        this.idvictimapersona = idvictimapersona;
    }

    public String getIdvictimapcarpeta() {
        return idvictimapcarpeta;
    }

    public void setIdvictimapcarpeta(String idvictimapcarpeta) {
        this.idvictimapcarpeta = idvictimapcarpeta;
    }

    public String getIdvictimaecarpeta() {
        return idvictimaecarpeta;
    }

    public void setIdvictimaecarpeta(String idvictimaecarpeta) {
        this.idvictimaecarpeta = idvictimaecarpeta;
    }

    public String getIdvictimamcarpeta() {
        return idvictimamcarpeta;
    }

    public void setIdvictimamcarpeta(String idvictimamcarpeta) {
        this.idvictimamcarpeta = idvictimamcarpeta;
    }

    public String getIddatosv() {
        return iddatosv;
    }

    public void setIddatosv(String iddatosv) {
        this.iddatosv = iddatosv;
    }

    public String getIdrelacioncarpetajuez() {
        return idrelacioncarpetajuez;
    }

    public void setIdrelacioncarpetajuez(String idrelacioncarpetajuez) {
        this.idrelacioncarpetajuez = idrelacioncarpetajuez;
    }

    public String getIdjuezdeturno() {
        return idjuezdeturno;
    }

    public void setIdjuezdeturno(String idjuezdeturno) {
        this.idjuezdeturno = idjuezdeturno;
    }







      //Relacion carpeta-imputado

    public DatosEspesificosDeImputadoFacadeLocal getDatosespecificosEJB() {
        return datosespecificosEJB;
    }

    public void setDatosespecificosEJB(DatosEspesificosDeImputadoFacadeLocal datosespecificosEJB) {
        this.datosespecificosEJB = datosespecificosEJB;
    }

    public AbogadoFacadeLocal getAbogadoEJB() {
        return abogadoEJB;
    }

    public void setAbogadoEJB(AbogadoFacadeLocal abogadoEJB) {
        this.abogadoEJB = abogadoEJB;
    }

    public CalificacionDHFacadeLocal getCalificacionEJB() {
        return calificacionEJB;
    }

    public void setCalificacionEJB(CalificacionDHFacadeLocal calificacionEJB) {
        this.calificacionEJB = calificacionEJB;
    }

    public ProcediAbreviadoTFacadeLocal getProcediabreviadEJB() {
        return procediabreviadEJB;
    }

    public void setProcediabreviadEJB(ProcediAbreviadoTFacadeLocal procediabreviadEJB) {
        this.procediabreviadEJB = procediabreviadEJB;
    }

    public ProcedimientoAbreviadoFacadeLocal getProcedimientoEJB() {
        return procedimientoEJB;
    }

    public void setProcedimientoEJB(ProcedimientoAbreviadoFacadeLocal procedimientoEJB) {
        this.procedimientoEJB = procedimientoEJB;
    }

    public TipoDeFalloFacadeLocal getTipoFalloEJB() {
        return tipofalloEJB;
    }

    public void setTipoFalloEJB(TipoDeFalloFacadeLocal tipoFalloEJB) {
        this.tipofalloEJB = tipoFalloEJB;
    }

    public FechaIntermediaFacadeLocal getFechaintermediaEJB() {
        return fechaintermediaEJB;
    }

    public void setFechaintermediaEJB(FechaIntermediaFacadeLocal fechaintermediaEJB) {
        this.fechaintermediaEJB = fechaintermediaEJB;
    }

    public EtapaIntermediaFacadeLocal getEtapaintermediaEJB() {
        return etapaintermediaEJB;
    }

    public void setEtapaintermediaEJB(EtapaIntermediaFacadeLocal etapaintermediaEJB) {
        this.etapaintermediaEJB = etapaintermediaEJB;
    }

    public PenaFacadeLocal getPenaEJB() {
        return penaEJB;
    }

    public void setPenaEJB(PenaFacadeLocal penaEJB) {
        this.penaEJB = penaEJB;
    }

    public ReparacionDelDañoFacadeLocal getReparaciondeldañoEJB() {
        return reparaciondeldañoEJB;
    }

    public void setReparaciondeldañoEJB(ReparacionDelDañoFacadeLocal reparaciondeldañoEJB) {
        this.reparaciondeldañoEJB = reparaciondeldañoEJB;
    }

    public Fecha2FacadeLocal getFechaEJB() {
        return fecha2EJB;
    }

    public void setFechaEJB(Fecha2FacadeLocal fechaEJB) {
        this.fecha2EJB = fechaEJB;
    }

    public FechasFacadeLocal getFechasEJB() {
        return fechasEJB;
    }

    public void setFechasEJB(FechasFacadeLocal fechasEJB) {
        this.fechasEJB = fechasEJB;
    }

    public SolucionesAlternasFacadeLocal getSolucionesEJB() {
        return solucionesEJB;
    }

    public void setSolucionesEJB(SolucionesAlternasFacadeLocal solucionesEJB) {
        this.solucionesEJB = solucionesEJB;
    }

    public TerminoFacadeLocal getTerminoEJB() {
        return terminoEJB;
    }

    public void setTerminoEJB(TerminoFacadeLocal terminoEJB) {
        this.terminoEJB = terminoEJB;
    }

   

    public ResolucionApelacionMpFacadeLocal getResolucionEJB() {
        return resolucionEJB;
    }

    public void setResolucionEJB(ResolucionApelacionMpFacadeLocal resolucionEJB) {
        this.resolucionEJB = resolucionEJB;
    }

    public SeconsedeOpcionesFacadeLocal getSeconsedeEJB() {
        return seconsedeEJB;
    }

    public void setSeconsedeEJB(SeconsedeOpcionesFacadeLocal seconsedeEJB) {
        this.seconsedeEJB = seconsedeEJB;
    }

    public SiseConsedeOpcionesSiFacadeLocal getSiconsedeEJB() {
        return siconsedeEJB;
    }

    public void setSiconsedeEJB(SiseConsedeOpcionesSiFacadeLocal siconsedeEJB) {
        this.siconsedeEJB = siconsedeEJB;
    }

    public EstadoActualDeCarpetaFacadeLocal getEstadoEJB() {
        return estadoEJB;
    }

    public void setEstadoEJB(EstadoActualDeCarpetaFacadeLocal estadoEJB) {
        this.estadoEJB = estadoEJB;
    }

    public DatosEspesificosDeImputado getDestosespecificosdeimputado() {
        return datosespecificosdeimputado;
    }

    public void setDestosespecificosdeimputado(DatosEspesificosDeImputado datosespecificosdeimputado) {
        this.datosespecificosdeimputado = datosespecificosdeimputado;
    }

    public Abogado getAbogado() {
        return abogado;
    }

    public void setAbogado(Abogado abogado) {
        this.abogado = abogado;
    }

    public CalificacionDH getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(CalificacionDH calificacion) {
        this.calificacion = calificacion;
    }

    public ProcediAbreviadoT getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(ProcediAbreviadoT procedimiento) {
        this.procedimiento = procedimiento;
    }

    public ProcedimientoAbreviado getProceabreviado() {
        return proceabreviado;
    }

    public void setProceabreviado(ProcedimientoAbreviado proceabreviado) {
        this.proceabreviado = proceabreviado;
    }

    public TipoDeFallo getTipofallo() {
        return tipofallo;
    }

    public void setTipofallo(TipoDeFallo tipofallo) {
        this.tipofallo = tipofallo;
    }

    public FechaIntermedia getFechaintermedia() {
        return fechaintermedia;
    }

    public void setFechaintermedia(FechaIntermedia fechaintermedia) {
        this.fechaintermedia = fechaintermedia;
    }

    public EtapaIntermedia getEtapainter() {
        return etapainter;
    }

    public void setEtapainter(EtapaIntermedia etapainter) {
        this.etapainter = etapainter;
    }

    public Pena getPena() {
        return pena;
    }

    public void setPena(Pena pena) {
        this.pena = pena;
    }

    public ReparacionDelDaño getReparacion() {
        return reparacion;
    }

    public void setReparacion(ReparacionDelDaño reparacion) {
        this.reparacion = reparacion;
    }

    public Fecha2 getFecha2() {
        return fecha2;
    }

    public void setFecha2(Fecha2 fecha2) {
        this.fecha2 = fecha2;
    }

    public Fechas getFecha() {
        return fecha;
    }

    public void setFecha(Fechas fecha) {
        this.fecha = fecha;
    }

    public SolucionesAlternas getSolucionesalternas() {
        return solucionesalternas;
    }

    public void setSolucionesalternas(SolucionesAlternas solucionesalternas) {
        this.solucionesalternas = solucionesalternas;
    }

    public Termino getTermino() {
        return termino;
    }

    public void setTermino(Termino termino) {
        this.termino = termino;
    }

   

    public ResolucionApelacionMp getResolucionmp() {
        return resolucionmp;
    }

    public void setResolucionmp(ResolucionApelacionMp resolucionmp) {
        this.resolucionmp = resolucionmp;
    }

    public SeconsedeOpciones getSeconsede() {
        return seconsede;
    }

    public void setSeconsede(SeconsedeOpciones seconsede) {
        this.seconsede = seconsede;
    }

    public SiseConsedeOpcionesSi getSiconsede() {
        return siconsede;
    }

    public void setSiconsede(SiseConsedeOpcionesSi siconsede) {
        this.siconsede = siconsede;
    }

    public EstadoActualDeCarpeta getEstadoactual() {
        return estadoactual;
    }

    public void setEstadoactual(EstadoActualDeCarpeta estadoactual) {
        this.estadoactual = estadoactual;
    }

    public List<DatosEspesificosDeImputado> getDatoslista() {
        datoslista = datosespecificosEJB.findAll();
        return datoslista;
    }

    public void setDatoslista(List<DatosEspesificosDeImputado> datoslista) {
        this.datoslista = datoslista;
    }

    public List<Abogado> getAbogadolista() {
        abogadolista =abogadoEJB.findAll();
        return abogadolista;
    }

    public void setAbogadolista(List<Abogado> abogadolista) {
        this.abogadolista = abogadolista;
    }

    public List<CalificacionDH> getCalificaciondh() {
       calificaciondh = calificacionEJB.findAll();
        return calificaciondh;
    }

    public void setCalificaciondh(List<CalificacionDH> calificaciondh) {
        this.calificaciondh = calificaciondh;
    }

    public List<ProcediAbreviadoT> getListaprocedimiento() {
        listaprocedimiento = procediabreviadEJB.findAll();
        return listaprocedimiento;
    }

    public void setListaprocedimiento(List<ProcediAbreviadoT> listaprocedimiento) {
        this.listaprocedimiento = listaprocedimiento;
    }

    public List<ProcedimientoAbreviado> getListaproceabreviado() {
        listaproceabreviado = procedimientoEJB.findAll();
        return listaproceabreviado;
    }

    public void setListaproceabreviado(List<ProcedimientoAbreviado> listaproceabreviado) {
        this.listaproceabreviado = listaproceabreviado;
    }

    public List<TipoDeFallo> getListatipofallo() {
        listatipofallo =tipofalloEJB.findAll();
        return listatipofallo;
    }

    public void setListatipofallo(List<TipoDeFallo> listatipofallo) {
        this.listatipofallo = listatipofallo;
    }

    public List<FechaIntermedia> getListafechaintermedia() {
        listafechaintermedia = fechaintermediaEJB.findAll();
        return listafechaintermedia;
    }

    public void setListafechaintermedia(List<FechaIntermedia> listafechaintermedia) {
        this.listafechaintermedia = listafechaintermedia;
    }

    public List<EtapaIntermedia> getListaetapaintermedia() {
        listaetapaintermedia = etapaintermediaEJB.findAll();
        return listaetapaintermedia;
    }

    public void setListaetapaintermedia(List<EtapaIntermedia> listaetapaintermedia) {
        this.listaetapaintermedia = listaetapaintermedia;
    }

    public List<Pena> getListapena() {
      listapena= penaEJB.findAll();
        return listapena;
    }

    public void setListapena(List<Pena> listapena) {
        this.listapena = listapena;
    }

    public List<ReparacionDelDaño> getListareparacion() {
     listareparacion = reparaciondeldañoEJB.findAll();
        return listareparacion;
    }

    public void setListareparacion(List<ReparacionDelDaño> listareparacion) {
        this.listareparacion = listareparacion;
    }

    public List<Fecha2> getListafecha2() {
     listafecha2 = fecha2EJB.findAll();
        return listafecha2;
    }

    public void setListafecha2(List<Fecha2> listafecha2) {
        this.listafecha2 = listafecha2;
    }

    public List<Fechas> getListafecha() {
     listafecha = fechasEJB.findAll();
        return listafecha;
    }

    public void setListafecha(List<Fechas> listafecha) {
        this.listafecha = listafecha;
    }

    public List<SolucionesAlternas> getListasolucionesalternas() {
      listasolucionesalternas = solucionesEJB.findAll();
        return listasolucionesalternas;
    }

    public void setListasolucionesalternas(List<SolucionesAlternas> listasolucionesalternas) {
        this.listasolucionesalternas = listasolucionesalternas;
    }

    public List<Termino> getListatermino() {
    listatermino = terminoEJB.findAll();
        return listatermino;
    }

    public void setListatermino(List<Termino> listatermino) {
        this.listatermino = listatermino;
    }

  
    public List<ResolucionApelacionMp> getListaresolucionapelacion() {
        listaresolucionapelacion = resolucionEJB.findAll();
        return listaresolucionapelacion;
    }

    public void setListaresolucionapelacion(List<ResolucionApelacionMp> listaresolucionapelacion) {
        this.listaresolucionapelacion = listaresolucionapelacion;
    }

    public List<SeconsedeOpciones> getListaseconsede() {
     listaseconsede = seconsedeEJB.findAll();
        return listaseconsede;
    }

    public void setListaseconsede(List<SeconsedeOpciones> listaseconsede) {
        this.listaseconsede = listaseconsede;
    }

    public List<SiseConsedeOpcionesSi> getListasiseconsede() {
        listasiseconsede = siconsedeEJB.findAll();
        return listasiseconsede;
    }

    public void setListasiseconsede(List<SiseConsedeOpcionesSi> listasiseconsede) {
        this.listasiseconsede = listasiseconsede;
    }

    public List<EstadoActualDeCarpeta> getListaestadoactualdecarpeta() {
        listaestadoactualdecarpeta = estadoEJB.findAll();
        return listaestadoactualdecarpeta;
    }

    public void setListaestadoactualdecarpeta(List<EstadoActualDeCarpeta> listaestadoactualdecarpeta) {
        this.listaestadoactualdecarpeta = listaestadoactualdecarpeta;
    }

    public String getIdespecificosimputado() {
        return idespecificosimputado;
    }

    public void setIdespecificosimputado(String idespecificosimputado) {
        this.idespecificosimputado = idespecificosimputado;
    }

    public String getIdabogado() {
        return idabogado;
    }

    public void setIdabogado(String idabogado) {
        this.idabogado = idabogado;
    }

    public String getIdcalificaciondh() {
        return idcalificaciondh;
    }

    public void setIdcalificaciondh(String idcalificaciondh) {
        this.idcalificaciondh = idcalificaciondh;
    }

    public String getIdprocediabreviadot() {
        return idprocediabreviadot;
    }

    public void setIdprocediabreviadot(String idprocediabreviadot) {
        this.idprocediabreviadot = idprocediabreviadot;
    }

    public String getIdprocedimiento() {
        return idprocedimiento;
    }

    public void setIdprocedimiento(String idprocedimiento) {
        this.idprocedimiento = idprocedimiento;
    }

    public String getIdtipodefallo() {
        return idtipodefallo;
    }

    public void setIdtipodefallo(String idtipodefallo) {
        this.idtipodefallo = idtipodefallo;
    }

    public String getIdefechaintermedia() {
        return idefechaintermedia;
    }

    public void setIdefechaintermedia(String idefechaintermedia) {
        this.idefechaintermedia = idefechaintermedia;
    }

    public String getIdetapaintermedia() {
        return idetapaintermedia;
    }

    public void setIdetapaintermedia(String idetapaintermedia) {
        this.idetapaintermedia = idetapaintermedia;
    }

    public String getIdpena() {
        return idpena;
    }

    public void setIdpena(String idpena) {
        this.idpena = idpena;
    }

    public String getIdreparaciondeldaño() {
        return idreparaciondeldaño;
    }

    public void setIdreparaciondeldaño(String idreparaciondeldaño) {
        this.idreparaciondeldaño = idreparaciondeldaño;
    }

    public String getIdfecha2() {
        return idfecha2;
    }

    public void setIdfecha2(String idfecha2) {
        this.idfecha2 = idfecha2;
    }

    public String getIdfechas() {
        return idfechas;
    }

    public void setIdfechas(String idfechas) {
        this.idfechas = idfechas;
    }

    public String getIdsolucionesalternas() {
        return idsolucionesalternas;
    }

    public void setIdsolucionesalternas(String idsolucionesalternas) {
        this.idsolucionesalternas = idsolucionesalternas;
    }

    public String getIdtermino() {
        return idtermino;
    }

    public void setIdtermino(String idtermino) {
        this.idtermino = idtermino;
    }

  
    public String getIdresolucionMp() {
        return idresolucionMp;
    }

    public void setIdresolucionMp(String idresolucionMp) {
        this.idresolucionMp = idresolucionMp;
    }

    public String getIdseconsede() {
        return idseconsede;
    }

    public void setIdseconsede(String idseconsede) {
        this.idseconsede = idseconsede;
    }

    public String getIdsiseconsede() {
        return idsiseconsede;
    }

    public void setIdsiseconsede(String idsiseconsede) {
        this.idsiseconsede = idsiseconsede;
    }

    public String getIdestadoactualcarpeta() {
        return idestadoactualcarpeta;
    }

    public void setIdestadoactualcarpeta(String idestadoactualcarpeta) {
        this.idestadoactualcarpeta = idestadoactualcarpeta;
    }
 
 public ImputadoFacadeLocal getImputadoEJB() {
        return imputadoEJB;
    }

    public void setImputadoEJB(ImputadoFacadeLocal imputadoEJB) {
        this.imputadoEJB = imputadoEJB;
    }

    public RelacionCarpetaImputadoFacadeLocal getRelacioncarpetaimputadoEJB() {
        return relacioncarpetaimputadoEJB;
    }

    public void setRelacioncarpetaimputadoEJB(RelacionCarpetaImputadoFacadeLocal relacioncarpetaimputadoEJB) {
        this.relacioncarpetaimputadoEJB = relacioncarpetaimputadoEJB;
    }

    public SexoFacadeLocal getSexoEJB() {
        return sexoEJB;
    }

    public void setSexoEJB(SexoFacadeLocal sexoEJB) {
        this.sexoEJB = sexoEJB;
    }
 
 public List<RelacionCarpetaImputado> getRelacioncarpetaimpp() {
        relacioncarpetaimpp= relacioncarpetaimputadoEJB.findAll();
        return relacioncarpetaimpp;
    }

    public void setRelacioncarpetaimpp(List<RelacionCarpetaImputado> relacioncarpetaimpp) {
        this.relacioncarpetaimpp = relacioncarpetaimpp;
    }

    public List<Imputado> getImputados() {
         imputados=imputadoEJB.findAll();
        return imputados;
    }

    public void setImputados(List<Imputado> imputados) {
        this.imputados = imputados;
    }

    public List<Sexo> getSexoo() {
        sexoo = sexoEJB.findAll();
        return sexoo;
    }

   
    public void setSexoo(List<Sexo> sexoo) {
        this.sexoo = sexoo;
    }

      // fin relacion carpeta imputado           
    
    
 
    public CarpetaFacadeLocal getCarpetaEJB() {
        return carpetaEJB;
    }

    public void setCarpetaEJB(CarpetaFacadeLocal carpetaEJB) {
        this.carpetaEJB = carpetaEJB;
    }

    public ComboCSDFacadeLocal getCombocsdEJB() {
        return combocsdEJB;
    }

    public void setCombocsdEJB(ComboCSDFacadeLocal combocsdEJB) {
        this.combocsdEJB = combocsdEJB;
    }

    public PuestaADisposicionFacadeLocal getPuestaadispoEJB() {
        return puestaadispoEJB;
    }

    public void setPuestaadispoEJB(PuestaADisposicionFacadeLocal puestaadispoEJB) {
        this.puestaadispoEJB = puestaadispoEJB;
    }

    public ProcedenciaFacadeLocal getProcedenciaEJB() {
        return procedenciaEJB;
    }

    public void setProcedenciaEJB(ProcedenciaFacadeLocal procedenciaEJB) {
        this.procedenciaEJB = procedenciaEJB;
    }

    public UnidadDeGestionFacadeLocal getUnidadgestionEJB() {
        return unidadgestionEJB;
    }

    public void setUnidadgestionEJB(UnidadDeGestionFacadeLocal unidadgestionEJB) {
        this.unidadgestionEJB = unidadgestionEJB;
    }

    public MpQueTrabajaFacadeLocal getMptrabajaEJB() {
        return mptrabajaEJB;
    }

    public void setMptrabajaEJB(MpQueTrabajaFacadeLocal mptrabajaEJB) {
        this.mptrabajaEJB = mptrabajaEJB;
    }

    public HidtoriaCarpetaFacadeLocal getHistoriacarpetafacade() {
        return Historiacarpetafacade;
    }

    public void setHistoriacarpetafacade(HidtoriaCarpetaFacadeLocal Historiacarpetafacade) {
        this.Historiacarpetafacade = Historiacarpetafacade;
    }

    public String getIdcarpeta() {
        return idcarpeta;
    }

    public void setIdcarpeta(String idcarpeta) {
        this.idcarpeta = idcarpeta;
    }
    
 
    ///////////////////////////////////////////////////////
    public List<Carpeta> getListaCarpeta() {
        listaCarpeta = carpetaEJB.findAll();
        return listaCarpeta;
    }

    public void setListaCarpeta(List<Carpeta> listaCarpeta) {
        this.listaCarpeta = listaCarpeta;
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
        RelacionCarpetaHistoriaa = relacioncarphistofacade.findAll();
        return RelacionCarpetaHistoriaa;
    }

    public void setRelacionCarpetaHistoriaa(List<RelacionCarpetaHistoria> RelacionCarpetaHistoriaa) {
        this.RelacionCarpetaHistoriaa = RelacionCarpetaHistoriaa;
    }

    public String getIdRelacionCarpetaHistoria() {
        return idRelacionCarpetaHistoria;
    }

    public void setIdRelacionCarpetaHistoria(String idRelacionCarpetaHistoria) {
        this.idRelacionCarpetaHistoria = idRelacionCarpetaHistoria;
    }

    public String getIdsexo() {
        return idsexo;
    }

    public void setIdsexo(String idsexo) {
        this.idsexo = idsexo;
    }
 
 
 
 
 
 /////////////////////////////////////////////////////////////////////////////////////////////////

    public HidtoriaCarpeta getHidtoriacarpeta() {
        return hidtoriacarpeta;
    }

    public void setHidtoriacarpeta(HidtoriaCarpeta hidtoriacarpeta) {
        this.hidtoriacarpeta = hidtoriacarpeta;
    }

    public List<HidtoriaCarpeta> getHidtoriacarpetaa() {
        hidtoriacarpetaa = Historiacarpetafacade.findAll();
        return hidtoriacarpetaa;
    }

    public void setHidtoriacarpetaa(List<HidtoriaCarpeta> hidtoriacarpetaa) {
        this.hidtoriacarpetaa = hidtoriacarpetaa;
    }

    public String getIdhistoriacarp() {
        return idhistoriacarp;
    }

    public void setIdhistoriacarp(String idhistoriacarp) {
        this.idhistoriacarp = idhistoriacarp;
    }
    
    
     public RelacionCarpetaImputado getRelacioncarpetaimputado() {
        return relacioncarpetaimputado;
    }

    public void setRelacioncarpetaimputado(RelacionCarpetaImputado relacioncarpetaimputado) {
        this.relacioncarpetaimputado = relacioncarpetaimputado;
    }

    public Imputado getImputado() {
        return imputado;
    }

    public void setImputado(Imputado imputado) {
        this.imputado = imputado;
    }

    public Sexo getSexo() {
        return sexo;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getIdRelacionCarpetaImputado() {
        return idRelacionCarpetaImputado;
    }

    public void setIdRelacionCarpetaImputado(String idRelacionCarpetaImputado) {
        this.idRelacionCarpetaImputado = idRelacionCarpetaImputado;
    }

    public String getIdimputado() {
        return idimputado;
    }

    public void setIdimputado(String idimputado) {
        this.idimputado = idimputado;
    }
    public String getIdhistoria() {
        return idhistoria;
    }

    public void setIdhistoria(String idhistoria) {
        this.idhistoria = idhistoria;
    }
 

    public String getIdmptrabaja() {
        return idmptrabaja;
    }

    public void setIdmptrabaja(String idmptrabaja) {
        this.idmptrabaja = idmptrabaja;
    }
 
 
 
    public String getIdprocedencia() {
        return idprocedencia;
    }

    public void setIdprocedencia(String idprocedencia) {
        this.idprocedencia = idprocedencia;
    }

    public String getIdunidadgestion() {
        return idunidadgestion;
    }

    public void setIdunidadgestion(String idunidadgestion) {
        this.idunidadgestion = idunidadgestion;
    }
 

 
    public String getIdpuestadisp() {
        return idpuestadisp;
    }

    public void setIdpuestadisp(String idpuestadisp) {
        this.idpuestadisp = idpuestadisp;
    }
 
 
 

    public String getIdCSD() {
        return idCSD;
    }
    
  

    public void setIdCSD(String idCSD) {
        this.idCSD = idCSD;
    }
   
  

    public Carpeta getCarpeta() {
        return carpeta;
    }

    public void setCarpeta(Carpeta carpeta) {
        this.carpeta = carpeta;
    }

    public ComboCSD getCombocsd() {
        return combocsd;
    }

    public void setCombocsd(ComboCSD combocsd) {
        this.combocsd = combocsd;
    }

    public PuestaADisposicion getPuestaadispo() {
        return puestaadispo;
    }

    public void setPuestaadispo(PuestaADisposicion puestaadispo) {
        this.puestaadispo = puestaadispo;
    }

    public Procedencia getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(Procedencia procedencia) {
        this.procedencia = procedencia;
    }

    public UnidadDeGestion getUnidadgestion() {
        return unidadgestion;
    }

    public void setUnidadgestion(UnidadDeGestion unidadgestion) {
        this.unidadgestion = unidadgestion;
    }

    public MpQueTrabaja getMptrabaja() {
        return mptrabaja;
    }

    public void setMptrabaja(MpQueTrabaja mptrabaja) {
        this.mptrabaja = mptrabaja;
    }


    
    public List<ComboCSD> getCombocsdd() {
         combocsdd= combocsdEJB.findAll();
   
        return combocsdd;
    }

    public void setCombocsdd(List<ComboCSD> combocsdd) {
        this.combocsdd = combocsdd;
    }

   
    
    public List<PuestaADisposicion> getPuestaadispoo() {
        puestaadispoo = puestaadispoEJB.findAll();
        return puestaadispoo;
    }

    public void setPuestaadispoo(List<PuestaADisposicion> puestaadispoo) {
        this.puestaadispoo = puestaadispoo;
    }

    public List<Procedencia> getProcedenciaa() {
         procedenciaa = procedenciaEJB.findAll();
        return procedenciaa;
    }

    public void setProcedenciaa(List<Procedencia> procedenciaa) {
        this.procedenciaa = procedenciaa;
    }

    public List<UnidadDeGestion> getUnidadgestionn() {
        unidadgestionn = unidadgestionEJB.findAll();
        return unidadgestionn;
    }

    public void setUnidadgestionn(List<UnidadDeGestion> unidadgestionn) {
        this.unidadgestionn = unidadgestionn;
    }

    public List<MpQueTrabaja> getMptrabajaa() {
        mptrabajaa = mptrabajaEJB.findAll();
        return mptrabajaa;
    }

    public void setMptrabajaa(List<MpQueTrabaja> mptrabajaa) {
        this.mptrabajaa = mptrabajaa;
    }
   
    
    
    
    public void prepararModificar(ActionEvent e){
      
        
       int indice = Integer.parseInt(e.getComponent().getClientId().split(":")[2]);
        System.out.println("Dato " + e.getComponent().getClientId());
          System.out.println("Dato " + indice);
      // victimamenor = listavmenor.get(indice);
    // relacioncarpetahistoria =  RelacionCarpetaHistoriaa.get(indice);
    relacioncarpetaimputado = relacioncarpetaimpp.get(indice);
    carpeta= relacioncarpetaimputado.getFkCarpeta();
    imputado = relacioncarpetaimputado.getFkImputado();
    datosespecificosdeimputado  = relacioncarpetaimputado.getFkDatosExtraI();
    procedimiento = relacioncarpetaimputado.getFkProcedimientoAbre();
    fechaintermedia = relacioncarpetaimputado.getFkFechaIntermedia();
    fecha2= relacioncarpetaimputado.getFkFecha2();
    fecha = relacioncarpetaimputado.getFkFechas();
    termino= relacioncarpetaimputado.getFkTermino();
    pena= fechaintermedia.getFkPena();
    reparacion=pena.getFkReparacionDaño();
    abogado = datosespecificosdeimputado.getFkAbogado();
    calificacion = datosespecificosdeimputado.getFkCalificacionDh();
    proceabreviado = procedimiento.getFkProcedimientoOp();
    tipofallo = procedimiento.getFkTipodeFallo();
    etapainter= fechaintermedia.getFkEtapaIntermedia();
    tipofallo= fechaintermedia.getFkTipoDeFallo();
    solucionesalternas =fecha.getFkSolucionesAlternas();
    resolucionmp= termino.getFkResolucion();
    seconsede = termino.getFkSeconcedeNiega();
    siconsede = termino.getFkConsedeNiega();
    estadoactual = termino.getFkEstadoActualCarapeta();
    
       // System.out.println("Persona " + persona.getNombres());
       //persona = personaFacade.find(usuario.getPCodigo().getCodigoP());
        accion="modificar";
        botonC="Guardar";
      //  relacioncarpetaimputadoEJB.edit(relacioncarpetaimputado);  
    }
    
       public void procesarAccion(){

  try{
          relacioncarpetaimputadoEJB.edit(relacioncarpetaimputado);  
          carpetaEJB.edit(carpeta);
          imputadoEJB.edit(imputado);
          datosespecificosEJB.edit(datosespecificosdeimputado);
          procediabreviadEJB.edit(procedimiento);
          fechaintermediaEJB.edit(fechaintermedia);
          fecha2EJB.edit(fecha2);
          fechasEJB.edit(fecha);
          terminoEJB.edit(termino);
          
          penaEJB.edit(pena);
          reparaciondeldañoEJB.edit(reparacion);
          abogadoEJB.edit(abogado);
          calificacionEJB.edit(calificacion);
          procedimientoEJB.edit(proceabreviado);
          tipofalloEJB.edit(tipofallo);
          etapaintermediaEJB.edit(etapainter);
          solucionesEJB.edit(solucionesalternas);
          resolucionEJB.edit(resolucionmp);
          seconsedeEJB.edit(seconsede);
          siconsedeEJB.edit(siconsede);
          estadoEJB.edit(estadoactual);
            
          
          
         
          

        // usuarioEJB.edit(usuario); 
        // personaFacade.edit(persona);
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Registro Modificado"));
}catch (Exception e){
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error"));
    }}
       
  public void crear(){
  
   try{    
     
      hidtoriacarpeta = Historiacarpetafacade.find((Integer) Integer.parseInt(idRelacionCarpetaHistoria)); 
      this.relacioncarpetahistoria.setFkHistoriaOp(hidtoriacarpeta);
       this.relacioncarpetahistoria.setFkCarpeta(carpeta);
        relacioncarphistofacade.create(relacioncarpetahistoria);
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Datos guardados con exito"));
        }catch (Exception e){
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error"));
       }
  }

   public void registrar(){
       /*double a = 2.5;
       int x;
       x = (int) a;
       short d;
       d = (short) x;*/
       //System.out.println("Datossss " + idRelacionCarpetaHistoria);
      // HistoriaBean as= new HistoriaBean();      
      
        try{    
    // persona = personaEJB.find((Integer) Integer.parseInt(idpersona));
      hidtoriacarpeta = Historiacarpetafacade.find((Integer) Integer.parseInt(idRelacionCarpetaHistoria));  
     
      combocsd=combocsdEJB.find((Integer)Integer.parseInt(idCSD));
      
     
      puestaadispo=puestaadispoEJB.find((Integer)Integer.parseInt(idpuestadisp));
      if (!idprocedencia.equals("a") ){
      procedencia=procedenciaEJB.find((Integer)Integer.parseInt(idprocedencia)); }
     //if (!idunidadgestion.equals("") )
      if (!idunidadgestion.equals("na") ){
            unidadgestion=unidadgestionEJB.find((Integer)Integer.parseInt(idunidadgestion));}
     if (!idmptrabaja.equals("y") ){
      mptrabaja=mptrabajaEJB.find((Integer)Integer.parseInt(idmptrabaja));}
      if (!idreparaciondeldaño.equals("pe") ){
     reparacion= reparaciondeldañoEJB.find((Integer) Integer.parseInt(idreparaciondeldaño));}
       if (!idtipodefallo.equals("f") ){
     tipofallo = tipofalloEJB.find((Integer) Integer.parseInt(idtipodefallo));}
     if (!idetapaintermedia.equals("u") ){
     etapainter =etapaintermediaEJB.find((Integer) Integer.parseInt(idetapaintermedia));}
       if (!idcalificaciondh.equals("c") ){
    calificacion =calificacionEJB.find((Integer) Integer.parseInt(idcalificaciondh));}
     if (!idabogado.equals("b") ){
     abogado=abogadoEJB.find((Integer) Integer.parseInt(idabogado));}
     if (!idestadoactualcarpeta.equals("t") ){
     estadoactual =estadoEJB.find((Integer) Integer.parseInt(idestadoactualcarpeta));}
     if (!idseconsede.equals("pl") ){
     seconsede =seconsedeEJB.find((Integer) Integer.parseInt(idseconsede));}
      if (!idsiseconsede.equals("si") ){
     siconsede =siconsedeEJB.find((Integer) Integer.parseInt(idsiseconsede));}
      if (!idresolucionMp.equals("x") ){
     resolucionmp = resolucionEJB.find((Integer) Integer.parseInt(idresolucionMp));}
      if (!idprocedimiento.equals("proce") ){
      proceabreviado = procedimientoEJB.find((Integer) Integer.parseInt(idprocedimiento));}
     if (!idsexo.equals("se") ){
      sexo=sexoEJB.find((Integer) Integer.parseInt(idsexo));}
     
       this.relacioncarpetaimputado.setFkCarpeta(carpeta);
       this.relacioncarpetaimputado.setFkImputado(imputado);
       this.relacioncarpetaimputado.setFkDatosExtraI(datosespecificosdeimputado);
       this.relacioncarpetaimputado.setFkProcedimientoAbre(procedimiento);
       this.relacioncarpetaimputado.setFkFechaIntermedia(fechaintermedia);
       this.relacioncarpetaimputado.setFkFecha2(fecha2);
       this.relacioncarpetaimputado.setFkFechas(fecha);
       this.relacioncarpetaimputado.setFkTermino(termino);
       
      if (!idtipodefallo.equals("f") ){
       this.fechaintermedia.setFkTipoDeFallo(tipofallo);}
        if (!idetapaintermedia.equals("u") ){
       this.fechaintermedia.setFkEtapaIntermedia(etapainter);}
       this.fechaintermedia.setFkPena(pena);
      if (!idreparaciondeldaño.equals("pe") ){
       this.pena.setFkReparacionDaño(reparacion); }
        
       this.carpeta.setFkCsd(combocsd);
     
      // Usuario us=(Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
      // this.carpeta.setCodigoP(us.getPCodigo());
       this.carpeta.setFkPuestaDisposicion(puestaadispo);
       if (!idprocedencia.equals("a") ){
       this.carpeta.setFkProcedencia(procedencia);}
       
       if (!idunidadgestion.equals("na") ){
       this.carpeta.setFkUnidadGestion(unidadgestion);}
         if (!idmptrabaja.equals("y") ){
       this.carpeta.setFkMPTrabaja(mptrabaja);}
         
       
       this.relacioncarpetahistoria.setFkHistoriaOp(hidtoriacarpeta);
       this.relacioncarpetahistoria.setFkCarpeta(carpeta);
       if (!idcalificaciondh.equals("c") ){
       this.datosespecificosdeimputado.setFkCalificacionDh(calificacion);}
       if (!idabogado.equals("b") ){ 
       this.datosespecificosdeimputado.setFkAbogado(abogado);}
      // this.fecha.setFkSolucionesAlternas(solucionesalternas);
      
      
            if (!idestadoactualcarpeta.equals("t") ){
      this.termino.setFkEstadoActualCarapeta(estadoactual);}
         if (!idresolucionMp.equals("x") ){
     this.termino.setFkResolucion(resolucionmp);}
     if (!idseconsede.equals("pl") ){
     this.termino.setFkSeconcedeNiega(seconsede);}
     if (!idsiseconsede.equals("si") ){
     this.termino.setFkConsedeNiega(siconsede);}
     if (!idprocedimiento.equals("proce") ){
     this.procedimiento.setFkProcedimientoOp(proceabreviado);}
     if (!idtipodefallo.equals("f") ){
     this.procedimiento.setFkTipodeFallo(tipofallo);}
     this.fecha.setFkSolucionesAlternas(solucionesalternas);
    if (!idsexo.equals("se") ){
     this.imputado.setFkSexo(sexo);}
     if (!idsexo.equals("se") ){
     this.victimapersona.setFkSexo(sexo);}
     if (!idsexo.equals("se") ){
    this.victimamenor.setFkSexo(sexo);}
 
    this.relacionvictimaempresa.setFkVe(victimaempresa);
     this.relacionvictimaempresa.setFkCarpeta(carpeta);
      this.carpetajuez.setFkCarpeta(carpeta);
      this.carpetajuez.setFkNombreJuezTurnoControl(juezcontrol);
   this.relacionvictimacar.setFkCarpeta(carpeta);
   this.relacionvictimacar.setFkVictima(victimapersona);
   this.relacionvictimacar.setFkDatosV(datosv);
  // this.relacionmenor.setFkDatosV(datosv);
  // this.relacionmenor.setFkRelacionCarpeta(carpeta);
  // this.relacionmenor.setFkVm(victimamenor);
     
      penaEJB.create(pena);
      fechaintermediaEJB.create(fechaintermedia);
      carpetaEJB.create(carpeta);
     
      relacioncarphistofacade.create(relacioncarpetahistoria);
        juezcontrolEJB.create(juezcontrol);
      relacioncarpetajuezEJB.create(carpetajuez);
     
     fecha2EJB.create(fecha2);
      datosespecificosEJB.create(datosespecificosdeimputado);
      terminoEJB.create(termino);
      procediabreviadEJB.create(procedimiento);
     solucionesEJB.create(solucionesalternas);
   
      fechasEJB.create(fecha);
      imputadoEJB.create(imputado);
       relacioncarpetaimputadoEJB.create(relacioncarpetaimputado);
       victimaempresaEJB.create(victimaempresa);
      relacionvictimaEJB.create(relacionvictimaempresa);
      victimaPersonaEJB.create(victimapersona);
      victimaMenorEJB.create(victimamenor);
      datosespecificosvEJB.create(datosv);
      // relacionvictimacarpetaEJB.create(relacionmenor);
      relacionvicperEJB.create(relacionvictimacar);
       
       
      
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Se registro con exito"));
        }catch (Exception e){
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error"));
       }
   }
   
   
   
  
   
   
   
    public CarpetaBean() {
         carpeta   = new Carpeta(); 
        
    }
    
}