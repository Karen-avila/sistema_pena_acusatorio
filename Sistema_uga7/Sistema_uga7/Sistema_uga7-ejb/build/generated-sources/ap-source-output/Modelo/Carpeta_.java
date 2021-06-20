package Modelo;

import Modelo.ComboCSD;
import Modelo.MpQueTrabaja;
import Modelo.Persona;
import Modelo.Procedencia;
import Modelo.PuestaADisposicion;
import Modelo.UnidadDeGestion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(Carpeta.class)
public class Carpeta_ { 

    public static volatile SingularAttribute<Carpeta, ComboCSD> fkCsd;
    public static volatile SingularAttribute<Carpeta, Procedencia> fkProcedencia;
    public static volatile SingularAttribute<Carpeta, PuestaADisposicion> fkPuestaDisposicion;
    public static volatile SingularAttribute<Carpeta, String> carpetasJudicialesAcumuladas;
    public static volatile SingularAttribute<Carpeta, String> carpetaDeInvestigacion;
    public static volatile SingularAttribute<Carpeta, MpQueTrabaja> fkMPTrabaja;
    public static volatile SingularAttribute<Carpeta, String> mPPropone;
    public static volatile SingularAttribute<Carpeta, Date> fecha;
    public static volatile SingularAttribute<Carpeta, Integer> idCarpeta;
    public static volatile SingularAttribute<Carpeta, Persona> codigoP;
    public static volatile SingularAttribute<Carpeta, String> carpetasDeOrigenIncompetencia;
    public static volatile SingularAttribute<Carpeta, Date> fechaDeInicio;
    public static volatile SingularAttribute<Carpeta, String> carpetaJudicial;
    public static volatile SingularAttribute<Carpeta, UnidadDeGestion> fkUnidadGestion;
    public static volatile SingularAttribute<Carpeta, Integer> año;

}