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
@Table(name = "pena", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pena.findAll", query = "SELECT p FROM Pena p")
    , @NamedQuery(name = "Pena.findByIdPena", query = "SELECT p FROM Pena p WHERE p.idPena = :idPena")
    , @NamedQuery(name = "Pena.findByA\u00f1o", query = "SELECT p FROM Pena p WHERE p.a\u00f1o = :a\u00f1o")
    , @NamedQuery(name = "Pena.findByMes", query = "SELECT p FROM Pena p WHERE p.mes = :mes")
    , @NamedQuery(name = "Pena.findByDia", query = "SELECT p FROM Pena p WHERE p.dia = :dia")
    , @NamedQuery(name = "Pena.findByMulta", query = "SELECT p FROM Pena p WHERE p.multa = :multa")
    , @NamedQuery(name = "Pena.findByObservacionDeLaReparacion", query = "SELECT p FROM Pena p WHERE p.observacionDeLaReparacion = :observacionDeLaReparacion")})
public class Pena implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pena")
    private Integer idPena;
    @Column(name = "a\u00f1o")
    private Integer año;
    @Column(name = "mes")
    private String mes;
    @Column(name = "dia")
    private Integer dia;
    @Column(name = "multa")
    private String multa;
    @Column(name = "observacion_de_la_reparacion")
    private String observacionDeLaReparacion;
    @JoinColumn(name = "fk_reparacion_da\u00f1o", referencedColumnName = "id_reparacion_da\u00f1o")
    @ManyToOne
    private ReparacionDelDaño fkReparacionDaño;
    @OneToMany(mappedBy = "fkPena")
    private List<FechaIntermedia> fechaIntermediaList;

    public Pena() {
    }

    public Pena(Integer idPena) {
        this.idPena = idPena;
    }

    public Integer getIdPena() {
        return idPena;
    }

    public void setIdPena(Integer idPena) {
        this.idPena = idPena;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public String getMulta() {
        return multa;
    }

    public void setMulta(String multa) {
        this.multa = multa;
    }

    public String getObservacionDeLaReparacion() {
        return observacionDeLaReparacion;
    }

    public void setObservacionDeLaReparacion(String observacionDeLaReparacion) {
        this.observacionDeLaReparacion = observacionDeLaReparacion;
    }

    public ReparacionDelDaño getFkReparacionDaño() {
        return fkReparacionDaño;
    }

    public void setFkReparacionDaño(ReparacionDelDaño fkReparacionDaño) {
        this.fkReparacionDaño = fkReparacionDaño;
    }

    @XmlTransient
    public List<FechaIntermedia> getFechaIntermediaList() {
        return fechaIntermediaList;
    }

    public void setFechaIntermediaList(List<FechaIntermedia> fechaIntermediaList) {
        this.fechaIntermediaList = fechaIntermediaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPena != null ? idPena.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pena)) {
            return false;
        }
        Pena other = (Pena) object;
        if ((this.idPena == null && other.idPena != null) || (this.idPena != null && !this.idPena.equals(other.idPena))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Pena[ idPena=" + idPena + " ]";
    }
    
}
