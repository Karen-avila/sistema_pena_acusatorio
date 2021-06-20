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
@Table(name = "datos_espesificos_de_imputado", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatosEspesificosDeImputado.findAll", query = "SELECT d FROM DatosEspesificosDeImputado d")
    , @NamedQuery(name = "DatosEspesificosDeImputado.findByIdDetosExtra", query = "SELECT d FROM DatosEspesificosDeImputado d WHERE d.idDetosExtra = :idDetosExtra")
    , @NamedQuery(name = "DatosEspesificosDeImputado.findByEdad", query = "SELECT d FROM DatosEspesificosDeImputado d WHERE d.edad = :edad")
    , @NamedQuery(name = "DatosEspesificosDeImputado.findByRepresentacionConsular", query = "SELECT d FROM DatosEspesificosDeImputado d WHERE d.representacionConsular = :representacionConsular")
    , @NamedQuery(name = "DatosEspesificosDeImputado.findByOcupacion", query = "SELECT d FROM DatosEspesificosDeImputado d WHERE d.ocupacion = :ocupacion")
    , @NamedQuery(name = "DatosEspesificosDeImputado.findByDelitoPrimordial", query = "SELECT d FROM DatosEspesificosDeImputado d WHERE d.delitoPrimordial = :delitoPrimordial")
    , @NamedQuery(name = "DatosEspesificosDeImputado.findByModalidadP", query = "SELECT d FROM DatosEspesificosDeImputado d WHERE d.modalidadP = :modalidadP")
    , @NamedQuery(name = "DatosEspesificosDeImputado.findByOtroDelito", query = "SELECT d FROM DatosEspesificosDeImputado d WHERE d.otroDelito = :otroDelito")
    , @NamedQuery(name = "DatosEspesificosDeImputado.findByModalidadS", query = "SELECT d FROM DatosEspesificosDeImputado d WHERE d.modalidadS = :modalidadS")})
public class DatosEspesificosDeImputado implements Serializable {

    @OneToMany(mappedBy = "fkDatosExtraI")
    private List<RelacionCarpetaImputado> relacionCarpetaImputadoList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detos_extra")
    private Integer idDetosExtra;
    @Basic(optional = false)
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "representacion_consular")
    private String representacionConsular;
    @Column(name = "ocupacion")
    private String ocupacion;
    @Basic(optional = false)
    @Column(name = "delito_primordial")
    private String delitoPrimordial;
    @Column(name = "modalidad_p")
    private String modalidadP;
    @Column(name = "otro_delito")
    private String otroDelito;
    @Column(name = "modalidad_s")
    private String modalidadS;
    @JoinColumn(name = "fk_abogado", referencedColumnName = "id_abogado")
    @ManyToOne
    private Abogado fkAbogado;
    @JoinColumn(name = "fk_calificacion_dh", referencedColumnName = "id_calificacion_dh")
    @ManyToOne
    private CalificacionDH fkCalificacionDh;

    public DatosEspesificosDeImputado() {
    }

    public DatosEspesificosDeImputado(Integer idDetosExtra) {
        this.idDetosExtra = idDetosExtra;
    }

    public DatosEspesificosDeImputado(Integer idDetosExtra, Integer edad, String delitoPrimordial) {
        this.idDetosExtra = idDetosExtra;
        this.edad = edad;
        this.delitoPrimordial = delitoPrimordial;
    }

    public Integer getIdDetosExtra() {
        return idDetosExtra;
    }

    public void setIdDetosExtra(Integer idDetosExtra) {
        this.idDetosExtra = idDetosExtra;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRepresentacionConsular() {
        return representacionConsular;
    }

    public void setRepresentacionConsular(String representacionConsular) {
        this.representacionConsular = representacionConsular;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getDelitoPrimordial() {
        return delitoPrimordial;
    }

    public void setDelitoPrimordial(String delitoPrimordial) {
        this.delitoPrimordial = delitoPrimordial;
    }

    public String getModalidadP() {
        return modalidadP;
    }

    public void setModalidadP(String modalidadP) {
        this.modalidadP = modalidadP;
    }

    public String getOtroDelito() {
        return otroDelito;
    }

    public void setOtroDelito(String otroDelito) {
        this.otroDelito = otroDelito;
    }

    public String getModalidadS() {
        return modalidadS;
    }

    public void setModalidadS(String modalidadS) {
        this.modalidadS = modalidadS;
    }

    public Abogado getFkAbogado() {
        return fkAbogado;
    }

    public void setFkAbogado(Abogado fkAbogado) {
        this.fkAbogado = fkAbogado;
    }

    public CalificacionDH getFkCalificacionDh() {
        return fkCalificacionDh;
    }

    public void setFkCalificacionDh(CalificacionDH fkCalificacionDh) {
        this.fkCalificacionDh = fkCalificacionDh;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetosExtra != null ? idDetosExtra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosEspesificosDeImputado)) {
            return false;
        }
        DatosEspesificosDeImputado other = (DatosEspesificosDeImputado) object;
        if ((this.idDetosExtra == null && other.idDetosExtra != null) || (this.idDetosExtra != null && !this.idDetosExtra.equals(other.idDetosExtra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.DatosEspesificosDeImputado[ idDetosExtra=" + idDetosExtra + " ]";
    }

    @XmlTransient
    public List<RelacionCarpetaImputado> getRelacionCarpetaImputadoList() {
        return relacionCarpetaImputadoList;
    }

    public void setRelacionCarpetaImputadoList(List<RelacionCarpetaImputado> relacionCarpetaImputadoList) {
        this.relacionCarpetaImputadoList = relacionCarpetaImputadoList;
    }
    
}
