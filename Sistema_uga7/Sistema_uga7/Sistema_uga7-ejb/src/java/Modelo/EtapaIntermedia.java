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
@Table(name = "etapa_intermedia", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EtapaIntermedia.findAll", query = "SELECT e FROM EtapaIntermedia e")
    , @NamedQuery(name = "EtapaIntermedia.findByIdEtapaIntermedia", query = "SELECT e FROM EtapaIntermedia e WHERE e.idEtapaIntermedia = :idEtapaIntermedia")
    , @NamedQuery(name = "EtapaIntermedia.findByOpciones", query = "SELECT e FROM EtapaIntermedia e WHERE e.opciones = :opciones")})
public class EtapaIntermedia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_etapa_intermedia")
    private Integer idEtapaIntermedia;
    @Column(name = "opciones")
    private String opciones;
    @OneToMany(mappedBy = "fkEtapaIntermedia")
    private List<FechaIntermedia> fechaIntermediaList;

    public EtapaIntermedia() {
    }

    public EtapaIntermedia(Integer idEtapaIntermedia) {
        this.idEtapaIntermedia = idEtapaIntermedia;
    }

    public Integer getIdEtapaIntermedia() {
        return idEtapaIntermedia;
    }

    public void setIdEtapaIntermedia(Integer idEtapaIntermedia) {
        this.idEtapaIntermedia = idEtapaIntermedia;
    }

    public String getOpciones() {
        return opciones;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }

    @XmlTransient
    public List<FechaIntermedia> getFechaIntermediaList() {
        return fechaIntermediaList;
    }

    public void setFechaIntermediaList(List<FechaIntermedia> fechaIntermediaList) {
        this.fechaIntermediaList = fechaIntermediaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEtapaIntermedia != null ? idEtapaIntermedia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtapaIntermedia)) {
            return false;
        }
        EtapaIntermedia other = (EtapaIntermedia) object;
        if ((this.idEtapaIntermedia == null && other.idEtapaIntermedia != null) || (this.idEtapaIntermedia != null && !this.idEtapaIntermedia.equals(other.idEtapaIntermedia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.EtapaIntermedia[ idEtapaIntermedia=" + idEtapaIntermedia + " ]";
    }
    
}
