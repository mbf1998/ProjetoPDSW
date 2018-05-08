/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Base64;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Produto;
import model.SystemManager;

/**
 *
 * @author Nome
 */
public class EditProduto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
  
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
      @Override
      protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String id = request.getParameter("id");
       SystemManager em = new SystemManager();
       int i = Integer.parseInt(id);
       Produto p = new Produto();
       p=em.editar(i);
       request.setAttribute("produto", p);
        request.getRequestDispatcher("editarProduto.jsp").forward(request,response);
      
      
      }
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        SystemManager em = new SystemManager();
        
       
        Produto produto = new Produto();
        String nome = request.getParameter("Nome_produto");
        String altura = request.getParameter("Altura_produto");
        String largura = request.getParameter("Largura_produto");
        String quantidade = request.getParameter("Quantidade_produto");
        int q = Integer.parseInt(quantidade);
         String id = request.getParameter("idUs");
        System.out.println(id);
        int i = Integer.parseInt(id);
        String image1 = request.getParameter("image1");
        String image2 = request.getParameter("image2");
        String image3 = request.getParameter("image3");
        String image4 = request.getParameter("i4");
        String image5 = request.getParameter("image5");
        
        String cor = request.getParameter("cor");
        String descricao = request.getParameter("descricao_produto");
        String tipo = request.getParameter("tipo_produto");
       
        String preco = request.getParameter("preco_produto");
        
        if(image1!=null && image2!=null){
        
       byte[] i1 = image1.getBytes();
        String image01=Base64.getEncoder().encodeToString(i1);
        String imagem01 = "data:image/jpeg;base64,"+image01;
        
        
        byte[] i2 =image2.getBytes();
        String image02=Base64.getEncoder().encodeToString(i2);
        String imagem02 =  "data:image/jpeg;base64,"+image02;
        produto.setImage01(imagem01);
            produto.setImage02(imagem02);}
        
        if(image3!=null && image4!=null && image5!=null){
        byte[] i3 =image3.getBytes();
        String image03=Base64.getEncoder().encodeToString(i3);
         String imagem03 =  "data:image/jpeg;base64,"+image03;
        produto.setImage03(imagem03);
       
        byte[] i4 =image4.getBytes();
        String im04=Base64.getEncoder().encodeToString(i4);
         String imagem04 =  "data:image/jpeg;base64,"+im04;
        produto.setImage04(imagem04);
        byte[] i5 =image5.getBytes();
        String image05=Base64.getEncoder().encodeToString(i5);
         String imagem05 =  "data:image/jpeg;base64,"+image05;
         produto.setImage05(imagem05);}
         if (nome != null) {
             produto.setIDProduto(i);
            produto.setNome(nome);
            produto.setTipo(tipo);
            produto.setQuantidade(q);
        } else {
        }
        if (altura != null) {
            float alt = Float.parseFloat(altura);
            produto.setTamanhoAltura(alt);
        } else {
        }
        if (largura != null) {
            float larg = Float.parseFloat(largura);
            produto.setTamanhoLargura(larg);
        } else {
        }
        if (descricao != null) {
            produto.setDescricao(descricao);
            produto.setCor(cor);
        } else {
        }
     produto.setCor(cor);
        if (preco != null) {
            float prec = Float.parseFloat(preco);
            produto.setPreco(prec);
        } else {
        }
        
            
           
        
      
        try {
           
            em.AtualizarProd(produto);
         
            response.sendRedirect("ListarProdutos");
        } catch (Exception ex) {
            System.out.println("Erro"+ex);
        }
    }

    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
