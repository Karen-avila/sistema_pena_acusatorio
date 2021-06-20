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
@Table(name = "procedimiento_abreviado", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProcedimientoAbreviado.findAll", query = "SELECT p FROM ProcedimientoAbreviado p")
    , @NamedQuery(name = "ProcedimientoAbreviado.findByIdProcedimientoAbr", query = "SELECT p FROM ProcedimientoAbreviado p WHERE p.idProcedimientoAbr = :idProcedimientoAbr")
    , @NamedQuery(name = "ProcedimientoAbreviado.findByOpciones", query = "SELECT p FROM ProcedimientoAbreviado p WHERE p.opciones = :opciones")})
public class ProcedimientoAbreviado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_procedimiento_abr")
    private Integer idProcedimientoAbr;
    @Column(name = "opciones")
    private String opciones;
    @OneToMany(mappedBy = "fkProcedimientoOp")
    private List<ProcediAbreviadoT> procediAbreviadoTList;

    public ProcedimientoAbreviado() {
    }

    public ProcedimientoAbreviado(Integer idProcedimientoAbr) {
        this.idProcedimientoAbr = idProcedimientoAbr;
    }

    public Integer getIdProcedimientoAbr() {
        return idProcedimientoAbr;
    }

    public void setIdProcedimientoAbr(Integer idProcedimientoAbr) {
        this.idProcedimientoAbr = idProcedimientoAbr;
    }

    public String getOpciones() {
        return opciones;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }

    @XmlTransient
    public List<ProcediAbreviadoT> getProcediAbreviadoTList() {
        return procediAbreviadoTList;
    }

    public void setProcediAbreviadoTList(List<ProcediAbreviadoT> procediAbreviadoTList) {
        this.procediAbreviadoTList = procediAbreviadoTList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProcedimientoAbr != null ? idProcedimientoAbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcedimientoAbreviado)) {
            return false;
        }
        ProcedimientoAbreviado other = (ProcedimientoAbreviado) object;
        if ((this.idProcedimientoAbr == null && other.idProcedimientoAbr != null) || (this.idProcedimientoAbr != null && !this.idProcedimientoAbr.equals(other.idProcedimientoAbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.ProcedimientoAbreviado[ idProcedimientoAbr=" + idProcedimientoAbr + " ]";
    }
    
}
