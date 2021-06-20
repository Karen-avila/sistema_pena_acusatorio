package Modelo;

import Modelo.Sexo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:02")
@StaticMetamodel(VictimaP.class)
public class VictimaP_ { 

    public static volatile SingularAttribute<VictimaP, Integer> idVictimaP;
    public static volatile SingularAttribute<VictimaP, String> apellidoP;
    public static volatile SingularAttribute<VictimaP, Sexo> fkSexo;
    public static volatile SingularAttribute<VictimaP, String> alias;
    public static volatile SingularAttribute<VictimaP, String> apellidoM;
    public static volatile SingularAttribute<VictimaP, String> nomre;
    public static volatile SingularAttribute<VictimaP, String> nacionalidad;

}