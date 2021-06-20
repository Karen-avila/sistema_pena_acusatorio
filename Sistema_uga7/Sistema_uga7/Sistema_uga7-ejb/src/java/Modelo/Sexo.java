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
@Table(name = "sexo", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sexo.findAll", query = "SELECT s FROM Sexo s")
    , @NamedQuery(name = "Sexo.findByIdSexo", query = "SELECT s FROM Sexo s WHERE s.idSexo = :idSexo")
    , @NamedQuery(name = "Sexo.findByOpciones", query = "SELECT s FROM Sexo s WHERE s.opciones = :opciones")})
public class Sexo implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkSexo")
    private List<Imputado> imputadoList;
    @OneToMany(mappedBy = "fkSexo")
    private List<VictimaP> victimaPList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sexo")
    private Integer idSexo;
    @Column(name = "opciones")
    private String opciones;
    @OneToMany(mappedBy = "fkSexo")
    private List<VMenor> vMenorList;

    public Sexo() {
    }

    public Sexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    public Integer getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    public String getOpciones() {
        return opciones;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }

    @XmlTransient
    public List<VMenor> getVMenorList() {
        return vMenorList;
    }

    public void setVMenorList(List<VMenor> vMenorList) {
        this.vMenorList = vMenorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSexo != null ? idSexo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sexo)) {
            return false;
        }
        Sexo other = (Sexo) object;
        if ((this.idSexo == null && other.idSexo != null) || (this.idSexo != null && !this.idSexo.equals(other.idSexo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Sexo[ idSexo=" + idSexo + " ]";
    }

    @XmlTransient
    public List<Imputado> getImputadoList() {
        return imputadoList;
    }

    public void setImputadoList(List<Imputado> imputadoList) {
        this.imputadoList = imputadoList;
    }

    @XmlTransient
    public List<VictimaP> getVictimaPList() {
        return victimaPList;
    }

    public void setVictimaPList(List<VictimaP> victimaPList) {
        this.victimaPList = victimaPList;
    }
    
}
