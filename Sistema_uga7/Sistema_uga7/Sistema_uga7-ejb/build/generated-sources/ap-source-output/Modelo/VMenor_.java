package Modelo;

import Modelo.Sexo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:02")
@StaticMetamodel(VMenor.class)
public class VMenor_ { 

    public static volatile SingularAttribute<VMenor, String> observacionesVMenor;
    public static volatile SingularAttribute<VMenor, String> iniciales;
    public static volatile SingularAttribute<VMenor, Sexo> fkSexo;
    public static volatile SingularAttribute<VMenor, Integer> idVMenor;
    public static volatile SingularAttribute<VMenor, String> nombre;
    public static volatile SingularAttribute<VMenor, String> nacionalidad;

}