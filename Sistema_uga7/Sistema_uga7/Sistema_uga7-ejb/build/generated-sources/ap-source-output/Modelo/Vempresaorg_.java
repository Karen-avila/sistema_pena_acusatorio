package Modelo;

import Modelo.RelacionVeI;
import Modelo.RelacionVictimaeCarpeta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:02")
@StaticMetamodel(Vempresaorg.class)
public class Vempresaorg_ { 

    public static volatile SingularAttribute<Vempresaorg, Integer> idVeorg;
    public static volatile SingularAttribute<Vempresaorg, String> nombre;
    public static volatile ListAttribute<Vempresaorg, RelacionVictimaeCarpeta> relacionVictimaeCarpetaList;
    public static volatile ListAttribute<Vempresaorg, RelacionVeI> relacionVeIList;

}