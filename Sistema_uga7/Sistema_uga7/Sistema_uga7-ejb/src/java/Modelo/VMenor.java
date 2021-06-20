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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ANA
 */
@Entity
@Table(name = "v_menor", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VMenor.findAll", query = "SELECT v FROM VMenor v")
    , @NamedQuery(name = "VMenor.findByIdVMenor", query = "SELECT v FROM VMenor v WHERE v.idVMenor = :idVMenor")
    , @NamedQuery(name = "VMenor.findByIniciales", query = "SELECT v FROM VMenor v WHERE v.iniciales = :iniciales")
    , @NamedQuery(name = "VMenor.findByNombre", query = "SELECT v FROM VMenor v WHERE v.nombre = :nombre")
    , @NamedQuery(name = "VMenor.findByNacionalidad", query = "SELECT v FROM VMenor v WHERE v.nacionalidad = :nacionalidad")
    , @NamedQuery(name = "VMenor.findByObservacionesVMenor", query = "SELECT v FROM VMenor v WHERE v.observacionesVMenor = :observacionesVMenor")})
public class VMenor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_v_menor")
    private Integer idVMenor;
    @Column(name = "iniciales")
    private String iniciales;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @Column(name = "observaciones_v_menor")
    private String observacionesVMenor;
    @JoinColumn(name = "fk_sexo", referencedColumnName = "id_sexo")
    @ManyToOne
    private Sexo fkSexo;

    public VMenor() {
    }

    public VMenor(Integer idVMenor) {
        this.idVMenor = idVMenor;
    }

    public Integer getIdVMenor() {
        return idVMenor;
    }

    public void setIdVMenor(Integer idVMenor) {
        this.idVMenor = idVMenor;
    }

    public String getIniciales() {
        return iniciales;
    }

    public void setIniciales(String iniciales) {
        this.iniciales = iniciales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getObservacionesVMenor() {
        return observacionesVMenor;
    }

    public void setObservacionesVMenor(String observacionesVMenor) {
        this.observacionesVMenor = observacionesVMenor;
    }

    public Sexo getFkSexo() {
        return fkSexo;
    }

    public void setFkSexo(Sexo fkSexo) {
        this.fkSexo = fkSexo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVMenor != null ? idVMenor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VMenor)) {
            return false;
        }
        VMenor other = (VMenor) object;
        if ((this.idVMenor == null && other.idVMenor != null) || (this.idVMenor != null && !this.idVMenor.equals(other.idVMenor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.VMenor[ idVMenor=" + idVMenor + " ]";
    }
    
}
