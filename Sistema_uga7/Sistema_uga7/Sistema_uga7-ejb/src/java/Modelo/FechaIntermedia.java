/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ANA
 */
@Entity
@Table(name = "fecha_intermedia", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FechaIntermedia.findAll", query = "SELECT f FROM FechaIntermedia f")
    , @NamedQuery(name = "FechaIntermedia.findByIdFechaIntermedia", query = "SELECT f FROM FechaIntermedia f WHERE f.idFechaIntermedia = :idFechaIntermedia")
    , @NamedQuery(name = "FechaIntermedia.findByFechaAcusacion", query = "SELECT f FROM FechaIntermedia f WHERE f.fechaAcusacion = :fechaAcusacion")
    , @NamedQuery(name = "FechaIntermedia.findByFechaAudienciaInterSe\u00f1alada", query = "SELECT f FROM FechaIntermedia f WHERE f.fechaAudienciaInterSe\u00f1alada = :fechaAudienciaInterSe\u00f1alada")
    , @NamedQuery(name = "FechaIntermedia.findByFechaAudienciaInterCelebrada", query = "SELECT f FROM FechaIntermedia f WHERE f.fechaAudienciaInterCelebrada = :fechaAudienciaInterCelebrada")
    , @NamedQuery(name = "FechaIntermedia.findByApelacionExclucionSuspendeProcu", query = "SELECT f FROM FechaIntermedia f WHERE f.apelacionExclucionSuspendeProcu = :apelacionExclucionSuspendeProcu")
    , @NamedQuery(name = "FechaIntermedia.findByNombreJuezControl", query = "SELECT f FROM FechaIntermedia f WHERE f.nombreJuezControl = :nombreJuezControl")
    , @NamedQuery(name = "FechaIntermedia.findByFechaAperturaJuicioOral", query = "SELECT f FROM FechaIntermedia f WHERE f.fechaAperturaJuicioOral = :fechaAperturaJuicioOral")
    , @NamedQuery(name = "FechaIntermedia.findByCarpetaJuicio", query = "SELECT f FROM FechaIntermedia f WHERE f.carpetaJuicio = :carpetaJuicio")
    , @NamedQuery(name = "FechaIntermedia.findByFechaCelebracionAudJuicioOral", query = "SELECT f FROM FechaIntermedia f WHERE f.fechaCelebracionAudJuicioOral = :fechaCelebracionAudJuicioOral")
    , @NamedQuery(name = "FechaIntermedia.findByFechaAlegatosClausura", query = "SELECT f FROM FechaIntermedia f WHERE f.fechaAlegatosClausura = :fechaAlegatosClausura")
    , @NamedQuery(name = "FechaIntermedia.findByFechaDeFallo", query = "SELECT f FROM FechaIntermedia f WHERE f.fechaDeFallo = :fechaDeFallo")
    , @NamedQuery(name = "FechaIntermedia.findByFechaAudienciaLecturaSentencia", query = "SELECT f FROM FechaIntermedia f WHERE f.fechaAudienciaLecturaSentencia = :fechaAudienciaLecturaSentencia")})
public class FechaIntermedia implements Serializable {

    @OneToMany(mappedBy = "fkFechaIntermedia")
    private List<RelacionCarpetaImputado> relacionCarpetaImputadoList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_fecha_intermedia")
    private Integer idFechaIntermedia;
    @Column(name = "fecha_acusacion")
    @Temporal(TemporalType.DATE)
    private Date fechaAcusacion;
    @Column(name = "fecha_audiencia_inter_se\u00f1alada")
    private String fechaAudienciaInterSeñalada;
    @Column(name = "fecha_audiencia_inter_celebrada")
    @Temporal(TemporalType.DATE)
    private Date fechaAudienciaInterCelebrada;
    @Column(name = "apelacion_exclucion_suspende_procu")
    @Temporal(TemporalType.DATE)
    private Date apelacionExclucionSuspendeProcu;
    @Column(name = "nombre_juez_control")
    private String nombreJuezControl;
    @Column(name = "fecha_apertura_juicio_oral")
    @Temporal(TemporalType.DATE)
    private Date fechaAperturaJuicioOral;
    @Column(name = "carpeta_juicio")
    private String carpetaJuicio;
    @Column(name = "fecha_celebracion_aud_juicio_oral")
    @Temporal(TemporalType.DATE)
    private Date fechaCelebracionAudJuicioOral;
    @Column(name = "fecha_alegatos_clausura")
    @Temporal(TemporalType.DATE)
    private Date fechaAlegatosClausura;
    @Column(name = "fecha_de_fallo")
    @Temporal(TemporalType.DATE)
    private Date fechaDeFallo;
    @Column(name = "fecha_audiencia_lectura_sentencia")
    @Temporal(TemporalType.DATE)
    private Date fechaAudienciaLecturaSentencia;
    @JoinColumn(name = "fk_pena", referencedColumnName = "id_pena")
    @ManyToOne
    private Pena fkPena;
    @JoinColumn(name = "fk_tipo_de_fallo", referencedColumnName = "id_tipo_de_fallo")
    @ManyToOne
    private TipoDeFallo fkTipoDeFallo;
    @JoinColumn(name = "fk_etapa_intermedia", referencedColumnName = "id_etapa_intermedia")
    @ManyToOne
    private EtapaIntermedia fkEtapaIntermedia;

