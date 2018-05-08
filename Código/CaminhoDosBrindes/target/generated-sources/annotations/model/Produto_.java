package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Administrador;
import model.Pedido;
import model.Promocao;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-03T10:59:07")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, Float> tamanhoLargura;
    public static volatile SingularAttribute<Produto, String> tipo;
    public static volatile SingularAttribute<Produto, Administrador> administrador;
    public static volatile SingularAttribute<Produto, Float> tamanhoAltura;
    public static volatile SingularAttribute<Produto, Integer> IDProduto;
    public static volatile SingularAttribute<Produto, String> cor;
    public static volatile SingularAttribute<Produto, String> image02;
    public static volatile SingularAttribute<Produto, String> image01;
    public static volatile SingularAttribute<Produto, Promocao> produtoPromocao;
    public static volatile SingularAttribute<Produto, String> nome;
    public static volatile SingularAttribute<Produto, String> image04;
    public static volatile SingularAttribute<Produto, String> image03;
    public static volatile SingularAttribute<Produto, String> descricao;
    public static volatile SingularAttribute<Produto, Float> preco;
    public static volatile SingularAttribute<Produto, String> image05;
    public static volatile SingularAttribute<Produto, Pedido> pedido;
    public static volatile SingularAttribute<Produto, Integer> quantidade;

}