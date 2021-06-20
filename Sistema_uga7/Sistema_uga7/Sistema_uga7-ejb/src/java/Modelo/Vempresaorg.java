/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "vempresaorg", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vempresaorg.findAll", query = "SELECT v FROM Vempresaorg v")
    , @NamedQuery(name = "Vempresaorg.findByIdVeorg", query = "SELECT v FROM Vempresaorg v WHERE v.idVeorg = :idVeorg")
    , @NamedQuery(name = "Vempresaorg.findByNombre", query = "SELECT v FROM Vempresaorg v WHERE v.nombre = :nombre")})
public class Vempresaorg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_veorg")
    private Integer idVeorg;
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkVe")
    private List<RelacionVictimaeCarpeta> relacionVictimaeCarpetaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkVe")
    private List<RelacionVeI> relacionVeIList;

    public Vempresaorg() {
    }

    public Vempresaorg(Integer idVeorg) {
        this.idVeorg = idVeorg;
    }

    public Integer getIdVeorg() {
        return idVeorg;
    }

    public void setIdVeorg(Integer idVeorg) {
        this.idVeorg = idVeorg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<RelacionVictimaeCarpeta> getRelacionVictimaeCarpetaList() {
        return relacionVictimaeCarpetaList;
    }

    public void setRelacionVictimaeCarpetaList(List<RelacionVictimaeCarpeta> relacionVictimaeCarpetaList) {
        this.relacionVictimaeCarpetaList = relacionVictimaeCarpetaList;
    }

    @XmlTransient
    public List<RelacionVeI> getRelacionVeIList() {
        return relacionVeIList;
    }

    public void setRelacionVeIList(List<RelacionVeI> relacionVeIList) {
        this.relacionVeIList = relacionVeIList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVeorg != null ? idVeorg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vempresaorg)) {
            return false;
        }
        Vempresaorg other = (Vempresaorg) object;
        if ((this.idVeorg == null && other.idVeorg != null) || (this.idVeorg != null && !this.idVeorg.equals(other.idVeorg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Vempresaorg[ idVeorg=" + idVeorg + " ]";
    }
    
}
