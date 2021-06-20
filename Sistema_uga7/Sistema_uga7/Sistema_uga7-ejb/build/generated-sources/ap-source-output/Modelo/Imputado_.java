package Modelo;

import Modelo.RelacionCarpetaImputado;
import Modelo.Sexo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(Imputado.class)
public class Imputado_ { 

    public static volatile SingularAttribute<Imputado, Integer> idImputado;
    public static volatile SingularAttribute<Imputado, String> apellidoP;
    public static volatile SingularAttribute<Imputado, Sexo> fkSexo;
    public static volatile SingularAttribute<Imputado, String> alias;
    public static volatile SingularAttribute<Imputado, String> apellidoM;
    public static volatile SingularAttribute<Imputado, String> nombre;
    public static volatile SingularAttribute<Imputado, String> nacionalidad;
    public static volatile ListAttribute<Imputado, RelacionCarpetaImputado> relacionCarpetaImputadoList;

}