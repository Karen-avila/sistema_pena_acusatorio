package Modelo;

import Modelo.Carpeta;
import Modelo.JuezDeTunoControlNombre;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(RelacionCarpetaJuez.class)
public class RelacionCarpetaJuez_ { 

    public static volatile SingularAttribute<RelacionCarpetaJuez, Integer> idRelacionCJ;
    public static volatile SingularAttribute<RelacionCarpetaJuez, JuezDeTunoControlNombre> fkNombreJuezTurnoControl;
    public static volatile SingularAttribute<RelacionCarpetaJuez, Carpeta> fkCarpeta;

}