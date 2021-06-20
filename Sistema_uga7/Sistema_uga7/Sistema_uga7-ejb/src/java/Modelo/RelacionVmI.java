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
@Table(name = "relacion_vm_i", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RelacionVmI.findAll", query = "SELECT r FROM RelacionVmI r")
    , @NamedQuery(name = "RelacionVmI.findByIdRelacionVmI", query = "SELECT r FROM RelacionVmI r WHERE r.idRelacionVmI = :idRelacionVmI")})
public class RelacionVmI implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_relacion_vm_i")
    private Integer idRelacionVmI;
    @JoinColumn(name = "fk_vm", referencedColumnName = "id_v_menor")
    @ManyToOne(optional = false)
    private VMenor fkVm;
    @JoinColumn(name = "fk_datos_v", referencedColumnName = "id_datos_espesificos_v")
    @ManyToOne(optional = false)
    private DatosEspesificosV fkDatosV;
    @JoinColumn(name = "fk_r_carpeta_i", referencedColumnName = "id_relacion_c_i")
    @ManyToOne(optional = false)
    private RelacionCarpetaImputado fkRCarpetaI;

    public RelacionVmI() {
    }

    public RelacionVmI(Integer idRelacionVmI) {
        this.idRelacionVmI = idRelacionVmI;
    }

    public Integer getIdRelacionVmI() {
        return idRelacionVmI;
    }

    public void setIdRelacionVmI(Integer idRelacionVmI) {
        this.idRelacionVmI = idRelacionVmI;
    }

    public VMenor getFkVm() {
        return fkVm;
    }

    public void setFkVm(VMenor fkVm) {
        this.fkVm = fkVm;
    }

    public DatosEspesificosV getFkDatosV() {
        return fkDatosV;
    }

    public void setFkDatosV(DatosEspesificosV fkDatosV) {
        this.fkDatosV = fkDatosV;
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
        hash += (idRelacionVmI != null ? idRelacionVmI.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelacionVmI)) {
            return false;
        }
        RelacionVmI other = (RelacionVmI) object;
        if ((this.idRelacionVmI == null && other.idRelacionVmI != null) || (this.idRelacionVmI != null && !this.idRelacionVmI.equals(other.idRelacionVmI))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.RelacionVmI[ idRelacionVmI=" + idRelacionVmI + " ]";
    }
    
}
