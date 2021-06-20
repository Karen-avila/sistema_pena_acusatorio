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
@Table(name = "mp_que_trabaja", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MpQueTrabaja.findAll", query = "SELECT m FROM MpQueTrabaja m")
    , @NamedQuery(name = "MpQueTrabaja.findByIdMpTrabaja", query = "SELECT m FROM MpQueTrabaja m WHERE m.idMpTrabaja = :idMpTrabaja")
    , @NamedQuery(name = "MpQueTrabaja.findByNombreDeMp", query = "SELECT m FROM MpQueTrabaja m WHERE m.nombreDeMp = :nombreDeMp")})
public class MpQueTrabaja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_mp_trabaja")
    private Integer idMpTrabaja;
    @Column(name = "nombre_de_mp")
    private String nombreDeMp;
    @OneToMany(mappedBy = "fkMPTrabaja")
    private List<Carpeta> carpetaList;

    public MpQueTrabaja() {
    }

    public MpQueTrabaja(Integer idMpTrabaja) {
        this.idMpTrabaja = idMpTrabaja;
    }

    public Integer getIdMpTrabaja() {
        return idMpTrabaja;
    }

    public void setIdMpTrabaja(Integer idMpTrabaja) {
        this.idMpTrabaja = idMpTrabaja;
    }

    public String getNombreDeMp() {
        return nombreDeMp;
    }

    public void setNombreDeMp(String nombreDeMp) {
        this.nombreDeMp = nombreDeMp;
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
        hash += (idMpTrabaja != null ? idMpTrabaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MpQueTrabaja)) {
            return false;
        }
        MpQueTrabaja other = (MpQueTrabaja) object;
        if ((this.idMpTrabaja == null && other.idMpTrabaja != null) || (this.idMpTrabaja != null && !this.idMpTrabaja.equals(other.idMpTrabaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.MpQueTrabaja[ idMpTrabaja=" + idMpTrabaja + " ]";
    }
    
}
