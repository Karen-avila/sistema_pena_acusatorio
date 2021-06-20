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
@Table(name = "relacion_victimae_carpeta", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RelacionVictimaeCarpeta.findAll", query = "SELECT r FROM RelacionVictimaeCarpeta r")
    , @NamedQuery(name = "RelacionVictimaeCarpeta.findByIdRelacionVec", query = "SELECT r FROM RelacionVictimaeCarpeta r WHERE r.idRelacionVec = :idRelacionVec")})
public class RelacionVictimaeCarpeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_relacion_vec")
    private Integer idRelacionVec;
    @JoinColumn(name = "fk_carpeta", referencedColumnName = "id_carpeta")
    @ManyToOne(optional = false)
    private Carpeta fkCarpeta;
    @JoinColumn(name = "fk_ve", referencedColumnName = "id_veorg")
    @ManyToOne(optional = false)
    private Vempresaorg fkVe;

    public RelacionVictimaeCarpeta() {
    }

    public RelacionVictimaeCarpeta(Integer idRelacionVec) {
        this.idRelacionVec = idRelacionVec;
    }

    public Integer getIdRelacionVec() {
        return idRelacionVec;
    }

    public void setIdRelacionVec(Integer idRelacionVec) {
        this.idRelacionVec = idRelacionVec;
    }

    public Carpeta getFkCarpeta() {
        return fkCarpeta;
    }

    public void setFkCarpeta(Carpeta fkCarpeta) {
        this.fkCarpeta = fkCarpeta;
    }

    public Vempresaorg getFkVe() {
        return fkVe;
    }

    public void setFkVe(Vempresaorg fkVe) {
        this.fkVe = fkVe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRelacionVec != null ? idRelacionVec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelacionVictimaeCarpeta)) {
            return false;
        }
        RelacionVictimaeCarpeta other = (RelacionVictimaeCarpeta) object;
        if ((this.idRelacionVec == null && other.idRelacionVec != null) || (this.idRelacionVec != null && !this.idRelacionVec.equals(other.idRelacionVec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.RelacionVictimaeCarpeta[ idRelacionVec=" + idRelacionVec + " ]";
    }
    
}
