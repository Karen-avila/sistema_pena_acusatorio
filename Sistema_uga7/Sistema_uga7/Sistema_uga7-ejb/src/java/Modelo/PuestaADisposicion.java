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
@Table(name = "puesta_a_disposicion", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PuestaADisposicion.findAll", query = "SELECT p FROM PuestaADisposicion p")
    , @NamedQuery(name = "PuestaADisposicion.findByIdPuestaDisp", query = "SELECT p FROM PuestaADisposicion p WHERE p.idPuestaDisp = :idPuestaDisp")
    , @NamedQuery(name = "PuestaADisposicion.findByOpciones", query = "SELECT p FROM PuestaADisposicion p WHERE p.opciones = :opciones")})
public class PuestaADisposicion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_puesta_disp")
    private Integer idPuestaDisp;
    @Column(name = "opciones")
    private String opciones;
    @OneToMany(mappedBy = "fkPuestaDisposicion")
    private List<Carpeta> carpetaList;

    public PuestaADisposicion() {
    }

    public PuestaADisposicion(Integer idPuestaDisp) {
        this.idPuestaDisp = idPuestaDisp;
    }

    public Integer getIdPuestaDisp() {
        return idPuestaDisp;
    }

    public void setIdPuestaDisp(Integer idPuestaDisp) {
        this.idPuestaDisp = idPuestaDisp;
    }

    public String getOpciones() {
        return opciones;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }

    @XmlTransient
    public List<Carpeta> getCarpetaList() {
        return carpetaList;
    }

    public void setCarpetaList(List<Carpeta> carpetaList) {
        this.carpetaList = carpetaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPuestaDisp != null ? idPuestaDisp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PuestaADisposicion)) {
            return false;
        }
        PuestaADisposicion other = (PuestaADisposicion) object;
        if ((this.idPuestaDisp == null && other.idPuestaDisp != null) || (this.idPuestaDisp != null && !this.idPuestaDisp.equals(other.idPuestaDisp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.PuestaADisposicion[ idPuestaDisp=" + idPuestaDisp + " ]";
    }
    
}
