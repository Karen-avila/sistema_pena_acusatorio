package Modelo;

import Modelo.Carpeta;
import Modelo.DatosEspesificosDeImputado;
import Modelo.Fecha2;
import Modelo.FechaIntermedia;
import Modelo.Fechas;
import Modelo.Imputado;
import Modelo.ProcediAbreviadoT;
import Modelo.RelacionVI;
import Modelo.RelacionVeI;
import Modelo.RelacionVmI;
import Modelo.Termino;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(RelacionCarpetaImputado.class)
public class RelacionCarpetaImputado_ { 

    public static volatile SingularAttribute<RelacionCarpetaImputado, Integer> idRelacionCI;
    public static volatile SingularAttribute<RelacionCarpetaImputado, FechaIntermedia> fkFechaIntermedia;
    public static volatile SingularAttribute<RelacionCarpetaImputado, Carpeta> fkCarpeta;
    public static volatile SingularAttribute<RelacionCarpetaImputado, Imputado> fkImputado;
    public static volatile SingularAttribute<RelacionCarpetaImputado, DatosEspesificosDeImputado> fkDatosExtraI;
    public static volatile ListAttribute<RelacionCarpetaImputado, RelacionVmI> relacionVmIList;
    public static volatile SingularAttribute<RelacionCarpetaImputado, Fechas> fkFechas;
    public static volatile SingularAttribute<RelacionCarpetaImputado, Fecha2> fkFecha2;
    public static volatile SingularAttribute<RelacionCarpetaImputado, ProcediAbreviadoT> fkProcedimientoAbre;
    public static volatile SingularAttribute<RelacionCarpetaImputado, Termino> fkTermino;
    public static volatile ListAttribute<RelacionCarpetaImputado, RelacionVI> relacionVIList;
    public static volatile ListAttribute<RelacionCarpetaImputado, RelacionVeI> relacionVeIList;

}