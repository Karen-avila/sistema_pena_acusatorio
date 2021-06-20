package Modelo;

import Modelo.RelacionCarpetaJuez;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(JuezDeTunoControlNombre.class)
public class JuezDeTunoControlNombre_ { 

    public static volatile SingularAttribute<JuezDeTunoControlNombre, Integer> idNombreJuezControlTurno;
    public static volatile SingularAttribute<JuezDeTunoControlNombre, String> apellidoP;
    public static volatile SingularAttribute<JuezDeTunoControlNombre, String> apellidoM;
    public static volatile ListAttribute<JuezDeTunoControlNombre, RelacionCarpetaJuez> relacionCarpetaJuezList;
    public static volatile SingularAttribute<JuezDeTunoControlNombre, String> nombreS;

}