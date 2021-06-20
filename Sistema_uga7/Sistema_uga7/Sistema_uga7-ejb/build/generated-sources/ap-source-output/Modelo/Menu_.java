package Modelo;

import Modelo.Menu;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-25T16:07:01")
@StaticMetamodel(Menu.class)
public class Menu_ { 

    public static volatile SingularAttribute<Menu, Menu> codigoSubmenu;
    public static volatile SingularAttribute<Menu, Short> codigo;
    public static volatile SingularAttribute<Menu, String> tipo;
    public static volatile SingularAttribute<Menu, Boolean> estado;
    public static volatile ListAttribute<Menu, Menu> menuList;
    public static volatile SingularAttribute<Menu, String> tipoUsuario;
    public static volatile SingularAttribute<Menu, String> nombre;
    public static volatile SingularAttribute<Menu, String> url;

}