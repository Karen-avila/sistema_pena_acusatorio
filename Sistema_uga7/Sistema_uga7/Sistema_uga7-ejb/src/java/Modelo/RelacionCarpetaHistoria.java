
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


@Entity
@Table(name = "relacion_carpeta_historia", catalog = "uga7", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RelacionCarpetaHistoria.findAll", query = "SELECT r FROM RelacionCarpetaHistoria r")
    , @NamedQuery(name = "RelacionCarpetaHistoria.findByIdrelacioncarphis", query = "SELECT r FROM RelacionCarpetaHistoria r WHERE r.idrelacioncarphis = :idrelacioncarphis")
    , @NamedQuery(name = "RelacionCarpetaHistoria.findByFechaDeLlegada", query = "SELECT r FROM RelacionCarpetaHistoria r WHERE r.fechaDeLlegada = :fechaDeLlegada")
    , @NamedQuery(name = "RelacionCarpetaHistoria.findByObservaciones", query = "SELECT r FROM RelacionCarpetaHistoria r WHERE r.observaciones = :observaciones")
    , @NamedQuery(name = "RelacionCarpetaHistoria.findByAsuntosconcluidos", query = "SELECT r FROM RelacionCarpetaHistoria r WHERE r.asuntosconcluidos = :asuntosconcluidos")})
public class RelacionCarpetaHistoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrelacioncarphis")
    private Integer idrelacioncarphis;
    @Basic(optional = false)
    @Column(name = "fecha_de_llegada")
    @Temporal(TemporalType.DATE)
    private Date fechaDeLlegada;
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "Asuntos_concluidos")
    private String asuntosconcluidos;
    @JoinColumn(name = "fk_historia_op", referencedColumnName = "idhistoria")
    @ManyToOne(optional = false)
    private HidtoriaCarpeta fkHistoriaOp;
    @JoinColumn(name = "fk_carpeta", referencedColumnName = "id_carpeta")
    @ManyToOne(optional = false)
    private Carpeta fkCarpeta;

    public RelacionCarpetaHistoria() {
    }

    public RelacionCarpetaHistoria(Integer idrelacioncarphis) {
        this.idrelacioncarphis = idrelacioncarphis;
    }

    public RelacionCarpetaHistoria(Integer idrelacioncarphis, Date fechaDeLlegada) {
        this.idrelacioncarphis = idrelacioncarphis;
        this.fechaDeLlegada = fechaDeLlegada;
    }

    public Integer getIdrelacioncarphis() {
        return idrelacioncarphis;
    }

    public void setIdrelacioncarphis(Integer idrelacioncarphis) {
        this.idrelacioncarphis = idrelacioncarphis;
    }

    public Date getFechaDeLlegada() {
        return fechaDeLlegada;
    }

    public void setFechaDeLlegada(Date fechaDeLlegada) {
        this.fechaDeLlegada = fechaDeLlegada;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getAsuntosconcluidos() {
        return asuntosconcluidos;
    }

    public void setAsuntosconcluidos(String asuntosconcluidos) {
        this.asuntosconcluidos = asuntosconcluidos;
    }

    public HidtoriaCarpeta getFkHistoriaOp() {
        return fkHistoriaOp;
    }

    public void setFkHistoriaOp(HidtoriaCarpeta fkHistoriaOp) {
        this.fkHistoriaOp = fkHistoriaOp;
    }

    public Carpeta getFkCarpeta() {
        return fkCarpeta;
    }

    public void setFkCarpeta(Carpeta fkCarpeta) {
        this.fkCarpeta = fkCarpeta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrelacioncarphis != null ? idrelacioncarphis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelacionCarpetaHistoria)) {
            return false;
        }
        RelacionCarpetaHistoria other = (RelacionCarpetaHistoria) object;
        if ((this.idrelacioncarphis == null && other.idrelacioncarphis != null) || (this.idrelacioncarphis != null && !this.idrelacioncarphis.equals(other.idrelacioncarphis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.RelacionCarpetaHistoria[ idrelacioncarphis=" + idrelacioncarphis + " ]";
    }
    
}
