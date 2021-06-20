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
@Table(name = "victima_p", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VictimaP.findAll", query = "SELECT v FROM VictimaP v")
    , @NamedQuery(name = "VictimaP.findByIdVictimaP", query = "SELECT v FROM VictimaP v WHERE v.idVictimaP = :idVictimaP")
    , @NamedQuery(name = "VictimaP.findByNomre", query = "SELECT v FROM VictimaP v WHERE v.nomre = :nomre")
    , @NamedQuery(name = "VictimaP.findByApellidoP", query = "SELECT v FROM VictimaP v WHERE v.apellidoP = :apellidoP")
    , @NamedQuery(name = "VictimaP.findByApellidoM", query = "SELECT v FROM VictimaP v WHERE v.apellidoM = :apellidoM")
    , @NamedQuery(name = "VictimaP.findByAlias", query = "SELECT v FROM VictimaP v WHERE v.alias = :alias")
    , @NamedQuery(name = "VictimaP.findByNacionalidad", query = "SELECT v FROM VictimaP v WHERE v.nacionalidad = :nacionalidad")})
public class VictimaP implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_victima_p")
    private Integer idVictimaP;
    @Column(name = "nomre")
    private String nomre;
    @Column(name = "apellido_p")
    private String apellidoP;
    @Column(name = "apellido_m")
    private String apellidoM;
    @Column(name = "alias")
    private String alias;
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @JoinColumn(name = "fk_sexo", referencedColumnName = "id_sexo")
    @ManyToOne
    private Sexo fkSexo;

    public VictimaP() {
    }

    public VictimaP(Integer idVictimaP) {
        this.idVictimaP = idVictimaP;
    }

    public Integer getIdVictimaP() {
        return idVictimaP;
    }

    public void setIdVictimaP(Integer idVictimaP) {
        this.idVictimaP = idVictimaP;
    }

    public String getNomre() {
        return nomre;
    }

    public void setNomre(String nomre) {
        this.nomre = nomre;
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

    public Sexo getFkSexo() {
        return fkSexo;
    }

    public void setFkSexo(Sexo fkSexo) {
        this.fkSexo = fkSexo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVictimaP != null ? idVictimaP.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VictimaP)) {
            return false;
        }
        VictimaP other = (VictimaP) object;
        if ((this.idVictimaP == null && other.idVictimaP != null) || (this.idVictimaP != null && !this.idVictimaP.equals(other.idVictimaP))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.VictimaP[ idVictimaP=" + idVictimaP + " ]";
    }
    
}
