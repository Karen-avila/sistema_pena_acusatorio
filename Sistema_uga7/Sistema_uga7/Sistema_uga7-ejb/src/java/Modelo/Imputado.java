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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "imputado", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Imputado.findAll", query = "SELECT i FROM Imputado i")
    , @NamedQuery(name = "Imputado.findByIdImputado", query = "SELECT i FROM Imputado i WHERE i.idImputado = :idImputado")
    , @NamedQuery(name = "Imputado.findByNombre", query = "SELECT i FROM Imputado i WHERE i.nombre = :nombre")
    , @NamedQuery(name = "Imputado.findByApellidoP", query = "SELECT i FROM Imputado i WHERE i.apellidoP = :apellidoP")
    , @NamedQuery(name = "Imputado.findByApellidoM", query = "SELECT i FROM Imputado i WHERE i.apellidoM = :apellidoM")
    , @NamedQuery(name = "Imputado.findByAlias", query = "SELECT i FROM Imputado i WHERE i.alias = :alias")
    , @NamedQuery(name = "Imputado.findByNacionalidad", query = "SELECT i FROM Imputado i WHERE i.nacionalidad = :nacionalidad")})
public class Imputado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_imputado")
    private Integer idImputado;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido_p")
    private String apellidoP;
    @Basic(optional = false)
    @Column(name = "apellido_m")
    private String apellidoM;
    @Basic(optional = false)
    @Column(name = "alias")
    private String alias;
    @Basic(optional = false)
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkImputado")
    private List<RelacionCarpetaImputado> relacionCarpetaImputadoList;
    @JoinColumn(name = "fk_sexo", referencedColumnName = "id_sexo")
    @ManyToOne(optional = false)
    private Sexo fkSexo;

    public Imputado() {
    }

    public Imputado(Integer idImputado) {
        this.idImputado = idImputado;
    }

    public Imputado(Integer idImputado, String nombre, String apellidoP, String apellidoM, String alias, String nacionalidad) {
        this.idImputado = idImputado;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.alias = alias;
        this.nacionalidad = nacionalidad;
    }

    public Integer getIdImputado() {
        return idImputado;
    }

    public void setIdImputado(Integer idImputado) {
        this.idImputado = idImputado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @XmlTransient
    public List<RelacionCarpetaImputado> getRelacionCarpetaImputadoList() {
        return relacionCarpetaImputadoList;
    }

    public void setRelacionCarpetaImputadoList(List<RelacionCarpetaImputado> relacionCarpetaImputadoList) {
        this.relacionCarpetaImputadoList = relacionCarpetaImputadoList;
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
        hash += (idImputado != null ? idImputado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Imputado)) {
            return false;
        }
        Imputado other = (Imputado) object;
        if ((this.idImputado == null && other.idImputado != null) || (this.idImputado != null && !this.idImputado.equals(other.idImputado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Imputado[ idImputado=" + idImputado + " ]";
    }
    
}
