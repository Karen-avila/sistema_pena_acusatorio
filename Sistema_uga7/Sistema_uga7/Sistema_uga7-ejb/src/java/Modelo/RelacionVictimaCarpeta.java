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
@Table(name = "relacion_victima_carpeta", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RelacionVictimaCarpeta.findAll", query = "SELECT r FROM RelacionVictimaCarpeta r")
    , @NamedQuery(name = "RelacionVictimaCarpeta.findByIdRelacionvc", query = "SELECT r FROM RelacionVictimaCarpeta r WHERE r.idRelacionvc = :idRelacionvc")})
public class RelacionVictimaCarpeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_relacionvc")
    private Integer idRelacionvc;
    @JoinColumn(name = "fk_carpeta", referencedColumnName = "id_carpeta")
    @ManyToOne(optional = false)
    private Carpeta fkCarpeta;
    @JoinColumn(name = "fk_victima", referencedColumnName = "id_victima_p")
    @ManyToOne(optional = false)
    private VictimaP fkVictima;
    @JoinColumn(name = "fk_datos_v", referencedColumnName = "id_datos_espesificos_v")
    @ManyToOne
    private DatosEspesificosV fkDatosV;

    public RelacionVictimaCarpeta() {
    }

    public RelacionVictimaCarpeta(Integer idRelacionvc) {
        this.idRelacionvc = idRelacionvc;
    }

    public Integer getIdRelacionvc() {
        return idRelacionvc;
    }

    public void setIdRelacionvc(Integer idRelacionvc) {
        this.idRelacionvc = idRelacionvc;
    }

    public Carpeta getFkCarpeta() {
        return fkCarpeta;
    }

    public void setFkCarpeta(Carpeta fkCarpeta) {
        this.fkCarpeta = fkCarpeta;
    }

    public VictimaP getFkVictima() {
        return fkVictima;
    }

    public void setFkVictima(VictimaP fkVictima) {
        this.fkVictima = fkVictima;
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
        hash += (idRelacionvc != null ? idRelacionvc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelacionVictimaCarpeta)) {
            return false;
        }
        RelacionVictimaCarpeta other = (RelacionVictimaCarpeta) object;
        if ((this.idRelacionvc == null && other.idRelacionvc != null) || (this.idRelacionvc != null && !this.idRelacionvc.equals(other.idRelacionvc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.RelacionVictimaCarpeta[ idRelacionvc=" + idRelacionvc + " ]";
    }
    
}
