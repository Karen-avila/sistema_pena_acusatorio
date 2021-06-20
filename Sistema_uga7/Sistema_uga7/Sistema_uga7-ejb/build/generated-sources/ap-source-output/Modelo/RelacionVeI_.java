package Modelo;

import Modelo.RelacionCarpetaImputado;
import Modelo.Vempresaorg;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(RelacionVeI.class)
public class RelacionVeI_ { 

    public static volatile SingularAttribute<RelacionVeI, Integer> idRelacionVeI;
    public static volatile SingularAttribute<RelacionVeI, RelacionCarpetaImputado> fkRCarpetaI;
    public static volatile SingularAttribute<RelacionVeI, Vempresaorg> fkVe;

}