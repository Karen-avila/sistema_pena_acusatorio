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
@Table(name = "abogado", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Abogado.findAll", query = "SELECT a FROM Abogado a")
    , @NamedQuery(name = "Abogado.findByIdAbogado", query = "SELECT a FROM Abogado a WHERE a.idAbogado = :idAbogado")
    , @NamedQuery(name = "Abogado.findByOpciones", query = "SELECT a FROM Abogado a WHERE a.opciones = :opciones")})
public class Abogado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_abogado")
    private Integer idAbogado;
    @Column(name = "opciones")
    private String opciones;
    @OneToMany(mappedBy = "fkAbogado")
    private List<DatosEspesificosDeImputado> datosEspesificosDeImputadoList;

    public Abogado() {
    }

    public Abogado(Integer idAbogado) {
        this.idAbogado = idAbogado;
    }

    public Integer getIdAbogado() {
        return idAbogado;
    }

    public void setIdAbogado(Integer idAbogado) {
        this.idAbogado = idAbogado;
    }

    public String getOpciones() {
        return opciones;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }

    @XmlTransient
    public List<DatosEspesificosDeImputado> getDatosEspesificosDeImputadoList() {
        return datosEspesificosDeImputadoList;
    }

    public void setDatosEspesificosDeImputadoList(List<DatosEspesificosDeImputado> datosEspesificosDeImputadoList) {
        this.datosEspesificosDeImputadoList = datosEspesificosDeImputadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAbogado != null ? idAbogado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Abogado)) {
            return false;
        }
        Abogado other = (Abogado) object;
        if ((this.idAbogado == null && other.idAbogado != null) || (this.idAbogado != null && !this.idAbogado.equals(other.idAbogado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Abogado[ idAbogado=" + idAbogado + " ]";
    }
    
}
