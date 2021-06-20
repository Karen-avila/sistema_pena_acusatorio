package Modelo;

import Modelo.RelacionCarpetaImputado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:02")
@StaticMetamodel(Fecha2.class)
public class Fecha2_ { 

    public static volatile SingularAttribute<Fecha2, Date> fechaCriterioOportunidad;
    public static volatile SingularAttribute<Fecha2, String> motivoDeSuspencionDeProceso;
    public static volatile SingularAttribute<Fecha2, Integer> idFecha2;
    public static volatile SingularAttribute<Fecha2, Date> fechaOrdenCumplida;
    public static volatile SingularAttribute<Fecha2, Date> fechaOrdenCancelada;
    public static volatile SingularAttribute<Fecha2, Date> fechaOrdenDeAprensionLibrada;
    public static volatile ListAttribute<Fecha2, RelacionCarpetaImputado> relacionCarpetaImputadoList;

}