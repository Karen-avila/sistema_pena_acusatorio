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
@Table(name = "termino", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Termino.findAll", query = "SELECT t FROM Termino t")
    , @NamedQuery(name = "Termino.findByIdTermino", query = "SELECT t FROM Termino t WHERE t.idTermino = :idTermino")
    , @NamedQuery(name = "Termino.findByPuntosResolutivosSentencia", query = "SELECT t FROM Termino t WHERE t.puntosResolutivosSentencia = :puntosResolutivosSentencia")
    , @NamedQuery(name = "Termino.findByFechaRecursoImpuesto", query = "SELECT t FROM Termino t WHERE t.fechaRecursoImpuesto = :fechaRecursoImpuesto")
    , @NamedQuery(name = "Termino.findByTribunalJuicioOral", query = "SELECT t FROM Termino t WHERE t.tribunalJuicioOral = :tribunalJuicioOral")
    , @NamedQuery(name = "Termino.findByCarpetaEjecucion", query = "SELECT t FROM Termino t WHERE t.carpetaEjecucion = :carpetaEjecucion")
    , @NamedQuery(name = "Termino.findByFechaEnvioFiscaliaEjecucion", query = "SELECT t FROM Termino t WHERE t.fechaEnvioFiscaliaEjecucion = :fechaEnvioFiscaliaEjecucion")
    , @NamedQuery(name = "Termino.findByFechaAudienciaEjecucion", query = "SELECT t FROM Termino t WHERE t.fechaAudienciaEjecucion = :fechaAudienciaEjecucion")
    , @NamedQuery(name = "Termino.findByTipoDeBeneficioConcedido", query = "SELECT t FROM Termino t WHERE t.tipoDeBeneficioConcedido = :tipoDeBeneficioConcedido")
    , @NamedQuery(name = "Termino.findByResolucionEjecucion", query = "SELECT t FROM Termino t WHERE t.resolucionEjecucion = :resolucionEjecucion")
    , @NamedQuery(name = "Termino.findByFechaAsuntoConcluido", query = "SELECT t FROM Termino t WHERE t.fechaAsuntoConcluido = :fechaAsuntoConcluido")
    , @NamedQuery(name = "Termino.findByFechaRemitidaSentencia", query = "SELECT t FROM Termino t WHERE t.fechaRemitidaSentencia = :fechaRemitidaSentencia")
    , @NamedQuery(name = "Termino.findByFechaAbreviadoCondenatorio", query = "SELECT t FROM Termino t WHERE t.fechaAbreviadoCondenatorio = :fechaAbreviadoCondenatorio")
    , @NamedQuery(name = "Termino.findByFechaAudiencia", query = "SELECT t FROM Termino t WHERE t.fechaAudiencia = :fechaAudiencia")})
