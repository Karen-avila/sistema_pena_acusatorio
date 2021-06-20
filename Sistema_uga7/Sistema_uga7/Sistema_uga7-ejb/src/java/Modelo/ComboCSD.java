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
@Table(name = "combo_c_s_d", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ComboCSD.findAll", query = "SELECT c FROM ComboCSD c")
    , @NamedQuery(name = "ComboCSD.findByIdCsd", query = "SELECT c FROM ComboCSD c WHERE c.idCsd = :idCsd")
    , @NamedQuery(name = "ComboCSD.findByOpciones", query = "SELECT c FROM ComboCSD c WHERE c.opciones = :opciones")})
public class ComboCSD implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_csd")
    private Integer idCsd;
    @Column(name = "opciones")
    private String opciones;
    @OneToMany(mappedBy = "fkCsd")
    private List<Carpeta> carpetaList;

    public ComboCSD() {
    }

    public ComboCSD(Integer idCsd) {
        this.idCsd = idCsd;
    }

    public Integer getIdCsd() {
        return idCsd;
    }

    public void setIdCsd(Integer idCsd) {
        this.idCsd = idCsd;
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
        hash += (idCsd != null ? idCsd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComboCSD)) {
            return false;
        }
        ComboCSD other = (ComboCSD) object;
        if ((this.idCsd == null && other.idCsd != null) || (this.idCsd != null && !this.idCsd.equals(other.idCsd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.ComboCSD[ idCsd=" + idCsd + " ]";
    }
    
}
