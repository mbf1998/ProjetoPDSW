package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cartaodecredito;
import model.Cliente;
import model.Produto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-03T10:59:07")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Integer> quantidadePedido;
    public static volatile SingularAttribute<Pedido, String> arquivopedido;
    public static volatile SingularAttribute<Pedido, Cartaodecredito> cartãoid;
    public static volatile SingularAttribute<Pedido, Produto> produto;
    public static volatile SingularAttribute<Pedido, Integer> iDPedido;
    public static volatile SingularAttribute<Pedido, String> mensagem;
    public static volatile SingularAttribute<Pedido, String> cor;
    public static volatile SingularAttribute<Pedido, Cliente> idUsu;
    public static volatile SingularAttribute<Pedido, String> statusPedido;

}