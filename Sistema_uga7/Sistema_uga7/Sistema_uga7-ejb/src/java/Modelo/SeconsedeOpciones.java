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
@Table(name = "seconsede_opciones", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SeconsedeOpciones.findAll", query = "SELECT s FROM SeconsedeOpciones s")
    , @NamedQuery(name = "SeconsedeOpciones.findByIdOpciones", query = "SELECT s FROM SeconsedeOpciones s WHERE s.idOpciones = :idOpciones")
    , @NamedQuery(name = "SeconsedeOpciones.findByOpciones", query = "SELECT s FROM SeconsedeOpciones s WHERE s.opciones = :opciones")})
public class SeconsedeOpciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_opciones")
    private Integer idOpciones;
    @Column(name = "opciones")
    private String opciones;
    @OneToMany(mappedBy = "fkSeconcedeNiega")
    private List<Termino> terminoList;

    public SeconsedeOpciones() {
    }

    public SeconsedeOpciones(Integer idOpciones) {
        this.idOpciones = idOpciones;
    }

    public Integer getIdOpciones() {
        return idOpciones;
    }

    public void setIdOpciones(Integer idOpciones) {
        this.idOpciones = idOpciones;
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
        hash += (idOpciones != null ? idOpciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SeconsedeOpciones)) {
            return false;
        }
        SeconsedeOpciones other = (SeconsedeOpciones) object;
        if ((this.idOpciones == null && other.idOpciones != null) || (this.idOpciones != null && !this.idOpciones.equals(other.idOpciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.SeconsedeOpciones[ idOpciones=" + idOpciones + " ]";
    }
    
}
