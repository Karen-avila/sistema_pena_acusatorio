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
@Table(name = "estado_actual_de_carpeta", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoActualDeCarpeta.findAll", query = "SELECT e FROM EstadoActualDeCarpeta e")
    , @NamedQuery(name = "EstadoActualDeCarpeta.findByIdEstado", query = "SELECT e FROM EstadoActualDeCarpeta e WHERE e.idEstado = :idEstado")
    , @NamedQuery(name = "EstadoActualDeCarpeta.findByOpciones", query = "SELECT e FROM EstadoActualDeCarpeta e WHERE e.opciones = :opciones")})
public class EstadoActualDeCarpeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estado")
    private Integer idEstado;
    @Basic(optional = false)
    @Column(name = "opciones")
    private String opciones;
    @OneToMany(mappedBy = "fkEstadoActualCarapeta")
    private List<Termino> terminoList;

    public EstadoActualDeCarpeta() {
    }

    public EstadoActualDeCarpeta(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public EstadoActualDeCarpeta(Integer idEstado, String opciones) {
        this.idEstado = idEstado;
        this.opciones = opciones;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
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
        hash += (idEstado != null ? idEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoActualDeCarpeta)) {
            return false;
        }
        EstadoActualDeCarpeta other = (EstadoActualDeCarpeta) object;
        if ((this.idEstado == null && other.idEstado != null) || (this.idEstado != null && !this.idEstado.equals(other.idEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.EstadoActualDeCarpeta[ idEstado=" + idEstado + " ]";
    }
    
}
