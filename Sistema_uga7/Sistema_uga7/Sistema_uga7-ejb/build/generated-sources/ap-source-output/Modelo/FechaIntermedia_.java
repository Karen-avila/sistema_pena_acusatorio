package Modelo;

import Modelo.EtapaIntermedia;
import Modelo.Pena;
import Modelo.RelacionCarpetaImputado;
import Modelo.TipoDeFallo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(FechaIntermedia.class)
public class FechaIntermedia_ { 

    public static volatile SingularAttribute<FechaIntermedia, Date> apelacionExclucionSuspendeProcu;
    public static volatile SingularAttribute<FechaIntermedia, String> carpetaJuicio;
    public static volatile SingularAttribute<FechaIntermedia, TipoDeFallo> fkTipoDeFallo;
    public static volatile SingularAttribute<FechaIntermedia, Date> fechaCelebracionAudJuicioOral;
    public static volatile SingularAttribute<FechaIntermedia, Date> fechaAcusacion;
    public static volatile SingularAttribute<FechaIntermedia, Date> fechaDeFallo;
    public static volatile SingularAttribute<FechaIntermedia, Date> fechaAudienciaInterCelebrada;
    public static volatile SingularAttribute<FechaIntermedia, String> fechaAudienciaInterSeñalada;
    public static volatile SingularAttribute<FechaIntermedia, Date> fechaAlegatosClausura;
    public static volatile SingularAttribute<FechaIntermedia, Date> fechaAperturaJuicioOral;
    public static volatile SingularAttribute<FechaIntermedia, Pena> fkPena;
    public static volatile SingularAttribute<FechaIntermedia, Integer> idFechaIntermedia;
    public static volatile SingularAttribute<FechaIntermedia, EtapaIntermedia> fkEtapaIntermedia;
    public static volatile SingularAttribute<FechaIntermedia, String> nombreJuezControl;
    public static volatile ListAttribute<FechaIntermedia, RelacionCarpetaImputado> relacionCarpetaImputadoList;
    public static volatile SingularAttribute<FechaIntermedia, Date> fechaAudienciaLecturaSentencia;

}