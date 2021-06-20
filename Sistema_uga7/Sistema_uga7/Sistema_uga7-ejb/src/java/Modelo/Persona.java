/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ANA
 */
@Entity
@Table(name = "persona", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p")
    , @NamedQuery(name = "Persona.findByCodigoP", query = "SELECT p FROM Persona p WHERE p.codigoP = :codigoP")
    , @NamedQuery(name = "Persona.findByNombres", query = "SELECT p FROM Persona p WHERE p.nombres = :nombres")
    , @NamedQuery(name = "Persona.findByApellidos", query = "SELECT p FROM Persona p WHERE p.apellidos = :apellidos")
    , @NamedQuery(name = "Persona.findBySexo", query = "SELECT p FROM Persona p WHERE p.sexo = :sexo")
    , @NamedQuery(name = "Persona.findByFechaDeNacimiento", query = "SELECT p FROM Persona p WHERE p.fechaDeNacimiento = :fechaDeNacimiento")})
public class Persona implements Serializable {

    
      
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Basic(optional = false)
    @Column(name = "codigo_p")
    private Integer codigoP;
    
    @Basic(optional = false)
    @Column(name = "nombres")
    private String nombres;
    
    @Basic(optional = false)
    @Column(name = "apellidos")
    private String apellidos;
    
    @Basic(optional = false)
    @Column(name = "sexo")
    private String sexo;
    
    @Basic(optional = false)
        @Column(name = "fecha_de_nacimiento")
    @Temporal(TemporalType.DATE)
    
    private Date fechaDeNacimiento;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkPersona")
    private List<ModificaCarpetaUsuario> modificaCarpetaUsuarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pCodigo")
    private List<Usuario> usuarioList;

    public Persona() {
    }

    public Persona(Integer codigoP) {
        this.codigoP = codigoP;
    }

    public Persona(Integer codigoP, String nombres, String apellidos, String sexo, Date fechaDeNacimiento) {
        this.codigoP = codigoP;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Integer getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(Integer codigoP) {
        this.codigoP = codigoP;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @XmlTransient
    public List<ModificaCarpetaUsuario> getModificaCarpetaUsuarioList() {
        return modificaCarpetaUsuarioList;
    }

    public void setModificaCarpetaUsuarioList(List<ModificaCarpetaUsuario> modificaCarpetaUsuarioList) {
        this.modificaCarpetaUsuarioList = modificaCarpetaUsuarioList;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoP != null ? codigoP.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.codigoP == null && other.codigoP != null) || (this.codigoP != null && !this.codigoP.equals(other.codigoP))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Persona[ codigoP=" + codigoP + " ]";
    }
    
}
