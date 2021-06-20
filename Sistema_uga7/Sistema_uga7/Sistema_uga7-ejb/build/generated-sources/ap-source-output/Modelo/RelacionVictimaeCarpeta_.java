package Modelo;

import Modelo.Carpeta;
import Modelo.Vempresaorg;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(RelacionVictimaeCarpeta.class)
public class RelacionVictimaeCarpeta_ { 

    public static volatile SingularAttribute<RelacionVictimaeCarpeta, Carpeta> fkCarpeta;
    public static volatile SingularAttribute<RelacionVictimaeCarpeta, Vempresaorg> fkVe;
    public static volatile SingularAttribute<RelacionVictimaeCarpeta, Integer> idRelacionVec;

}