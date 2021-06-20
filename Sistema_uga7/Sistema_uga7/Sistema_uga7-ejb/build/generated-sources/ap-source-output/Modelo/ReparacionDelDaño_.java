package Modelo;

import Modelo.Pena;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(ReparacionDelDaño.class)
public class ReparacionDelDaño_ { 

    public static volatile SingularAttribute<ReparacionDelDaño, String> opciones;
    public static volatile SingularAttribute<ReparacionDelDaño, Integer> idReparacionDaño;
    public static volatile ListAttribute<ReparacionDelDaño, Pena> penaList;

}