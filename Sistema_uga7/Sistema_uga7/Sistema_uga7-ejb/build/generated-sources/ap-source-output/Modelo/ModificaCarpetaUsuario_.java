package Modelo;

import Modelo.Carpeta;
import Modelo.Persona;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(ModificaCarpetaUsuario.class)
public class ModificaCarpetaUsuario_ { 

    public static volatile SingularAttribute<ModificaCarpetaUsuario, Date> fecha;
    public static volatile SingularAttribute<ModificaCarpetaUsuario, Carpeta> fkCarpeta;
    public static volatile SingularAttribute<ModificaCarpetaUsuario, Integer> idModifica;
    public static volatile SingularAttribute<ModificaCarpetaUsuario, Date> hora;
    public static volatile SingularAttribute<ModificaCarpetaUsuario, Persona> fkPersona;

}