public class Termino implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_termino")
    private Integer idTermino;
    @Column(name = "puntos_resolutivos_sentencia")
    private String puntosResolutivosSentencia;
    @Column(name = "fecha_recurso_impuesto")
    private String fechaRecursoImpuesto;
    @Column(name = "tribunal_juicio_oral")
    private String tribunalJuicioOral;
    @Column(name = "carpeta_ejecucion")
    private String carpetaEjecucion;
    @Column(name = "fecha_envio_fiscalia_ejecucion")
    private String fechaEnvioFiscaliaEjecucion;
    @Column(name = "fecha_audiencia_ejecucion")
    @Temporal(TemporalType.DATE)
    private Date fechaAudienciaEjecucion;
    @Column(name = "tipo_de_beneficio_concedido")
    private String tipoDeBeneficioConcedido;
    @Column(name = "resolucion_ejecucion")
    private String resolucionEjecucion;
    @Column(name = "fecha_asunto_concluido")
    @Temporal(TemporalType.DATE)
    private Date fechaAsuntoConcluido;
    @Column(name = "fecha_remitida_sentencia")
    @Temporal(TemporalType.DATE)
    private Date fechaRemitidaSentencia;
    @Column(name = "fecha_abreviado_condenatorio")
    @Temporal(TemporalType.DATE)
    private Date fechaAbreviadoCondenatorio;
    @Column(name = "fecha_audiencia")
    @Temporal(TemporalType.DATE)
    private Date fechaAudiencia;
    @JoinColumn(name = "fk_consede_niega", referencedColumnName = "id_se_consede")
    @ManyToOne
    private SiseConsedeOpcionesSi fkConsedeNiega;
    @JoinColumn(name = "fk_estado_actual_carapeta", referencedColumnName = "id_estado")
    @ManyToOne
    private EstadoActualDeCarpeta fkEstadoActualCarapeta;
    @JoinColumn(name = "fk_seconcede_niega", referencedColumnName = "id_opciones")
    @ManyToOne
    private SeconsedeOpciones fkSeconcedeNiega;
    @JoinColumn(name = "fk_resolucion", referencedColumnName = "id_resolucion")
    @ManyToOne
    private ResolucionApelacionMp fkResolucion;

    public Termino() {
    }

    public Termino(Integer idTermino) {
        this.idTermino = idTermino;
    }

    public Integer getIdTermino() {
        return idTermino;
    }

    public void setIdTermino(Integer idTermino) {
        this.idTermino = idTermino;
    }

    public String getPuntosResolutivosSentencia() {
        return puntosResolutivosSentencia;
    }

    public void setPuntosResolutivosSentencia(String puntosResolutivosSentencia) {
        this.puntosResolutivosSentencia = puntosResolutivosSentencia;
    }

    public String getFechaRecursoImpuesto() {
        return fechaRecursoImpuesto;
    }

    public void setFechaRecursoImpuesto(String fechaRecursoImpuesto) {
        this.fechaRecursoImpuesto = fechaRecursoImpuesto;
    }

    public String getTribunalJuicioOral() {
        return tribunalJuicioOral;
    }

    public void setTribunalJuicioOral(String tribunalJuicioOral) {
        this.tribunalJuicioOral = tribunalJuicioOral;
    }

    public String getCarpetaEjecucion() {
        return carpetaEjecucion;
    }

    public void setCarpetaEjecucion(String carpetaEjecucion) {
        this.carpetaEjecucion = carpetaEjecucion;
    }

    public String getFechaEnvioFiscaliaEjecucion() {
        return fechaEnvioFiscaliaEjecucion;
    }

    public void setFechaEnvioFiscaliaEjecucion(String fechaEnvioFiscaliaEjecucion) {
        this.fechaEnvioFiscaliaEjecucion = fechaEnvioFiscaliaEjecucion;
    }

    public Date getFechaAudienciaEjecucion() {
        return fechaAudienciaEjecucion;
    }

    public void setFechaAudienciaEjecucion(Date fechaAudienciaEjecucion) {
        this.fechaAudienciaEjecucion = fechaAudienciaEjecucion;
    }

    public String getTipoDeBeneficioConcedido() {
        return tipoDeBeneficioConcedido;
    }

    public void setTipoDeBeneficioConcedido(String tipoDeBeneficioConcedido) {
        this.tipoDeBeneficioConcedido = tipoDeBeneficioConcedido;
    }

    public String getResolucionEjecucion() {
        return resolucionEjecucion;
    }

    public void setResolucionEjecucion(String resolucionEjecucion) {
        this.resolucionEjecucion = resolucionEjecucion;
    }

    public Date getFechaAsuntoConcluido() {
        return fechaAsuntoConcluido;
    }

    public void setFechaAsuntoConcluido(Date fechaAsuntoConcluido) {
        this.fechaAsuntoConcluido = fechaAsuntoConcluido;
    }

    public Date getFechaRemitidaSentencia() {
        return fechaRemitidaSentencia;
    }

    public void setFechaRemitidaSentencia(Date fechaRemitidaSentencia) {
        this.fechaRemitidaSentencia = fechaRemitidaSentencia;
    }

    public Date getFechaAbreviadoCondenatorio() {
        return fechaAbreviadoCondenatorio;
    }

    public void setFechaAbreviadoCondenatorio(Date fechaAbreviadoCondenatorio) {
        this.fechaAbreviadoCondenatorio = fechaAbreviadoCondenatorio;
    }

    public Date getFechaAudiencia() {
        return fechaAudiencia;
    }

    public void setFechaAudiencia(Date fechaAudiencia) {
        this.fechaAudiencia = fechaAudiencia;
    }

    public SiseConsedeOpcionesSi getFkConsedeNiega() {
        return fkConsedeNiega;
    }

    public void setFkConsedeNiega(SiseConsedeOpcionesSi fkConsedeNiega) {
        this.fkConsedeNiega = fkConsedeNiega;
    }

    public EstadoActualDeCarpeta getFkEstadoActualCarapeta() {
        return fkEstadoActualCarapeta;
    }

    public void setFkEstadoActualCarapeta(EstadoActualDeCarpeta fkEstadoActualCarapeta) {
        this.fkEstadoActualCarapeta = fkEstadoActualCarapeta;
    }

    public SeconsedeOpciones getFkSeconcedeNiega() {
        return fkSeconcedeNiega;
    }

    public void setFkSeconcedeNiega(SeconsedeOpciones fkSeconcedeNiega) {
        this.fkSeconcedeNiega = fkSeconcedeNiega;
    }

    public ResolucionApelacionMp getFkResolucion() {
        return fkResolucion;
    }

    public void setFkResolucion(ResolucionApelacionMp fkResolucion) {
        this.fkResolucion = fkResolucion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTermino != null ? idTermino.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Termino)) {
            return false;
        }
        Termino other = (Termino) object;
        if ((this.idTermino == null && other.idTermino != null) || (this.idTermino != null && !this.idTermino.equals(other.idTermino))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Termino[ idTermino=" + idTermino + " ]";
    }
    
}
