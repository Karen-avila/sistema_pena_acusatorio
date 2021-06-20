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
@Table(name = "soluciones_alternas", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SolucionesAlternas.findAll", query = "SELECT s FROM SolucionesAlternas s")
    , @NamedQuery(name = "SolucionesAlternas.findByIdSolucionesAl", query = "SELECT s FROM SolucionesAlternas s WHERE s.idSolucionesAl = :idSolucionesAl")
    , @NamedQuery(name = "SolucionesAlternas.findByAcuerdoReparatorio", query = "SELECT s FROM SolucionesAlternas s WHERE s.acuerdoReparatorio = :acuerdoReparatorio")
    , @NamedQuery(name = "SolucionesAlternas.findBySuspencionCondicional", query = "SELECT s FROM SolucionesAlternas s WHERE s.suspencionCondicional = :suspencionCondicional")})
public class SolucionesAlternas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_soluciones_al")
    private Integer idSolucionesAl;
    @Column(name = "acuerdo_reparatorio")
    @Temporal(TemporalType.DATE)
    private Date acuerdoReparatorio;
    @Column(name = "suspencion_condicional")
    @Temporal(TemporalType.DATE)
    private Date suspencionCondicional;
    @OneToMany(mappedBy = "fkSolucionesAlternas")
    private List<Fechas> fechasList;

    public SolucionesAlternas() {
    }

    public SolucionesAlternas(Integer idSolucionesAl) {
        this.idSolucionesAl = idSolucionesAl;
    }

    public Integer getIdSolucionesAl() {
        return idSolucionesAl;
    }

    public void setIdSolucionesAl(Integer idSolucionesAl) {
        this.idSolucionesAl = idSolucionesAl;
    }

    public Date getAcuerdoReparatorio() {
        return acuerdoReparatorio;
    }

    public void setAcuerdoReparatorio(Date acuerdoReparatorio) {
        this.acuerdoReparatorio = acuerdoReparatorio;
    }

    public Date getSuspencionCondicional() {
        return suspencionCondicional;
    }

    public void setSuspencionCondicional(Date suspencionCondicional) {
        this.suspencionCondicional = suspencionCondicional;
    }

    @XmlTransient
    public List<Fechas> getFechasList() {
        return fechasList;
    }

    public void setFechasList(List<Fechas> fechasList) {
        this.fechasList = fechasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSolucionesAl != null ? idSolucionesAl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolucionesAlternas)) {
            return false;
        }
        SolucionesAlternas other = (SolucionesAlternas) object;
        if ((this.idSolucionesAl == null && other.idSolucionesAl != null) || (this.idSolucionesAl != null && !this.idSolucionesAl.equals(other.idSolucionesAl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.SolucionesAlternas[ idSolucionesAl=" + idSolucionesAl + " ]";
    }
    
}
