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
@Table(name = "calificacion_d_h", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CalificacionDH.findAll", query = "SELECT c FROM CalificacionDH c")
    , @NamedQuery(name = "CalificacionDH.findByIdCalificacionDh", query = "SELECT c FROM CalificacionDH c WHERE c.idCalificacionDh = :idCalificacionDh")
    , @NamedQuery(name = "CalificacionDH.findByOpciones", query = "SELECT c FROM CalificacionDH c WHERE c.opciones = :opciones")})
public class CalificacionDH implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_calificacion_dh")
    private Integer idCalificacionDh;
    @Column(name = "opciones")
    private String opciones;
    @OneToMany(mappedBy = "fkCalificacionDh")
    private List<DatosEspesificosDeImputado> datosEspesificosDeImputadoList;

    public CalificacionDH() {
    }

    public CalificacionDH(Integer idCalificacionDh) {
        this.idCalificacionDh = idCalificacionDh;
    }

    public Integer getIdCalificacionDh() {
        return idCalificacionDh;
    }

    public void setIdCalificacionDh(Integer idCalificacionDh) {
        this.idCalificacionDh = idCalificacionDh;
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
        hash += (idCalificacionDh != null ? idCalificacionDh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CalificacionDH)) {
            return false;
        }
        CalificacionDH other = (CalificacionDH) object;
        if ((this.idCalificacionDh == null && other.idCalificacionDh != null) || (this.idCalificacionDh != null && !this.idCalificacionDh.equals(other.idCalificacionDh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.CalificacionDH[ idCalificacionDh=" + idCalificacionDh + " ]";
    }
    
}
