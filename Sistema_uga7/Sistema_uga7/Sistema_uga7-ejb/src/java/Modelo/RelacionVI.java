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
@Table(name = "relacion_v_i", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RelacionVI.findAll", query = "SELECT r FROM RelacionVI r")
    , @NamedQuery(name = "RelacionVI.findByIdRelacionVI", query = "SELECT r FROM RelacionVI r WHERE r.idRelacionVI = :idRelacionVI")})
public class RelacionVI implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_relacion_v_i")
    private Integer idRelacionVI;
    @JoinColumn(name = "fk_datos_v", referencedColumnName = "id_datos_espesificos_v")
    @ManyToOne(optional = false)
    private DatosEspesificosV fkDatosV;
    @JoinColumn(name = "fk_victima", referencedColumnName = "id_victima_p")
    @ManyToOne(optional = false)
    private VictimaP fkVictima;
    @JoinColumn(name = "fk_r_carpeta_i", referencedColumnName = "id_relacion_c_i")
    @ManyToOne(optional = false)
    private RelacionCarpetaImputado fkRCarpetaI;

    public RelacionVI() {
    }

    public RelacionVI(Integer idRelacionVI) {
        this.idRelacionVI = idRelacionVI;
    }

    public Integer getIdRelacionVI() {
        return idRelacionVI;
    }

    public void setIdRelacionVI(Integer idRelacionVI) {
        this.idRelacionVI = idRelacionVI;
    }

    public DatosEspesificosV getFkDatosV() {
        return fkDatosV;
    }

    public void setFkDatosV(DatosEspesificosV fkDatosV) {
        this.fkDatosV = fkDatosV;
    }

    public VictimaP getFkVictima() {
        return fkVictima;
    }

    public void setFkVictima(VictimaP fkVictima) {
        this.fkVictima = fkVictima;
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
        hash += (idRelacionVI != null ? idRelacionVI.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelacionVI)) {
            return false;
        }
        RelacionVI other = (RelacionVI) object;
        if ((this.idRelacionVI == null && other.idRelacionVI != null) || (this.idRelacionVI != null && !this.idRelacionVI.equals(other.idRelacionVI))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.RelacionVI[ idRelacionVI=" + idRelacionVI + " ]";
    }
    
}
