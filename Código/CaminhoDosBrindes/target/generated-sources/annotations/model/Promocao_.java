package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Produto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-07T15:23:06")
@StaticMetamodel(Promocao.class)
public class Promocao_ { 

    public static volatile SingularAttribute<Promocao, Integer> iDPromocao;
    public static volatile SingularAttribute<Promocao, Date> dataFim;
    public static volatile SingularAttribute<Promocao, Float> descontoPreco;
    public static volatile CollectionAttribute<Promocao, Produto> produtoCollection;
    public static volatile SingularAttribute<Promocao, Date> dataInicio;

}