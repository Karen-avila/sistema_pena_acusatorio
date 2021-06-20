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
@Table(name = "relacion_carpeta_juez", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RelacionCarpetaJuez.findAll", query = "SELECT r FROM RelacionCarpetaJuez r")
    , @NamedQuery(name = "RelacionCarpetaJuez.findByIdRelacionCJ", query = "SELECT r FROM RelacionCarpetaJuez r WHERE r.idRelacionCJ = :idRelacionCJ")})
public class RelacionCarpetaJuez implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_relacion_c_j")
    private Integer idRelacionCJ;
    @JoinColumn(name = "fk_carpeta", referencedColumnName = "id_carpeta")
    @ManyToOne(optional = false)
    private Carpeta fkCarpeta;
    @JoinColumn(name = "fk_nombre_juez_turno_control", referencedColumnName = "id_nombre_juez_control_turno")
    @ManyToOne
    private JuezDeTunoControlNombre fkNombreJuezTurnoControl;

    public RelacionCarpetaJuez() {
    }

    public RelacionCarpetaJuez(Integer idRelacionCJ) {
        this.idRelacionCJ = idRelacionCJ;
    }

    public Integer getIdRelacionCJ() {
        return idRelacionCJ;
    }

    public void setIdRelacionCJ(Integer idRelacionCJ) {
        this.idRelacionCJ = idRelacionCJ;
    }

    public Carpeta getFkCarpeta() {
        return fkCarpeta;
    }

    public void setFkCarpeta(Carpeta fkCarpeta) {
        this.fkCarpeta = fkCarpeta;
    }

    public JuezDeTunoControlNombre getFkNombreJuezTurnoControl() {
        return fkNombreJuezTurnoControl;
    }

    public void setFkNombreJuezTurnoControl(JuezDeTunoControlNombre fkNombreJuezTurnoControl) {
        this.fkNombreJuezTurnoControl = fkNombreJuezTurnoControl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRelacionCJ != null ? idRelacionCJ.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelacionCarpetaJuez)) {
            return false;
        }
        RelacionCarpetaJuez other = (RelacionCarpetaJuez) object;
        if ((this.idRelacionCJ == null && other.idRelacionCJ != null) || (this.idRelacionCJ != null && !this.idRelacionCJ.equals(other.idRelacionCJ))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.RelacionCarpetaJuez[ idRelacionCJ=" + idRelacionCJ + " ]";
    }
    
}
