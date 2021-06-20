package Modelo;

import Modelo.Fechas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:02")
@StaticMetamodel(SolucionesAlternas.class)
public class SolucionesAlternas_ { 

    public static volatile SingularAttribute<SolucionesAlternas, Date> acuerdoReparatorio;
    public static volatile SingularAttribute<SolucionesAlternas, Date> suspencionCondicional;
    public static volatile ListAttribute<SolucionesAlternas, Fechas> fechasList;
    public static volatile SingularAttribute<SolucionesAlternas, Integer> idSolucionesAl;

}