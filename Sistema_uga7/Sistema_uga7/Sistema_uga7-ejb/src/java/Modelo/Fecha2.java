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
@Table(name = "fecha_2", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fecha2.findAll", query = "SELECT f FROM Fecha2 f")
    , @NamedQuery(name = "Fecha2.findByIdFecha2", query = "SELECT f FROM Fecha2 f WHERE f.idFecha2 = :idFecha2")
    , @NamedQuery(name = "Fecha2.findByMotivoDeSuspencionDeProceso", query = "SELECT f FROM Fecha2 f WHERE f.motivoDeSuspencionDeProceso = :motivoDeSuspencionDeProceso")
    , @NamedQuery(name = "Fecha2.findByFechaCriterioOportunidad", query = "SELECT f FROM Fecha2 f WHERE f.fechaCriterioOportunidad = :fechaCriterioOportunidad")
    , @NamedQuery(name = "Fecha2.findByFechaOrdenDeAprensionLibrada", query = "SELECT f FROM Fecha2 f WHERE f.fechaOrdenDeAprensionLibrada = :fechaOrdenDeAprensionLibrada")
    , @NamedQuery(name = "Fecha2.findByFechaOrdenCumplida", query = "SELECT f FROM Fecha2 f WHERE f.fechaOrdenCumplida = :fechaOrdenCumplida")
    , @NamedQuery(name = "Fecha2.findByFechaOrdenCancelada", query = "SELECT f FROM Fecha2 f WHERE f.fechaOrdenCancelada = :fechaOrdenCancelada")})
public class Fecha2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_fecha2")
    private Integer idFecha2;
    @Column(name = "motivo_de_suspencion_de_proceso")
    private String motivoDeSuspencionDeProceso;
    @Column(name = "fecha_criterio_oportunidad")
    @Temporal(TemporalType.DATE)
    private Date fechaCriterioOportunidad;
    @Column(name = "fecha_orden_de_aprension_librada")
    @Temporal(TemporalType.DATE)
    private Date fechaOrdenDeAprensionLibrada;
    @Column(name = "fecha_orden_cumplida")
    @Temporal(TemporalType.DATE)
    private Date fechaOrdenCumplida;
    @Column(name = "fecha_orden_cancelada")
    @Temporal(TemporalType.DATE)
    private Date fechaOrdenCancelada;
    @OneToMany(mappedBy = "fkFecha2")
    private List<RelacionCarpetaImputado> relacionCarpetaImputadoList;

    public Fecha2() {
    }

    public Fecha2(Integer idFecha2) {
        this.idFecha2 = idFecha2;
    }

    public Integer getIdFecha2() {
        return idFecha2;
    }

    public void setIdFecha2(Integer idFecha2) {
        this.idFecha2 = idFecha2;
    }

    public String getMotivoDeSuspencionDeProceso() {
        return motivoDeSuspencionDeProceso;
    }

    public void setMotivoDeSuspencionDeProceso(String motivoDeSuspencionDeProceso) {
        this.motivoDeSuspencionDeProceso = motivoDeSuspencionDeProceso;
    }

    public Date getFechaCriterioOportunidad() {
        return fechaCriterioOportunidad;
    }

    public void setFechaCriterioOportunidad(Date fechaCriterioOportunidad) {
        this.fechaCriterioOportunidad = fechaCriterioOportunidad;
    }

    public Date getFechaOrdenDeAprensionLibrada() {
        return fechaOrdenDeAprensionLibrada;
    }

    public void setFechaOrdenDeAprensionLibrada(Date fechaOrdenDeAprensionLibrada) {
        this.fechaOrdenDeAprensionLibrada = fechaOrdenDeAprensionLibrada;
    }

    public Date getFechaOrdenCumplida() {
        return fechaOrdenCumplida;
    }

    public void setFechaOrdenCumplida(Date fechaOrdenCumplida) {
        this.fechaOrdenCumplida = fechaOrdenCumplida;
    }

    public Date getFechaOrdenCancelada() {
        return fechaOrdenCancelada;
    }

    public void setFechaOrdenCancelada(Date fechaOrdenCancelada) {
        this.fechaOrdenCancelada = fechaOrdenCancelada;
    }

    @XmlTransient
    public List<RelacionCarpetaImputado> getRelacionCarpetaImputadoList() {
        return relacionCarpetaImputadoList;
    }

    public void setRelacionCarpetaImputadoList(List<RelacionCarpetaImputado> relacionCarpetaImputadoList) {
        this.relacionCarpetaImputadoList = relacionCarpetaImputadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFecha2 != null ? idFecha2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fecha2)) {
            return false;
        }
        Fecha2 other = (Fecha2) object;
        if ((this.idFecha2 == null && other.idFecha2 != null) || (this.idFecha2 != null && !this.idFecha2.equals(other.idFecha2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Fecha2[ idFecha2=" + idFecha2 + " ]";
    }
    
}
