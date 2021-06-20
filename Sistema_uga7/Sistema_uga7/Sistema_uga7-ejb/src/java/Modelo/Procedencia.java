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
@Table(name = "procedencia", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Procedencia.findAll", query = "SELECT p FROM Procedencia p")
    , @NamedQuery(name = "Procedencia.findByIdProcedencia", query = "SELECT p FROM Procedencia p WHERE p.idProcedencia = :idProcedencia")
    , @NamedQuery(name = "Procedencia.findByNombreFiscalia", query = "SELECT p FROM Procedencia p WHERE p.nombreFiscalia = :nombreFiscalia")})
public class Procedencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_procedencia")
    private Integer idProcedencia;
    @Column(name = "nombre_fiscalia")
    private String nombreFiscalia;
    @OneToMany(mappedBy = "fkProcedencia")
    private List<Carpeta> carpetaList;

    public Procedencia() {
    }

    public Procedencia(Integer idProcedencia) {
        this.idProcedencia = idProcedencia;
    }

    public Integer getIdProcedencia() {
        return idProcedencia;
    }

    public void setIdProcedencia(Integer idProcedencia) {
        this.idProcedencia = idProcedencia;
    }

    public String getNombreFiscalia() {
        return nombreFiscalia;
    }

    public void setNombreFiscalia(String nombreFiscalia) {
        this.nombreFiscalia = nombreFiscalia;
    }

    @XmlTransient
    public List<Carpeta> getCarpetaList() {
        return carpetaList;
    }

    public void setCarpetaList(List<Carpeta> carpetaList) {
        this.carpetaList = carpetaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProcedencia != null ? idProcedencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Procedencia)) {
            return false;
        }
        Procedencia other = (Procedencia) object;
        if ((this.idProcedencia == null && other.idProcedencia != null) || (this.idProcedencia != null && !this.idProcedencia.equals(other.idProcedencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Procedencia[ idProcedencia=" + idProcedencia + " ]";
    }
    
}
