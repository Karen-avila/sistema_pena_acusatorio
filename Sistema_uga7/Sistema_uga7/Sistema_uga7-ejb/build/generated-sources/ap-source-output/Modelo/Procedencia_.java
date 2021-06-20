package Modelo;

import Modelo.Carpeta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(Procedencia.class)
public class Procedencia_ { 

    public static volatile SingularAttribute<Procedencia, String> nombreFiscalia;
    public static volatile ListAttribute<Procedencia, Carpeta> carpetaList;
    public static volatile SingularAttribute<Procedencia, Integer> idProcedencia;

}