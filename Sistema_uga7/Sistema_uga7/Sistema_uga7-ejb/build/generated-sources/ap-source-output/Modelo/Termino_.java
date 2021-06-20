package Modelo;

import Modelo.EstadoActualDeCarpeta;
import Modelo.ResolucionApelacionMp;
import Modelo.SeconsedeOpciones;
import Modelo.SiseConsedeOpcionesSi;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(Termino.class)
public class Termino_ { 

    public static volatile SingularAttribute<Termino, String> carpetaEjecucion;
    public static volatile SingularAttribute<Termino, Date> fechaRemitidaSentencia;
    public static volatile SingularAttribute<Termino, String> puntosResolutivosSentencia;
    public static volatile SingularAttribute<Termino, Integer> idTermino;
    public static volatile SingularAttribute<Termino, String> fechaEnvioFiscaliaEjecucion;
    public static volatile SingularAttribute<Termino, SiseConsedeOpcionesSi> fkConsedeNiega;
    public static volatile SingularAttribute<Termino, String> resolucionEjecucion;
    public static volatile SingularAttribute<Termino, ResolucionApelacionMp> fkResolucion;
    public static volatile SingularAttribute<Termino, String> tipoDeBeneficioConcedido;
    public static volatile SingularAttribute<Termino, Date> fechaAudienciaEjecucion;
    public static volatile SingularAttribute<Termino, String> tribunalJuicioOral;
    public static volatile SingularAttribute<Termino, EstadoActualDeCarpeta> fkEstadoActualCarapeta;
    public static volatile SingularAttribute<Termino, String> fechaRecursoImpuesto;
    public static volatile SingularAttribute<Termino, Date> fechaAsuntoConcluido;
    public static volatile SingularAttribute<Termino, Date> fechaAudiencia;
    public static volatile SingularAttribute<Termino, Date> fechaAbreviadoCondenatorio;
    public static volatile SingularAttribute<Termino, SeconsedeOpciones> fkSeconcedeNiega;

}