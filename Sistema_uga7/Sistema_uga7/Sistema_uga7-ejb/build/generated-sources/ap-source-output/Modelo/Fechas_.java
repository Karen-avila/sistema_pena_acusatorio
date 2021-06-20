package Modelo;

import Modelo.RelacionCarpetaImputado;
import Modelo.SolucionesAlternas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(Fechas.class)
public class Fechas_ { 

    public static volatile SingularAttribute<Fechas, Date> fechaEnvioEstudioTecnico;
    public static volatile SingularAttribute<Fechas, String> medidasCautelaresArt155;
    public static volatile SingularAttribute<Fechas, Date> fechaPlazoCierreInvestigacion;
    public static volatile SingularAttribute<Fechas, Date> fechaProrrogaInvestgacion;
    public static volatile SingularAttribute<Fechas, Date> fechaVinculacionProceso;
    public static volatile SingularAttribute<Fechas, Date> fechaVencimiento;
    public static volatile SingularAttribute<Fechas, SolucionesAlternas> fkSolucionesAlternas;
    public static volatile SingularAttribute<Fechas, Date> fechaMedidaOtorgada;
    public static volatile SingularAttribute<Fechas, Date> fechaEnvioProcedimientoAbreviado;
    public static volatile SingularAttribute<Fechas, Integer> idFechas;
    public static volatile SingularAttribute<Fechas, Date> nuevaFechaVencimientoAcusacion;
    public static volatile ListAttribute<Fechas, RelacionCarpetaImputado> relacionCarpetaImputadoList;

}