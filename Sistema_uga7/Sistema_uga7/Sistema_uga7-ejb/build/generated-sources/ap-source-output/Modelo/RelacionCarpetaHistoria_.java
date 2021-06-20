package Modelo;

import Modelo.Carpeta;
import Modelo.HidtoriaCarpeta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(RelacionCarpetaHistoria.class)
public class RelacionCarpetaHistoria_ { 

    public static volatile SingularAttribute<RelacionCarpetaHistoria, HidtoriaCarpeta> fkHistoriaOp;
    public static volatile SingularAttribute<RelacionCarpetaHistoria, String> asuntosconcluidos;
    public static volatile SingularAttribute<RelacionCarpetaHistoria, Integer> idrelacioncarphis;
    public static volatile SingularAttribute<RelacionCarpetaHistoria, Carpeta> fkCarpeta;
    public static volatile SingularAttribute<RelacionCarpetaHistoria, Date> fechaDeLlegada;
    public static volatile SingularAttribute<RelacionCarpetaHistoria, String> observaciones;

}