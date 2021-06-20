/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ANA
 */
@Entity
@Table(name = "datos_espesificos_v", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatosEspesificosV.findAll", query = "SELECT d FROM DatosEspesificosV d")
    , @NamedQuery(name = "DatosEspesificosV.findByIdDatosEspesificosV", query = "SELECT d FROM DatosEspesificosV d WHERE d.idDatosEspesificosV = :idDatosEspesificosV")
    , @NamedQuery(name = "DatosEspesificosV.findByEdad", query = "SELECT d FROM DatosEspesificosV d WHERE d.edad = :edad")
    , @NamedQuery(name = "DatosEspesificosV.findByOcupacion", query = "SELECT d FROM DatosEspesificosV d WHERE d.ocupacion = :ocupacion")})
public class DatosEspesificosV implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_datos_espesificos_v")
    private Integer idDatosEspesificosV;
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "ocupacion")
    private String ocupacion;

    public DatosEspesificosV() {
    }

    public DatosEspesificosV(Integer idDatosEspesificosV) {
        this.idDatosEspesificosV = idDatosEspesificosV;
    }

    public Integer getIdDatosEspesificosV() {
        return idDatosEspesificosV;
    }

    public void setIdDatosEspesificosV(Integer idDatosEspesificosV) {
        this.idDatosEspesificosV = idDatosEspesificosV;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDatosEspesificosV != null ? idDatosEspesificosV.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosEspesificosV)) {
            return false;
        }
        DatosEspesificosV other = (DatosEspesificosV) object;
        if ((this.idDatosEspesificosV == null && other.idDatosEspesificosV != null) || (this.idDatosEspesificosV != null && !this.idDatosEspesificosV.equals(other.idDatosEspesificosV))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.DatosEspesificosV[ idDatosEspesificosV=" + idDatosEspesificosV + " ]";
    }
    
}
