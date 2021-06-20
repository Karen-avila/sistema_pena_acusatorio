/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ANA
 */
@Entity
@Table(name = "procedi_abreviado_t", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProcediAbreviadoT.findAll", query = "SELECT p FROM ProcediAbreviadoT p")
    , @NamedQuery(name = "ProcediAbreviadoT.findByIdProcedimiento", query = "SELECT p FROM ProcediAbreviadoT p WHERE p.idProcedimiento = :idProcedimiento")
    , @NamedQuery(name = "ProcediAbreviadoT.findByFechaSentenciaProcAbreviado", query = "SELECT p FROM ProcediAbreviadoT p WHERE p.fechaSentenciaProcAbreviado = :fechaSentenciaProcAbreviado")
    , @NamedQuery(name = "ProcediAbreviadoT.findByFechaDeSobreseimiento", query = "SELECT p FROM ProcediAbreviadoT p WHERE p.fechaDeSobreseimiento = :fechaDeSobreseimiento")
    , @NamedQuery(name = "ProcediAbreviadoT.findBySobreseimiento", query = "SELECT p FROM ProcediAbreviadoT p WHERE p.sobreseimiento = :sobreseimiento")
    , @NamedQuery(name = "ProcediAbreviadoT.findByNumerooficio", query = "SELECT p FROM ProcediAbreviadoT p WHERE p.numerooficio = :numerooficio")})
public class ProcediAbreviadoT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_procedimiento")
    private Integer idProcedimiento;
    @Column(name = "fecha_sentencia_proc_abreviado")
    @Temporal(TemporalType.DATE)
    private Date fechaSentenciaProcAbreviado;
    @Column(name = "fecha_de_sobreseimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaDeSobreseimiento;
    @Column(name = "sobreseimiento")
    private String sobreseimiento;
    @Column(name = "Numero_oficio")
    private String numerooficio;
    @JoinColumn(name = "fk_procedimiento_op", referencedColumnName = "id_procedimiento_abr")
    @ManyToOne
    private ProcedimientoAbreviado fkProcedimientoOp;
    @JoinColumn(name = "fk_tipode_fallo", referencedColumnName = "id_tipo_de_fallo")
    @ManyToOne
    private TipoDeFallo fkTipodeFallo;

    public ProcediAbreviadoT() {
    }

    public ProcediAbreviadoT(Integer idProcedimiento) {
        this.idProcedimiento = idProcedimiento;
    }

    public Integer getIdProcedimiento() {
        return idProcedimiento;
    }

    public void setIdProcedimiento(Integer idProcedimiento) {
        this.idProcedimiento = idProcedimiento;
    }

    public Date getFechaSentenciaProcAbreviado() {
        return fechaSentenciaProcAbreviado;
    }

    public void setFechaSentenciaProcAbreviado(Date fechaSentenciaProcAbreviado) {
        this.fechaSentenciaProcAbreviado = fechaSentenciaProcAbreviado;
    }

    public Date getFechaDeSobreseimiento() {
        return fechaDeSobreseimiento;
    }

    public void setFechaDeSobreseimiento(Date fechaDeSobreseimiento) {
        this.fechaDeSobreseimiento = fechaDeSobreseimiento;
    }

    public String getSobreseimiento() {
        return sobreseimiento;
    }

    public void setSobreseimiento(String sobreseimiento) {
        this.sobreseimiento = sobreseimiento;
    }

    public String getNumerooficio() {
        return numerooficio;
    }

    public void setNumerooficio(String numerooficio) {
        this.numerooficio = numerooficio;
    }

    public ProcedimientoAbreviado getFkProcedimientoOp() {
        return fkProcedimientoOp;
    }

    public void setFkProcedimientoOp(ProcedimientoAbreviado fkProcedimientoOp) {
        this.fkProcedimientoOp = fkProcedimientoOp;
    }

    public TipoDeFallo getFkTipodeFallo() {
        return fkTipodeFallo;
    }

    public void setFkTipodeFallo(TipoDeFallo fkTipodeFallo) {
        this.fkTipodeFallo = fkTipodeFallo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProcedimiento != null ? idProcedimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcediAbreviadoT)) {
            return false;
        }
        ProcediAbreviadoT other = (ProcediAbreviadoT) object;
        if ((this.idProcedimiento == null && other.idProcedimiento != null) || (this.idProcedimiento != null && !this.idProcedimiento.equals(other.idProcedimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.ProcediAbreviadoT[ idProcedimiento=" + idProcedimiento + " ]";
    }
    
}
