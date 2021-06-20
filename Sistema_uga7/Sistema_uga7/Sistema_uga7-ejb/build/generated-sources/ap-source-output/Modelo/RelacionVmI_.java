package Modelo;

import Modelo.DatosEspesificosV;
import Modelo.RelacionCarpetaImputado;
import Modelo.VMenor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(RelacionVmI.class)
public class RelacionVmI_ { 

    public static volatile SingularAttribute<RelacionVmI, VMenor> fkVm;
    public static volatile SingularAttribute<RelacionVmI, Integer> idRelacionVmI;
    public static volatile SingularAttribute<RelacionVmI, DatosEspesificosV> fkDatosV;
    public static volatile SingularAttribute<RelacionVmI, RelacionCarpetaImputado> fkRCarpetaI;

}