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
@Table(name = "relacion_ve_i", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RelacionVeI.findAll", query = "SELECT r FROM RelacionVeI r")
    , @NamedQuery(name = "RelacionVeI.findByIdRelacionVeI", query = "SELECT r FROM RelacionVeI r WHERE r.idRelacionVeI = :idRelacionVeI")})
public class RelacionVeI implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_relacion_ve_i")
    private Integer idRelacionVeI;
    @JoinColumn(name = "fk_ve", referencedColumnName = "id_veorg")
    @ManyToOne(optional = false)
    private Vempresaorg fkVe;
    @JoinColumn(name = "fk_r_carpeta_i", referencedColumnName = "id_relacion_c_i")
    @ManyToOne(optional = false)
    private RelacionCarpetaImputado fkRCarpetaI;

    public RelacionVeI() {
    }

    public RelacionVeI(Integer idRelacionVeI) {
        this.idRelacionVeI = idRelacionVeI;
    }

    public Integer getIdRelacionVeI() {
        return idRelacionVeI;
    }

    public void setIdRelacionVeI(Integer idRelacionVeI) {
        this.idRelacionVeI = idRelacionVeI;
    }

    public Vempresaorg getFkVe() {
        return fkVe;
    }

    public void setFkVe(Vempresaorg fkVe) {
        this.fkVe = fkVe;
    }

    public RelacionCarpetaImputado getFkRCarpetaI() {
        return fkRCarpetaI;
    }

    public void setFkRCarpetaI(RelacionCarpetaImputado fkRCarpetaI) {
        this.fkRCarpetaI = fkRCarpetaI;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRelacionVeI != null ? idRelacionVeI.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelacionVeI)) {
            return false;
        }
        RelacionVeI other = (RelacionVeI) object;
        if ((this.idRelacionVeI == null && other.idRelacionVeI != null) || (this.idRelacionVeI != null && !this.idRelacionVeI.equals(other.idRelacionVeI))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.RelacionVeI[ idRelacionVeI=" + idRelacionVeI + " ]";
    }
    
}
