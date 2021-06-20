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
@Table(name = "reparacion_del_da\u00f1o", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReparacionDelDa\u00f1o.findAll", query = "SELECT r FROM ReparacionDelDa\u00f1o r")
    , @NamedQuery(name = "ReparacionDelDa\u00f1o.findByIdReparacionDa\u00f1o", query = "SELECT r FROM ReparacionDelDa\u00f1o r WHERE r.idReparacionDa\u00f1o = :idReparacionDa\u00f1o")
    , @NamedQuery(name = "ReparacionDelDa\u00f1o.findByOpciones", query = "SELECT r FROM ReparacionDelDa\u00f1o r WHERE r.opciones = :opciones")})
public class ReparacionDelDaño implements Serializable {

    @OneToMany(mappedBy = "fkReparacionDa\u00f1o")
    private List<Pena> penaList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_reparacion_da\u00f1o")
    private Integer idReparacionDaño;
    @Column(name = "opciones")
    private String opciones;

    public ReparacionDelDaño() {
    }

    public ReparacionDelDaño(Integer idReparacionDaño) {
        this.idReparacionDaño = idReparacionDaño;
    }

    public Integer getIdReparacionDaño() {
        return idReparacionDaño;
    }

    public void setIdReparacionDaño(Integer idReparacionDaño) {
        this.idReparacionDaño = idReparacionDaño;
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
        hash += (idReparacionDaño != null ? idReparacionDaño.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReparacionDelDaño)) {
            return false;
        }
        ReparacionDelDaño other = (ReparacionDelDaño) object;
        if ((this.idReparacionDaño == null && other.idReparacionDaño != null) || (this.idReparacionDaño != null && !this.idReparacionDaño.equals(other.idReparacionDaño))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.ReparacionDelDa\u00f1o[ idReparacionDa\u00f1o=" + idReparacionDaño + " ]";
    }

    @XmlTransient
    public List<Pena> getPenaList() {
        return penaList;
    }

    public void setPenaList(List<Pena> penaList) {
        this.penaList = penaList;
    }
    
}
