package Modelo;

import Modelo.ProcedimientoAbreviado;
import Modelo.TipoDeFallo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(ProcediAbreviadoT.class)
public class ProcediAbreviadoT_ { 

    public static volatile SingularAttribute<ProcediAbreviadoT, String> sobreseimiento;
    public static volatile SingularAttribute<ProcediAbreviadoT, String> numerooficio;
    public static volatile SingularAttribute<ProcediAbreviadoT, Integer> idProcedimiento;
    public static volatile SingularAttribute<ProcediAbreviadoT, ProcedimientoAbreviado> fkProcedimientoOp;
    public static volatile SingularAttribute<ProcediAbreviadoT, Date> fechaSentenciaProcAbreviado;
    public static volatile SingularAttribute<ProcediAbreviadoT, TipoDeFallo> fkTipodeFallo;
    public static volatile SingularAttribute<ProcediAbreviadoT, Date> fechaDeSobreseimiento;

}