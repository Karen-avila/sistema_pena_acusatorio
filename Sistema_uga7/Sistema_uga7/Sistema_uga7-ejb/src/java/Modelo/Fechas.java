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
@Table(name = "fechas", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fechas.findAll", query = "SELECT f FROM Fechas f")
    , @NamedQuery(name = "Fechas.findByIdFechas", query = "SELECT f FROM Fechas f WHERE f.idFechas = :idFechas")
    , @NamedQuery(name = "Fechas.findByFechaVinculacionProceso", query = "SELECT f FROM Fechas f WHERE f.fechaVinculacionProceso = :fechaVinculacionProceso")
    , @NamedQuery(name = "Fechas.findByMedidasCautelaresArt155", query = "SELECT f FROM Fechas f WHERE f.medidasCautelaresArt155 = :medidasCautelaresArt155")
    , @NamedQuery(name = "Fechas.findByFechaMedidaOtorgada", query = "SELECT f FROM Fechas f WHERE f.fechaMedidaOtorgada = :fechaMedidaOtorgada")
    , @NamedQuery(name = "Fechas.findByFechaPlazoCierreInvestigacion", query = "SELECT f FROM Fechas f WHERE f.fechaPlazoCierreInvestigacion = :fechaPlazoCierreInvestigacion")
    , @NamedQuery(name = "Fechas.findByFechaVencimiento", query = "SELECT f FROM Fechas f WHERE f.fechaVencimiento = :fechaVencimiento")
    , @NamedQuery(name = "Fechas.findByFechaProrrogaInvestgacion", query = "SELECT f FROM Fechas f WHERE f.fechaProrrogaInvestgacion = :fechaProrrogaInvestgacion")
    , @NamedQuery(name = "Fechas.findByNuevaFechaVencimientoAcusacion", query = "SELECT f FROM Fechas f WHERE f.nuevaFechaVencimientoAcusacion = :nuevaFechaVencimientoAcusacion")
    , @NamedQuery(name = "Fechas.findByFechaEnvioProcedimientoAbreviado", query = "SELECT f FROM Fechas f WHERE f.fechaEnvioProcedimientoAbreviado = :fechaEnvioProcedimientoAbreviado")
    , @NamedQuery(name = "Fechas.findByFechaEnvioEstudioTecnico", query = "SELECT f FROM Fechas f WHERE f.fechaEnvioEstudioTecnico = :fechaEnvioEstudioTecnico")})
public class Fechas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_fechas")
    private Integer idFechas;
    @Column(name = "fecha_vinculacion_proceso")
    @Temporal(TemporalType.DATE)
    private Date fechaVinculacionProceso;
    @Column(name = "medidas_cautelares_art155")
    private String medidasCautelaresArt155;
    @Column(name = "fecha_medida_otorgada")
    @Temporal(TemporalType.DATE)
    private Date fechaMedidaOtorgada;
    @Column(name = "fecha_plazo_cierre_investigacion")
    @Temporal(TemporalType.DATE)
    private Date fechaPlazoCierreInvestigacion;
    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;
    @Column(name = "fecha_prorroga_investgacion")
    @Temporal(TemporalType.DATE)
    private Date fechaProrrogaInvestgacion;
    @Column(name = "nueva_fecha_vencimiento_acusacion")
    @Temporal(TemporalType.DATE)
    private Date nuevaFechaVencimientoAcusacion;
    @Column(name = "fecha_envio_procedimiento_abreviado")
    @Temporal(TemporalType.DATE)
    private Date fechaEnvioProcedimientoAbreviado;
    @Column(name = "fecha_envio_estudio_tecnico")
    @Temporal(TemporalType.DATE)
    private Date fechaEnvioEstudioTecnico;
    @OneToMany(mappedBy = "fkFechas")
    private List<RelacionCarpetaImputado> relacionCarpetaImputadoList;
    @JoinColumn(name = "fk_soluciones_alternas", referencedColumnName = "id_soluciones_al")
    @ManyToOne
    private SolucionesAlternas fkSolucionesAlternas;

    public Fechas() {
    }

    public Fechas(Integer idFechas) {
        this.idFechas = idFechas;
    }

    public Integer getIdFechas() {
        return idFechas;
    }

    public void setIdFechas(Integer idFechas) {
        this.idFechas = idFechas;
    }

    public Date getFechaVinculacionProceso() {
        return fechaVinculacionProceso;
    }

    public void setFechaVinculacionProceso(Date fechaVinculacionProceso) {
        this.fechaVinculacionProceso = fechaVinculacionProceso;
    }

    public String getMedidasCautelaresArt155() {
        return medidasCautelaresArt155;
    }

    public void setMedidasCautelaresArt155(String medidasCautelaresArt155) {
        this.medidasCautelaresArt155 = medidasCautelaresArt155;
    }

    public Date getFechaMedidaOtorgada() {
        return fechaMedidaOtorgada;
    }

    public void setFechaMedidaOtorgada(Date fechaMedidaOtorgada) {
        this.fechaMedidaOtorgada = fechaMedidaOtorgada;
    }

    public Date getFechaPlazoCierreInvestigacion() {
        return fechaPlazoCierreInvestigacion;
    }

    public void setFechaPlazoCierreInvestigacion(Date fechaPlazoCierreInvestigacion) {
        this.fechaPlazoCierreInvestigacion = fechaPlazoCierreInvestigacion;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date getFechaProrrogaInvestgacion() {
        return fechaProrrogaInvestgacion;
    }

    public void setFechaProrrogaInvestgacion(Date fechaProrrogaInvestgacion) {
        this.fechaProrrogaInvestgacion = fechaProrrogaInvestgacion;
    }

    public Date getNuevaFechaVencimientoAcusacion() {
        return nuevaFechaVencimientoAcusacion;
    }

    public void setNuevaFechaVencimientoAcusacion(Date nuevaFechaVencimientoAcusacion) {
        this.nuevaFechaVencimientoAcusacion = nuevaFechaVencimientoAcusacion;
    }

    public Date getFechaEnvioProcedimientoAbreviado() {
        return fechaEnvioProcedimientoAbreviado;
    }

    public void setFechaEnvioProcedimientoAbreviado(Date fechaEnvioProcedimientoAbreviado) {
        this.fechaEnvioProcedimientoAbreviado = fechaEnvioProcedimientoAbreviado;
    }

    public Date getFechaEnvioEstudioTecnico() {
        return fechaEnvioEstudioTecnico;
    }

    public void setFechaEnvioEstudioTecnico(Date fechaEnvioEstudioTecnico) {
        this.fechaEnvioEstudioTecnico = fechaEnvioEstudioTecnico;
    }

    @XmlTransient
    public List<RelacionCarpetaImputado> getRelacionCarpetaImputadoList() {
        return relacionCarpetaImputadoList;
    }

    public void setRelacionCarpetaImputadoList(List<RelacionCarpetaImputado> relacionCarpetaImputadoList) {
        this.relacionCarpetaImputadoList = relacionCarpetaImputadoList;
    }

    public SolucionesAlternas getFkSolucionesAlternas() {
        return fkSolucionesAlternas;
    }

    public void setFkSolucionesAlternas(SolucionesAlternas fkSolucionesAlternas) {
        this.fkSolucionesAlternas = fkSolucionesAlternas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFechas != null ? idFechas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fechas)) {
            return false;
        }
        Fechas other = (Fechas) object;
        if ((this.idFechas == null && other.idFechas != null) || (this.idFechas != null && !this.idFechas.equals(other.idFechas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Fechas[ idFechas=" + idFechas + " ]";
    }
    
}
