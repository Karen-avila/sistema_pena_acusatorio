package Modelo;

import Modelo.FechaIntermedia;
import Modelo.ReparacionDelDaño;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:02")
@StaticMetamodel(Pena.class)
public class Pena_ { 

    public static volatile SingularAttribute<Pena, Integer> idPena;
    public static volatile SingularAttribute<Pena, String> observacionDeLaReparacion;
    public static volatile ListAttribute<Pena, FechaIntermedia> fechaIntermediaList;
    public static volatile SingularAttribute<Pena, ReparacionDelDaño> fkReparacionDaño;
    public static volatile SingularAttribute<Pena, String> multa;
    public static volatile SingularAttribute<Pena, String> mes;
    public static volatile SingularAttribute<Pena, Integer> dia;
    public static volatile SingularAttribute<Pena, Integer> año;

}