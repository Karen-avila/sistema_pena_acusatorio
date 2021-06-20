/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ANA
 */
@Entity
@Table(name = "tipo_de_fallo", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoDeFallo.findAll", query = "SELECT t FROM TipoDeFallo t")
    , @NamedQuery(name = "TipoDeFallo.findByIdTipoDeFallo", query = "SELECT t FROM TipoDeFallo t WHERE t.idTipoDeFallo = :idTipoDeFallo")
    , @NamedQuery(name = "TipoDeFallo.findByOpciones", query = "SELECT t FROM TipoDeFallo t WHERE t.opciones = :opciones")})
public class TipoDeFallo implements Serializable {

    @OneToMany(mappedBy = "fkTipodeFallo")
    private List<ProcediAbreviadoT> procediAbreviadoTList;

    @OneToMany(mappedBy = "fkTipoDeFallo")
    private List<FechaIntermedia> fechaIntermediaList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_de_fallo")
    private Integer idTipoDeFallo;
    @Column(name = "opciones")
    private String opciones;

    public TipoDeFallo() {
    }

    public TipoDeFallo(Integer idTipoDeFallo) {
        this.idTipoDeFallo = idTipoDeFallo;
    }

    public Integer getIdTipoDeFallo() {
        return idTipoDeFallo;
    }

    public void setIdTipoDeFallo(Integer idTipoDeFallo) {
        this.idTipoDeFallo = idTipoDeFallo;
    }

    public String getOpciones() {
        return opciones;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoDeFallo != null ? idTipoDeFallo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDeFallo)) {
            return false;
        }
        TipoDeFallo other = (TipoDeFallo) object;
        if ((this.idTipoDeFallo == null && other.idTipoDeFallo != null) || (this.idTipoDeFallo != null && !this.idTipoDeFallo.equals(other.idTipoDeFallo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.TipoDeFallo[ idTipoDeFallo=" + idTipoDeFallo + " ]";
    }

    @XmlTransient
    public List<FechaIntermedia> getFechaIntermediaList() {
        return fechaIntermediaList;
    }

    public void setFechaIntermediaList(List<FechaIntermedia> fechaIntermediaList) {
        this.fechaIntermediaList = fechaIntermediaList;
    }

    @XmlTransient
    public List<ProcediAbreviadoT> getProcediAbreviadoTList() {
        return procediAbreviadoTList;
    }

    public void setProcediAbreviadoTList(List<ProcediAbreviadoT> procediAbreviadoTList) {
        this.procediAbreviadoTList = procediAbreviadoTList;
    }
    
}
