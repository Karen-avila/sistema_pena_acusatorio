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
@Table(name = "juez_de_tuno_control_nombre", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JuezDeTunoControlNombre.findAll", query = "SELECT j FROM JuezDeTunoControlNombre j")
    , @NamedQuery(name = "JuezDeTunoControlNombre.findByIdNombreJuezControlTurno", query = "SELECT j FROM JuezDeTunoControlNombre j WHERE j.idNombreJuezControlTurno = :idNombreJuezControlTurno")
    , @NamedQuery(name = "JuezDeTunoControlNombre.findByNombreS", query = "SELECT j FROM JuezDeTunoControlNombre j WHERE j.nombreS = :nombreS")
    , @NamedQuery(name = "JuezDeTunoControlNombre.findByApellidoP", query = "SELECT j FROM JuezDeTunoControlNombre j WHERE j.apellidoP = :apellidoP")
    , @NamedQuery(name = "JuezDeTunoControlNombre.findByApellidoM", query = "SELECT j FROM JuezDeTunoControlNombre j WHERE j.apellidoM = :apellidoM")})
public class JuezDeTunoControlNombre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_nombre_juez_control_turno")
    private Integer idNombreJuezControlTurno;
    @Column(name = "nombre_s")
    private String nombreS;
    @Column(name = "apellido_p")
    private String apellidoP;
    @Column(name = "apellido_m")
    private String apellidoM;
    @OneToMany(mappedBy = "fkNombreJuezTurnoControl")
    private List<RelacionCarpetaJuez> relacionCarpetaJuezList;

    public JuezDeTunoControlNombre() {
    }

    public JuezDeTunoControlNombre(Integer idNombreJuezControlTurno) {
        this.idNombreJuezControlTurno = idNombreJuezControlTurno;
    }

    public Integer getIdNombreJuezControlTurno() {
        return idNombreJuezControlTurno;
    }

    public void setIdNombreJuezControlTurno(Integer idNombreJuezControlTurno) {
        this.idNombreJuezControlTurno = idNombreJuezControlTurno;
    }

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    @XmlTransient
    public List<RelacionCarpetaJuez> getRelacionCarpetaJuezList() {
        return relacionCarpetaJuezList;
    }

    public void setRelacionCarpetaJuezList(List<RelacionCarpetaJuez> relacionCarpetaJuezList) {
        this.relacionCarpetaJuezList = relacionCarpetaJuezList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNombreJuezControlTurno != null ? idNombreJuezControlTurno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JuezDeTunoControlNombre)) {
            return false;
        }
        JuezDeTunoControlNombre other = (JuezDeTunoControlNombre) object;
        if ((this.idNombreJuezControlTurno == null && other.idNombreJuezControlTurno != null) || (this.idNombreJuezControlTurno != null && !this.idNombreJuezControlTurno.equals(other.idNombreJuezControlTurno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.JuezDeTunoControlNombre[ idNombreJuezControlTurno=" + idNombreJuezControlTurno + " ]";
    }
    
}
