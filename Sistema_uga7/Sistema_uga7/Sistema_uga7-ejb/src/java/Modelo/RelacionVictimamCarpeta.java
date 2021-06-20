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
@Table(name = "relacion_victimam_carpeta", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RelacionVictimamCarpeta.findAll", query = "SELECT r FROM RelacionVictimamCarpeta r")
    , @NamedQuery(name = "RelacionVictimamCarpeta.findByIdRelacionvmc", query = "SELECT r FROM RelacionVictimamCarpeta r WHERE r.idRelacionvmc = :idRelacionvmc")})
public class RelacionVictimamCarpeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_relacionvmc")
    private Integer idRelacionvmc;
    @JoinColumn(name = "fk_relacion_carpeta", referencedColumnName = "id_carpeta")
    @ManyToOne(optional = false)
    private Carpeta fkRelacionCarpeta;
    @JoinColumn(name = "fk_vm", referencedColumnName = "id_v_menor")
    @ManyToOne(optional = false)
    private VMenor fkVm;
    @JoinColumn(name = "fk_datos_v", referencedColumnName = "id_datos_espesificos_v")
    @ManyToOne
    private DatosEspesificosV fkDatosV;

    public RelacionVictimamCarpeta() {
    }

    public RelacionVictimamCarpeta(Integer idRelacionvmc) {
        this.idRelacionvmc = idRelacionvmc;
    }

    public Integer getIdRelacionvmc() {
        return idRelacionvmc;
    }

    public void setIdRelacionvmc(Integer idRelacionvmc) {
        this.idRelacionvmc = idRelacionvmc;
    }

    public Carpeta getFkRelacionCarpeta() {
        return fkRelacionCarpeta;
    }

    public void setFkRelacionCarpeta(Carpeta fkRelacionCarpeta) {
        this.fkRelacionCarpeta = fkRelacionCarpeta;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRelacionvmc != null ? idRelacionvmc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelacionVictimamCarpeta)) {
            return false;
        }
        RelacionVictimamCarpeta other = (RelacionVictimamCarpeta) object;
        if ((this.idRelacionvmc == null && other.idRelacionvmc != null) || (this.idRelacionvmc != null && !this.idRelacionvmc.equals(other.idRelacionvmc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.RelacionVictimamCarpeta[ idRelacionvmc=" + idRelacionvmc + " ]";
    }
    
}
