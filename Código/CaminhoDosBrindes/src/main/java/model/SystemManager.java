
package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
public class SystemManager {

    public EntityManager getEM(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("caminho");
return factory.createEntityManager();}
    
    public Cliente Salvar(Cliente cliente) throws Exception{
        EntityManager em = getEM();
       try{
        em.getTransaction().begin();
        if(cliente.getUserID()==null){
        em.persist(cliente);}  //Insert
        else{
            if(!em.contains(cliente)){
            if(em.find(Cliente.class, cliente.getUserID())==null){
            throw new Exception  ("Erro ao atualizar") ;  
            }
            }
        cliente = em.merge(cliente);} //Update
        em.getTransaction().commit();}
    finally{
           em.close();
       }
    return cliente;
}
    public void deletarProduto(int id){
    EntityManager em = getEM();
    Produto produto = em.find(Produto.class, id);
    try{
    em.getTransaction().begin();
    em.remove(produto); // remove
    em.getTransaction().commit();}
    finally{
        em.close();
    }
}
     public void deletarCliente(int id){
    EntityManager em = getEM();
    Cliente cliente = em.find(Cliente.class, id);
    try{
    em.getTransaction().begin();
    em.remove(cliente); // remove
    em.getTransaction().commit();}
    finally{
        em.close();
    }
}
    public Cliente ConsultarPorID(int id){
    EntityManager em = getEM();
  Cliente cliente =null;
    try{
    em.getTransaction().begin();
     cliente = em.find(Cliente.class, id);
    em.getTransaction().commit();}
    finally{
        em.close();
    }
    return cliente;
}
    public Produto SalvarProd (Produto prod)throws Exception{
         EntityManager em = getEM();
       try{
        em.getTransaction().begin();
        if(prod.getIDProduto()==null){
        em.persist(prod);}  //Insert
        else{
            if(!em.contains(prod)){
            if(em.find(Cliente.class, prod.getIDProduto())==null){
            throw new Exception  ("Erro ao atualizar") ;  
            }
            }
        prod = em.merge(prod);} //Update
        em.getTransaction().commit();}
    finally{
           em.close();
       }
    return prod;
        
    }
   
   public void deletarProd(String nome){
    EntityManager em = getEM();
  
    
  
   
        em.createNamedQuery("deleteByName", Produto.class)
        .setParameter(1, nome)
        .executeUpdate();
         
        //Execute the delete query
        em.flush();
         
        //update entity manager with changes
     
         
       
   
}
public List<Produto> findAll() throws Exception{
    EntityManager em = getEM();
     List<Produto> listProd;
    try{
        em.getTransaction().begin();
          listProd = em.createNativeQuery("SELECT * FROM tb_produto",Produto.class).getResultList();
           
          if(listProd==null){
              throw new Exception  ("Erro ao atualizar") ;  
          }
       em.getTransaction().commit();
    }
    finally{
        em.close();
    }
            
            return listProd;    
}
public List<Cliente> findAllCliente() throws Exception{
    EntityManager em = getEM();
     List<Cliente> listClie;
    try{
        em.getTransaction().begin();
          listClie = em.createNativeQuery("SELECT * FROM tb_cliente",Cliente.class).getResultList();
           
          if(listClie==null){
              throw new Exception  ("Erro ao atualizar") ;  
          }
       em.getTransaction().commit();
    }
    finally{
        em.close();
    }
            
            return listClie;    
}
public Produto editar (int i){
    EntityManager em = getEM();
  Produto cliente =null;
    try{
    em.getTransaction().begin();
     cliente = em.find(Produto.class, i);
    em.getTransaction().commit();}
    finally{
        em.close();
    }
    return cliente;
}
public Cliente edita (int i){
    EntityManager em = getEM();
 Cliente cliente =null;
    try{
    em.getTransaction().begin();
     cliente = em.find(Cliente.class, i);
    em.getTransaction().commit();}
    finally{
        em.close();
    }
    return cliente;
}
public Produto AtualizarProd (Produto prod)throws Exception{
         EntityManager em = getEM();
       try{
        em.getTransaction().begin();
       
       
            
        prod = em.merge(prod); //Update
        em.getTransaction().commit();}
    finally{
           em.close();
       
    
        
    }
return prod;}
public Cliente AtualizarClie (Cliente Cli)throws Exception{
         EntityManager em = getEM();
       try{
        em.getTransaction().begin();
       
       
            
        Cli = em.merge(Cli); //Update
        em.getTransaction().commit();}
    finally{
           em.close();
       
    
        
    }
return Cli;}


}

