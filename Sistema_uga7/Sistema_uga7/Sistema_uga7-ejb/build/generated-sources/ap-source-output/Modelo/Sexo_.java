package Modelo;

import Modelo.Imputado;
import Modelo.VMenor;
import Modelo.VictimaP;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(Sexo.class)
public class Sexo_ { 

    public static volatile ListAttribute<Sexo, Imputado> imputadoList;
    public static volatile SingularAttribute<Sexo, Integer> idSexo;
    public static volatile SingularAttribute<Sexo, String> opciones;
    public static volatile ListAttribute<Sexo, VictimaP> victimaPList;
    public static volatile ListAttribute<Sexo, VMenor> vMenorList;

}