package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cartaodecredito;
import model.Pedido;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-13T09:15:23")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> telefoneUsuario;
    public static volatile SingularAttribute<Cliente, String> nome;
    public static volatile SingularAttribute<Cliente, String> bairroUsuario;
    public static volatile SingularAttribute<Cliente, String> login;
    public static volatile SingularAttribute<Cliente, Integer> userID;
    public static volatile SingularAttribute<Cliente, String> senha;
    public static volatile SingularAttribute<Cliente, Cartaodecredito> cartao;
    public static volatile SingularAttribute<Cliente, String> cepUsuario;
    public static volatile SingularAttribute<Cliente, String> celularUsuario;
    public static volatile SingularAttribute<Cliente, String> sobrenomeUsuario;
    public static volatile SingularAttribute<Cliente, String> cidadeUsuario;
    public static volatile CollectionAttribute<Cliente, Pedido> pedidoCollection;
    public static volatile SingularAttribute<Cliente, String> email;

}