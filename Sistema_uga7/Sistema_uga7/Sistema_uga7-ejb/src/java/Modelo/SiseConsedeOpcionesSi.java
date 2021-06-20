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
@Table(name = "sise_consede_opciones_si", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SiseConsedeOpcionesSi.findAll", query = "SELECT s FROM SiseConsedeOpcionesSi s")
    , @NamedQuery(name = "SiseConsedeOpcionesSi.findByIdSeConsede", query = "SELECT s FROM SiseConsedeOpcionesSi s WHERE s.idSeConsede = :idSeConsede")
    , @NamedQuery(name = "SiseConsedeOpcionesSi.findByOpciones", query = "SELECT s FROM SiseConsedeOpcionesSi s WHERE s.opciones = :opciones")})
public class SiseConsedeOpcionesSi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_se_consede")
    private Integer idSeConsede;
    @Column(name = "opciones")
    private String opciones;
    @OneToMany(mappedBy = "fkConsedeNiega")
    private List<Termino> terminoList;

    public SiseConsedeOpcionesSi() {
    }

    public SiseConsedeOpcionesSi(Integer idSeConsede) {
        this.idSeConsede = idSeConsede;
    }

    public Integer getIdSeConsede() {
        return idSeConsede;
    }

    public void setIdSeConsede(Integer idSeConsede) {
        this.idSeConsede = idSeConsede;
    }

    public String getOpciones() {
        return opciones;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }

    @XmlTransient
    public List<Termino> getTerminoList() {
        return terminoList;
    }

    public void setTerminoList(List<Termino> terminoList) {
        this.terminoList = terminoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSeConsede != null ? idSeConsede.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SiseConsedeOpcionesSi)) {
            return false;
        }
        SiseConsedeOpcionesSi other = (SiseConsedeOpcionesSi) object;
        if ((this.idSeConsede == null && other.idSeConsede != null) || (this.idSeConsede != null && !this.idSeConsede.equals(other.idSeConsede))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.SiseConsedeOpcionesSi[ idSeConsede=" + idSeConsede + " ]";
    }
    
}
