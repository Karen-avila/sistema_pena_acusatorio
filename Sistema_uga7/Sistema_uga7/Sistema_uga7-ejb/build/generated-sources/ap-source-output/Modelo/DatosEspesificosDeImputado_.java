package Modelo;

import Modelo.Abogado;
import Modelo.CalificacionDH;
import Modelo.RelacionCarpetaImputado;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(DatosEspesificosDeImputado.class)
public class DatosEspesificosDeImputado_ { 

    public static volatile SingularAttribute<DatosEspesificosDeImputado, String> modalidadP;
    public static volatile SingularAttribute<DatosEspesificosDeImputado, Abogado> fkAbogado;
    public static volatile SingularAttribute<DatosEspesificosDeImputado, String> delitoPrimordial;
    public static volatile SingularAttribute<DatosEspesificosDeImputado, String> otroDelito;
    public static volatile SingularAttribute<DatosEspesificosDeImputado, Integer> idDetosExtra;
    public static volatile SingularAttribute<DatosEspesificosDeImputado, String> ocupacion;
    public static volatile SingularAttribute<DatosEspesificosDeImputado, String> representacionConsular;
    public static volatile SingularAttribute<DatosEspesificosDeImputado, Integer> edad;
    public static volatile SingularAttribute<DatosEspesificosDeImputado, String> modalidadS;
    public static volatile ListAttribute<DatosEspesificosDeImputado, RelacionCarpetaImputado> relacionCarpetaImputadoList;
    public static volatile SingularAttribute<DatosEspesificosDeImputado, CalificacionDH> fkCalificacionDh;

}