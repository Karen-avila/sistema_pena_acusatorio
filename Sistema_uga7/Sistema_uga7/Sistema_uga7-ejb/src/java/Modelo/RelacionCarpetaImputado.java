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
@Table(name = "relacion_carpeta_imputado", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RelacionCarpetaImputado.findAll", query = "SELECT r FROM RelacionCarpetaImputado r")
    , @NamedQuery(name = "RelacionCarpetaImputado.findByIdRelacionCI", query = "SELECT r FROM RelacionCarpetaImputado r WHERE r.idRelacionCI = :idRelacionCI")})
public class RelacionCarpetaImputado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_relacion_c_i")
    private Integer idRelacionCI;
    @JoinColumn(name = "fk_carpeta", referencedColumnName = "id_carpeta")
    @ManyToOne(optional = false)
    private Carpeta fkCarpeta;
    @JoinColumn(name = "fk_imputado", referencedColumnName = "id_imputado")
    @ManyToOne(optional = false)
    private Imputado fkImputado;
    @JoinColumn(name = "fk_datos_extra_i", referencedColumnName = "id_detos_extra")
    @ManyToOne
    private DatosEspesificosDeImputado fkDatosExtraI;
    @JoinColumn(name = "fk_fecha_2", referencedColumnName = "id_fecha2")
    @ManyToOne
    private Fecha2 fkFecha2;
    @JoinColumn(name = "fk_fechas", referencedColumnName = "id_fechas")
    @ManyToOne
    private Fechas fkFechas;
    @JoinColumn(name = "fk_fecha_intermedia", referencedColumnName = "id_fecha_intermedia")
    @ManyToOne
    private FechaIntermedia fkFechaIntermedia;
    @JoinColumn(name = "fk_procedimiento_abre", referencedColumnName = "id_procedimiento")
    @ManyToOne
    private ProcediAbreviadoT fkProcedimientoAbre;
    @JoinColumn(name = "fk_termino", referencedColumnName = "id_termino")
    @ManyToOne
    private Termino fkTermino;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkRCarpetaI")
    private List<RelacionVeI> relacionVeIList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkRCarpetaI")
    private List<RelacionVI> relacionVIList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkRCarpetaI")
    private List<RelacionVmI> relacionVmIList;

    public RelacionCarpetaImputado() {
    }

    public RelacionCarpetaImputado(Integer idRelacionCI) {
        this.idRelacionCI = idRelacionCI;
    }

    public Integer getIdRelacionCI() {
        return idRelacionCI;
    }

    public void setIdRelacionCI(Integer idRelacionCI) {
        this.idRelacionCI = idRelacionCI;
    }

    public Carpeta getFkCarpeta() {
        return fkCarpeta;
    }

    public void setFkCarpeta(Carpeta fkCarpeta) {
        this.fkCarpeta = fkCarpeta;
    }

    public Imputado getFkImputado() {
        return fkImputado;
    }

    public void setFkImputado(Imputado fkImputado) {
        this.fkImputado = fkImputado;
    }

    public DatosEspesificosDeImputado getFkDatosExtraI() {
        return fkDatosExtraI;
    }

    public void setFkDatosExtraI(DatosEspesificosDeImputado fkDatosExtraI) {
        this.fkDatosExtraI = fkDatosExtraI;
    }

    public Fecha2 getFkFecha2() {
        return fkFecha2;
    }

    public void setFkFecha2(Fecha2 fkFecha2) {
        this.fkFecha2 = fkFecha2;
    }

    public Fechas getFkFechas() {
        return fkFechas;
    }

    public void setFkFechas(Fechas fkFechas) {
        this.fkFechas = fkFechas;
    }

    public FechaIntermedia getFkFechaIntermedia() {
        return fkFechaIntermedia;
    }

    public void setFkFechaIntermedia(FechaIntermedia fkFechaIntermedia) {
        this.fkFechaIntermedia = fkFechaIntermedia;
    }

    public ProcediAbreviadoT getFkProcedimientoAbre() {
        return fkProcedimientoAbre;
    }

    public void setFkProcedimientoAbre(ProcediAbreviadoT fkProcedimientoAbre) {
        this.fkProcedimientoAbre = fkProcedimientoAbre;
    }

    public Termino getFkTermino() {
        return fkTermino;
    }

    public void setFkTermino(Termino fkTermino) {
        this.fkTermino = fkTermino;
    }

    @XmlTransient
    public List<RelacionVeI> getRelacionVeIList() {
        return relacionVeIList;
    }

    public void setRelacionVeIList(List<RelacionVeI> relacionVeIList) {
        this.relacionVeIList = relacionVeIList;
    }

    @XmlTransient
    public List<RelacionVI> getRelacionVIList() {
        return relacionVIList;
    }

    public void setRelacionVIList(List<RelacionVI> relacionVIList) {
        this.relacionVIList = relacionVIList;
    }

    @XmlTransient
    public List<RelacionVmI> getRelacionVmIList() {
        return relacionVmIList;
    }

    public void setRelacionVmIList(List<RelacionVmI> relacionVmIList) {
        this.relacionVmIList = relacionVmIList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRelacionCI != null ? idRelacionCI.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelacionCarpetaImputado)) {
            return false;
        }
        RelacionCarpetaImputado other = (RelacionCarpetaImputado) object;
        if ((this.idRelacionCI == null && other.idRelacionCI != null) || (this.idRelacionCI != null && !this.idRelacionCI.equals(other.idRelacionCI))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.RelacionCarpetaImputado[ idRelacionCI=" + idRelacionCI + " ]";
    }
    
}
