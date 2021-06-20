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
@Table(name = "unidad_de_gestion", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidadDeGestion.findAll", query = "SELECT u FROM UnidadDeGestion u")
    , @NamedQuery(name = "UnidadDeGestion.findByIdUnidadGestion", query = "SELECT u FROM UnidadDeGestion u WHERE u.idUnidadGestion = :idUnidadGestion")
    , @NamedQuery(name = "UnidadDeGestion.findByOpciones", query = "SELECT u FROM UnidadDeGestion u WHERE u.opciones = :opciones")})
public class UnidadDeGestion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_unidad_gestion")
    private Integer idUnidadGestion;
    @Column(name = "opciones")
    private String opciones;
    @OneToMany(mappedBy = "fkUnidadGestion")
    private List<Carpeta> carpetaList;

    public UnidadDeGestion() {
    }

    public UnidadDeGestion(Integer idUnidadGestion) {
        this.idUnidadGestion = idUnidadGestion;
    }

    public Integer getIdUnidadGestion() {
        return idUnidadGestion;
    }

    public void setIdUnidadGestion(Integer idUnidadGestion) {
        this.idUnidadGestion = idUnidadGestion;
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
        hash += (idUnidadGestion != null ? idUnidadGestion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadDeGestion)) {
            return false;
        }
        UnidadDeGestion other = (UnidadDeGestion) object;
        if ((this.idUnidadGestion == null && other.idUnidadGestion != null) || (this.idUnidadGestion != null && !this.idUnidadGestion.equals(other.idUnidadGestion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.UnidadDeGestion[ idUnidadGestion=" + idUnidadGestion + " ]";
    }
    
}
