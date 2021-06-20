package Modelo;

import Modelo.FechaIntermedia;
import Modelo.ProcediAbreviadoT;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(TipoDeFallo.class)
public class TipoDeFallo_ { 

    public static volatile ListAttribute<TipoDeFallo, FechaIntermedia> fechaIntermediaList;
    public static volatile SingularAttribute<TipoDeFallo, String> opciones;
    public static volatile SingularAttribute<TipoDeFallo, Integer> idTipoDeFallo;
    public static volatile ListAttribute<TipoDeFallo, ProcediAbreviadoT> procediAbreviadoTList;

}