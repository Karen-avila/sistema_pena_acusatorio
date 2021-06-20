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
@Table(name = "modifica_carpeta_usuario", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ModificaCarpetaUsuario.findAll", query = "SELECT m FROM ModificaCarpetaUsuario m")
    , @NamedQuery(name = "ModificaCarpetaUsuario.findByIdModifica", query = "SELECT m FROM ModificaCarpetaUsuario m WHERE m.idModifica = :idModifica")
    , @NamedQuery(name = "ModificaCarpetaUsuario.findByFecha", query = "SELECT m FROM ModificaCarpetaUsuario m WHERE m.fecha = :fecha")
    , @NamedQuery(name = "ModificaCarpetaUsuario.findByHora", query = "SELECT m FROM ModificaCarpetaUsuario m WHERE m.hora = :hora")})
public class ModificaCarpetaUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_modifica")
    private Integer idModifica;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @JoinColumn(name = "fk_carpeta", referencedColumnName = "id_carpeta")
    @ManyToOne(optional = false)
    private Carpeta fkCarpeta;
    @JoinColumn(name = "fk_persona", referencedColumnName = "codigo_p")
    @ManyToOne(optional = false)
    private Persona fkPersona;

    public ModificaCarpetaUsuario() {
    }

    public ModificaCarpetaUsuario(Integer idModifica) {
        this.idModifica = idModifica;
    }

    public ModificaCarpetaUsuario(Integer idModifica, Date fecha, Date hora) {
        this.idModifica = idModifica;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Integer getIdModifica() {
        return idModifica;
    }

    public void setIdModifica(Integer idModifica) {
        this.idModifica = idModifica;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Carpeta getFkCarpeta() {
        return fkCarpeta;
    }

    public void setFkCarpeta(Carpeta fkCarpeta) {
        this.fkCarpeta = fkCarpeta;
    }

    public Persona getFkPersona() {
        return fkPersona;
    }

    public void setFkPersona(Persona fkPersona) {
        this.fkPersona = fkPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idModifica != null ? idModifica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModificaCarpetaUsuario)) {
            return false;
        }
        ModificaCarpetaUsuario other = (ModificaCarpetaUsuario) object;
        if ((this.idModifica == null && other.idModifica != null) || (this.idModifica != null && !this.idModifica.equals(other.idModifica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.ModificaCarpetaUsuario[ idModifica=" + idModifica + " ]";
    }
    
}
