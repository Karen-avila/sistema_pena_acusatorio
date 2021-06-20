package Modelo;

import Modelo.Carpeta;
import Modelo.DatosEspesificosV;
import Modelo.VMenor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(RelacionVictimamCarpeta.class)
public class RelacionVictimamCarpeta_ { 

    public static volatile SingularAttribute<RelacionVictimamCarpeta, Carpeta> fkRelacionCarpeta;
    public static volatile SingularAttribute<RelacionVictimamCarpeta, VMenor> fkVm;
    public static volatile SingularAttribute<RelacionVictimamCarpeta, Integer> idRelacionvmc;
    public static volatile SingularAttribute<RelacionVictimamCarpeta, DatosEspesificosV> fkDatosV;

}