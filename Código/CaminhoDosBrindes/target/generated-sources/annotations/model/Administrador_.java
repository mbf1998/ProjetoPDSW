package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Produto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-07T15:23:05")
@StaticMetamodel(Administrador.class)
public class Administrador_ { 

    public static volatile SingularAttribute<Administrador, Integer> idAdministrador;
    public static volatile SingularAttribute<Administrador, String> emailAdministrador;
    public static volatile SingularAttribute<Administrador, Produto> produto;
    public static volatile SingularAttribute<Administrador, String> loginAdministrador;
    public static volatile SingularAttribute<Administrador, String> nomeAdministrador;
    public static volatile SingularAttribute<Administrador, String> senhaAdministrador;

}