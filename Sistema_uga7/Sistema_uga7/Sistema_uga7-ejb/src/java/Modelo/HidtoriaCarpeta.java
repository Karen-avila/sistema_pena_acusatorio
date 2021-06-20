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
@Table(name = "hidtoria_carpeta", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HidtoriaCarpeta.findAll", query = "SELECT h FROM HidtoriaCarpeta h")
    , @NamedQuery(name = "HidtoriaCarpeta.findByIdhistoria", query = "SELECT h FROM HidtoriaCarpeta h WHERE h.idhistoria = :idhistoria")
    , @NamedQuery(name = "HidtoriaCarpeta.findByOpcioneshis", query = "SELECT h FROM HidtoriaCarpeta h WHERE h.opcioneshis = :opcioneshis")})
public class HidtoriaCarpeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhistoria")
    private Integer idhistoria;
    @Basic(optional = false)
    @Column(name = "opcioneshis")
    private String opcioneshis;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkHistoriaOp")
    private List<RelacionCarpetaHistoria> relacionCarpetaHistoriaList;

    public HidtoriaCarpeta() {
    }

    public HidtoriaCarpeta(Integer idhistoria) {
        this.idhistoria = idhistoria;
    }

    public HidtoriaCarpeta(Integer idhistoria, String opcioneshis) {
        this.idhistoria = idhistoria;
        this.opcioneshis = opcioneshis;
    }

    public Integer getIdhistoria() {
        return idhistoria;
    }

    public void setIdhistoria(Integer idhistoria) {
        this.idhistoria = idhistoria;
    }

    public String getOpcioneshis() {
        return opcioneshis;
    }

    public void setOpcioneshis(String opcioneshis) {
        this.opcioneshis = opcioneshis;
    }

    @XmlTransient
    public List<RelacionCarpetaHistoria> getRelacionCarpetaHistoriaList() {
        return relacionCarpetaHistoriaList;
    }

    public void setRelacionCarpetaHistoriaList(List<RelacionCarpetaHistoria> relacionCarpetaHistoriaList) {
        this.relacionCarpetaHistoriaList = relacionCarpetaHistoriaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhistoria != null ? idhistoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HidtoriaCarpeta)) {
            return false;
        }
        HidtoriaCarpeta other = (HidtoriaCarpeta) object;
        if ((this.idhistoria == null && other.idhistoria != null) || (this.idhistoria != null && !this.idhistoria.equals(other.idhistoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.HidtoriaCarpeta[ idhistoria=" + idhistoria + " ]";
    }
    
}
