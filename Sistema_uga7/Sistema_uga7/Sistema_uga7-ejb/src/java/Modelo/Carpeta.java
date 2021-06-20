/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ANA
 */
@Entity
@Table(name = "carpeta", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carpeta.findAll", query = "SELECT c FROM Carpeta c")
    , @NamedQuery(name = "Carpeta.findByIdCarpeta", query = "SELECT c FROM Carpeta c WHERE c.idCarpeta = :idCarpeta")
    , @NamedQuery(name = "Carpeta.findByA\u00f1o", query = "SELECT c FROM Carpeta c WHERE c.a\u00f1o = :a\u00f1o")
    , @NamedQuery(name = "Carpeta.findByCarpetaDeInvestigacion", query = "SELECT c FROM Carpeta c WHERE c.carpetaDeInvestigacion = :carpetaDeInvestigacion")
    , @NamedQuery(name = "Carpeta.findByFechaDeInicio", query = "SELECT c FROM Carpeta c WHERE c.fechaDeInicio = :fechaDeInicio")
    , @NamedQuery(name = "Carpeta.findByMPPropone", query = "SELECT c FROM Carpeta c WHERE c.mPPropone = :mPPropone")
    , @NamedQuery(name = "Carpeta.findByCarpetaJudicial", query = "SELECT c FROM Carpeta c WHERE c.carpetaJudicial = :carpetaJudicial")
    , @NamedQuery(name = "Carpeta.findByCarpetasJudicialesAcumuladas", query = "SELECT c FROM Carpeta c WHERE c.carpetasJudicialesAcumuladas = :carpetasJudicialesAcumuladas")
    , @NamedQuery(name = "Carpeta.findByCarpetasDeOrigenIncompetencia", query = "SELECT c FROM Carpeta c WHERE c.carpetasDeOrigenIncompetencia = :carpetasDeOrigenIncompetencia")
    , @NamedQuery(name = "Carpeta.findByFecha", query = "SELECT c FROM Carpeta c WHERE c.fecha = :fecha")})
public class Carpeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_carpeta")
    private Integer idCarpeta;
    @Basic(optional = false)
    @Column(name = "a\u00f1o")
    private Integer año;
    @Basic(optional = false)
    @Column(name = "carpeta_de_investigacion")
    private String carpetaDeInvestigacion;
    @Column(name = "fecha_de_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaDeInicio;
    @Column(name = "m_p_propone")
    private String mPPropone;
    @Column(name = "carpeta_judicial")
    private String carpetaJudicial;
    @Column(name = "carpetas_judiciales_acumuladas")
    private String carpetasJudicialesAcumuladas;
    @Column(name = "carpetas_de_origen_incompetencia")
    private String carpetasDeOrigenIncompetencia;
    @Basic(optional = false)
    @Column(name = "fecha", insertable=false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "fk_m_p_trabaja", referencedColumnName = "id_mp_trabaja")
    @ManyToOne
    private MpQueTrabaja fkMPTrabaja;
    @JoinColumn(name = "fk_unidad_gestion", referencedColumnName = "id_unidad_gestion")
    @ManyToOne
    private UnidadDeGestion fkUnidadGestion;
    @JoinColumn(name = "fk_puesta_disposicion", referencedColumnName = "id_puesta_disp")
    @ManyToOne
    private PuestaADisposicion fkPuestaDisposicion;
    @JoinColumn(name = "fk_procedencia", referencedColumnName = "id_procedencia")
    @ManyToOne
    private Procedencia fkProcedencia;
    @JoinColumn(name = "fk_csd", referencedColumnName = "id_csd")
    @ManyToOne
    private ComboCSD fkCsd;
    @JoinColumn(name = "codigo_p", referencedColumnName = "codigo_p")
    @ManyToOne(optional = false)
    private Persona codigoP;

    public Carpeta() {
    }

    public Carpeta(Integer idCarpeta) {
        this.idCarpeta = idCarpeta;
    }

    public Carpeta(Integer idCarpeta, Integer año, String carpetaDeInvestigacion, Date fecha) {
        this.idCarpeta = idCarpeta;
        this.año = año;
        this.carpetaDeInvestigacion = carpetaDeInvestigacion;
        this.fecha = fecha;
    }

    public Integer getIdCarpeta() {
        return idCarpeta;
    }

    public void setIdCarpeta(Integer idCarpeta) {
        this.idCarpeta = idCarpeta;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public String getCarpetaDeInvestigacion() {
        return carpetaDeInvestigacion;
    }

    public void setCarpetaDeInvestigacion(String carpetaDeInvestigacion) {
        this.carpetaDeInvestigacion = carpetaDeInvestigacion;
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public String getMPPropone() {
        return mPPropone;
    }

    public void setMPPropone(String mPPropone) {
        this.mPPropone = mPPropone;
    }

    public String getCarpetaJudicial() {
        return carpetaJudicial;
    }

    public void setCarpetaJudicial(String carpetaJudicial) {
        this.carpetaJudicial = carpetaJudicial;
    }

    public String getCarpetasJudicialesAcumuladas() {
        return carpetasJudicialesAcumuladas;
    }

    public void setCarpetasJudicialesAcumuladas(String carpetasJudicialesAcumuladas) {
        this.carpetasJudicialesAcumuladas = carpetasJudicialesAcumuladas;
    }

    public String getCarpetasDeOrigenIncompetencia() {
        return carpetasDeOrigenIncompetencia;
    }

    public void setCarpetasDeOrigenIncompetencia(String carpetasDeOrigenIncompetencia) {
        this.carpetasDeOrigenIncompetencia = carpetasDeOrigenIncompetencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public MpQueTrabaja getFkMPTrabaja() {
        return fkMPTrabaja;
    }

    public void setFkMPTrabaja(MpQueTrabaja fkMPTrabaja) {
        this.fkMPTrabaja = fkMPTrabaja;
    }

    public UnidadDeGestion getFkUnidadGestion() {
        return fkUnidadGestion;
    }

    public void setFkUnidadGestion(UnidadDeGestion fkUnidadGestion) {
        this.fkUnidadGestion = fkUnidadGestion;
    }

    public PuestaADisposicion getFkPuestaDisposicion() {
        return fkPuestaDisposicion;
    }

    public void setFkPuestaDisposicion(PuestaADisposicion fkPuestaDisposicion) {
        this.fkPuestaDisposicion = fkPuestaDisposicion;
    }

    public Procedencia getFkProcedencia() {
        return fkProcedencia;
    }

    public void setFkProcedencia(Procedencia fkProcedencia) {
        this.fkProcedencia = fkProcedencia;
    }

    public ComboCSD getFkCsd() {
        return fkCsd;
    }

    public void setFkCsd(ComboCSD fkCsd) {
        this.fkCsd = fkCsd;
    }

    public Persona getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(Persona codigoP) {
        this.codigoP = codigoP;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCarpeta != null ? idCarpeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carpeta)) {
            return false;
        }
        Carpeta other = (Carpeta) object;
        if ((this.idCarpeta == null && other.idCarpeta != null) || (this.idCarpeta != null && !this.idCarpeta.equals(other.idCarpeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Carpeta[ idCarpeta=" + idCarpeta + " ]";
    }
    
}
