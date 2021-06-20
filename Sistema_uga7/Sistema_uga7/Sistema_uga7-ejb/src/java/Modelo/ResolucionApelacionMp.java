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
@Table(name = "resolucion_apelacion_mp", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ResolucionApelacionMp.findAll", query = "SELECT r FROM ResolucionApelacionMp r")
    , @NamedQuery(name = "ResolucionApelacionMp.findByIdResolucion", query = "SELECT r FROM ResolucionApelacionMp r WHERE r.idResolucion = :idResolucion")
    , @NamedQuery(name = "ResolucionApelacionMp.findByOpciones", query = "SELECT r FROM ResolucionApelacionMp r WHERE r.opciones = :opciones")})
public class ResolucionApelacionMp implements Serializable {

    @OneToMany(mappedBy = "fkResolucion")
    private List<Termino> terminoList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_resolucion")
    private Integer idResolucion;
    @Column(name = "opciones")
    private String opciones;

    public ResolucionApelacionMp() {
    }

    public ResolucionApelacionMp(Integer idResolucion) {
        this.idResolucion = idResolucion;
    }

    public Integer getIdResolucion() {
        return idResolucion;
    }

    public void setIdResolucion(Integer idResolucion) {
        this.idResolucion = idResolucion;
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
        hash += (idResolucion != null ? idResolucion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResolucionApelacionMp)) {
            return false;
        }
        ResolucionApelacionMp other = (ResolucionApelacionMp) object;
        if ((this.idResolucion == null && other.idResolucion != null) || (this.idResolucion != null && !this.idResolucion.equals(other.idResolucion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.ResolucionApelacionMp[ idResolucion=" + idResolucion + " ]";
    }

    @XmlTransient
    public List<Termino> getTerminoList() {
        return terminoList;
    }

    public void setTerminoList(List<Termino> terminoList) {
        this.terminoList = terminoList;
    }
    
}