    public FechaIntermedia() {
    }

    public FechaIntermedia(Integer idFechaIntermedia) {
        this.idFechaIntermedia = idFechaIntermedia;
    }

    public Integer getIdFechaIntermedia() {
        return idFechaIntermedia;
    }

    public void setIdFechaIntermedia(Integer idFechaIntermedia) {
        this.idFechaIntermedia = idFechaIntermedia;
    }

    public Date getFechaAcusacion() {
        return fechaAcusacion;
    }

    public void setFechaAcusacion(Date fechaAcusacion) {
        this.fechaAcusacion = fechaAcusacion;
    }

    public String getFechaAudienciaInterSeñalada() {
        return fechaAudienciaInterSeñalada;
    }

    public void setFechaAudienciaInterSeñalada(String fechaAudienciaInterSeñalada) {
        this.fechaAudienciaInterSeñalada = fechaAudienciaInterSeñalada;
    }

    public Date getFechaAudienciaInterCelebrada() {
        return fechaAudienciaInterCelebrada;
    }

    public void setFechaAudienciaInterCelebrada(Date fechaAudienciaInterCelebrada) {
        this.fechaAudienciaInterCelebrada = fechaAudienciaInterCelebrada;
    }

    public Date getApelacionExclucionSuspendeProcu() {
        return apelacionExclucionSuspendeProcu;
    }

    public void setApelacionExclucionSuspendeProcu(Date apelacionExclucionSuspendeProcu) {
        this.apelacionExclucionSuspendeProcu = apelacionExclucionSuspendeProcu;
    }

    public String getNombreJuezControl() {
        return nombreJuezControl;
    }

    public void setNombreJuezControl(String nombreJuezControl) {
        this.nombreJuezControl = nombreJuezControl;
    }

    public Date getFechaAperturaJuicioOral() {
        return fechaAperturaJuicioOral;
    }

    public void setFechaAperturaJuicioOral(Date fechaAperturaJuicioOral) {
        this.fechaAperturaJuicioOral = fechaAperturaJuicioOral;
    }

    public String getCarpetaJuicio() {
        return carpetaJuicio;
    }

    public void setCarpetaJuicio(String carpetaJuicio) {
        this.carpetaJuicio = carpetaJuicio;
    }

    public Date getFechaCelebracionAudJuicioOral() {
        return fechaCelebracionAudJuicioOral;
    }

    public void setFechaCelebracionAudJuicioOral(Date fechaCelebracionAudJuicioOral) {
        this.fechaCelebracionAudJuicioOral = fechaCelebracionAudJuicioOral;
    }

    public Date getFechaAlegatosClausura() {
        return fechaAlegatosClausura;
    }

    public void setFechaAlegatosClausura(Date fechaAlegatosClausura) {
        this.fechaAlegatosClausura = fechaAlegatosClausura;
    }

    public Date getFechaDeFallo() {
        return fechaDeFallo;
    }

    public void setFechaDeFallo(Date fechaDeFallo) {
        this.fechaDeFallo = fechaDeFallo;
    }

    public Date getFechaAudienciaLecturaSentencia() {
        return fechaAudienciaLecturaSentencia;
    }

    public void setFechaAudienciaLecturaSentencia(Date fechaAudienciaLecturaSentencia) {
        this.fechaAudienciaLecturaSentencia = fechaAudienciaLecturaSentencia;
    }

    public Pena getFkPena() {
        return fkPena;
    }

    public void setFkPena(Pena fkPena) {
        this.fkPena = fkPena;
    }

    public TipoDeFallo getFkTipoDeFallo() {
        return fkTipoDeFallo;
    }

    public void setFkTipoDeFallo(TipoDeFallo fkTipoDeFallo) {
        this.fkTipoDeFallo = fkTipoDeFallo;
    }

    public EtapaIntermedia getFkEtapaIntermedia() {
        return fkEtapaIntermedia;
    }

    public void setFkEtapaIntermedia(EtapaIntermedia fkEtapaIntermedia) {
        this.fkEtapaIntermedia = fkEtapaIntermedia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFechaIntermedia != null ? idFechaIntermedia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FechaIntermedia)) {
            return false;
        }
        FechaIntermedia other = (FechaIntermedia) object;
        if ((this.idFechaIntermedia == null && other.idFechaIntermedia != null) || (this.idFechaIntermedia != null && !this.idFechaIntermedia.equals(other.idFechaIntermedia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.FechaIntermedia[ idFechaIntermedia=" + idFechaIntermedia + " ]";
    }

    @XmlTransient
    public List<RelacionCarpetaImputado> getRelacionCarpetaImputadoList() {
        return relacionCarpetaImputadoList;
    }

    public void setRelacionCarpetaImputadoList(List<RelacionCarpetaImputado> relacionCarpetaImputadoList) {
        this.relacionCarpetaImputadoList = relacionCarpetaImputadoList;
    }
    
}
