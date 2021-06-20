package Modelo;

import Modelo.Carpeta;
import Modelo.DatosEspesificosV;
import Modelo.VictimaP;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(RelacionVictimaCarpeta.class)
public class RelacionVictimaCarpeta_ { 

    public static volatile SingularAttribute<RelacionVictimaCarpeta, VictimaP> fkVictima;
    public static volatile SingularAttribute<RelacionVictimaCarpeta, Carpeta> fkCarpeta;
    public static volatile SingularAttribute<RelacionVictimaCarpeta, DatosEspesificosV> fkDatosV;
    public static volatile SingularAttribute<RelacionVictimaCarpeta, Integer> idRelacionvc;

}