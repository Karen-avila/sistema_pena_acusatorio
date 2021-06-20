package Modelo;

import Modelo.DatosEspesificosV;
import Modelo.RelacionCarpetaImputado;
import Modelo.VictimaP;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(RelacionVI.class)
public class RelacionVI_ { 

    public static volatile SingularAttribute<RelacionVI, Integer> idRelacionVI;
    public static volatile SingularAttribute<RelacionVI, VictimaP> fkVictima;
    public static volatile SingularAttribute<RelacionVI, DatosEspesificosV> fkDatosV;
    public static volatile SingularAttribute<RelacionVI, RelacionCarpetaImputado> fkRCarpetaI;

}