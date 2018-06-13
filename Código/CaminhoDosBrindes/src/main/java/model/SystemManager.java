
package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import javax.persistence.NoResultException;
public class SystemManager {

    public EntityManager getEM(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("caminho");
return factory.createEntityManager();}
    
    
    //INSERT
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
    public Promocao SalvarPromocao(Promocao promocao) throws Exception{
        EntityManager em = getEM();
       try{
        em.getTransaction().begin();
        if(promocao.getIDPromocao()==null){
        em.persist(promocao);}  //Insert
        else{
            if(!em.contains(promocao)){
            if(em.find(Promocao.class, promocao.getIDPromocao())==null){
            throw new Exception  ("Erro ao atualizar") ;  
            }
            }
        promocao = em.merge(promocao);} //Update
        em.getTransaction().commit();}
    finally{
           em.close();
       }
    return promocao;
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
    
    //DELETE
    
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
      public void deletarpromocao(int id){
    EntityManager em = getEM();
    Promocao cliente = em.find(Promocao.class, id);
    try{
    em.getTransaction().begin();
    em.remove(cliente); // remove
    em.getTransaction().commit();}
    finally{
        em.close();
    }
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
     //CONSULTAR/FIND
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
public List<Promocao> findAllPromocao() throws Exception{
    EntityManager em = getEM();
     List<Promocao> listClie;
    try{
        em.getTransaction().begin();
          listClie = em.createNativeQuery("SELECT * FROM tb_promocao",Promocao.class).getResultList();
           
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

public List<Produto> ProcurarProd(int id) throws Exception {
   EntityManager em = getEM();
   try{
       List<Produto> adm =  em.createQuery(
                               "SELECT c FROM Produto c where c.IDProduto = :Login", Produto.class)
                   .setParameter("Login", id).getResultList();
                   
  if(adm==null){
              throw new Exception  ("Erro ao procurar") ;  
              
          }
        return adm;
        
  } catch (NoResultException e) {
        return null;
  }
    finally{
        em.close();
    }
   
}
public List<Produto> ProcurarProdList() throws Exception {
   EntityManager em = getEM();
   try{
       List<Produto> adm =  em.createQuery(
                               "SELECT c FROM Produto c where c.produtoPromocao IS NOT NULL", Produto.class)
                 .getResultList();
                   
  if(adm==null){
              throw new Exception  ("Erro ao procurar") ;  
              
          }
        return adm;
        
  } catch (NoResultException e) {
        return null;
  }
    finally{
        em.close();
    }
   
}
public Produto ProcurarProdComPromocao(int id) throws Exception {
   EntityManager em = getEM();
   try{
      Produto adm =  em.createQuery(
                               "SELECT c FROM Produto c where c.produtoPromocao = :Login", Produto.class)
                   .setParameter("Login", id).getSingleResult();
                   
  if(adm==null){
              throw new Exception  ("Erro ao procurar") ;  
              
          }
        return adm;
        
  } catch (NoResultException e) {
        return null;
  }
    finally{
        em.close();
    }
   
}

public Promocao ProcurarPromocaoPelaData(String id, String f) throws Exception {
   EntityManager em = getEM();
   try{
      Promocao adm =  em.createQuery(
                               "SELECT c FROM Promocao c where c.dataInicio = :Login and c.dataFim = :Senha", Promocao.class)
                   .setParameter("Login", id).setParameter("Senha", f).getSingleResult();
                   
  if(adm==null){
              throw new Exception  ("Erro ao procurar") ;  
              
          }
        return adm;
        
  } catch (NoResultException e) {
        return null;
  }
    finally{
        em.close();
    }
   
}
//LOGIN // AUTENTICAÇÃO

public Cliente Login(String login, String senha) throws Exception {
    EntityManager em = getEM();
    try {
       
        Cliente cli =em
                   .createQuery(
                               "SELECT c FROM Cliente c where c.login = :Login and c.senha = :Senha ", Cliente.class)
                   .setParameter("Login", login)
                   .setParameter("Senha", senha).getSingleResult();
  if(cli==null){
              throw new Exception  ("Erro ao procurar") ;  
              
          }
        return cli;
        
  } catch (NoResultException e) {
        return null;
  }
    finally{
        em.close();
    }
}
public Administrador LoginADM(String login, String senha) throws Exception {
   EntityManager em = getEM();
   try{
       Administrador adm =  em.createQuery(
                               "SELECT c FROM Administrador c where c.loginAdministrador = :Login and c.senhaAdministrador = :Senha ", Administrador.class)
                   .setParameter("Login", login)
                   .setParameter("Senha", senha).getSingleResult();
  if(adm==null){
              throw new Exception  ("Erro ao procurar") ;  
              
          }
        return adm;
        
  } catch (NoResultException e) {
        return null;
  }
    finally{
        em.close();
    }
   
}



// EDITAR

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
public Promocao editarPro (int i){
    EntityManager em = getEM();
  Promocao cliente =null;
    try{
    em.getTransaction().begin();
     cliente = em.find(Promocao.class, i);
    em.getTransaction().commit();}
    finally{
        em.close();
    }
    return cliente;
}


public Cliente edita (String Nome,String login){
    EntityManager em = getEM();
 Cliente cliente =null;
    try{
    Cliente adm =  em.createQuery(
                               "SELECT c FROM Cliente c where c.email = :Login and c.nome = :Senha ", Cliente.class)
                   .setParameter("Login", login)
                   .setParameter("Senha", Nome).getSingleResult();
 
        return adm;
        
  } catch (NoResultException e) {
        return null;
  }
    finally{
        em.close();
    }
}


//UPDATE SYSTEM





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
public Promocao AtualizarProm (Promocao prod)throws Exception{
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

