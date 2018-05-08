package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cliente;
import model.Pedido;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-03T10:59:07")
@StaticMetamodel(Cartaodecredito.class)
public class Cartaodecredito_ { 

    public static volatile SingularAttribute<Cartaodecredito, Integer> numero;
    public static volatile SingularAttribute<Cartaodecredito, String> nomeTitular;
    public static volatile SingularAttribute<Cartaodecredito, Integer> codigoSeguranca;
    public static volatile CollectionAttribute<Cartaodecredito, Pedido> pedidoCollection;
    public static volatile SingularAttribute<Cartaodecredito, Integer> iDCartao;
    public static volatile SingularAttribute<Cartaodecredito, String> bandeira;
    public static volatile SingularAttribute<Cartaodecredito, Date> validade;
    public static volatile CollectionAttribute<Cartaodecredito, Cliente> clienteCollection;

}