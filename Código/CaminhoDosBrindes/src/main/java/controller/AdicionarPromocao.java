/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Produto;
import model.Promocao;
import model.SystemManager;

/**
 *
 * @author Nome
 */
public class AdicionarPromocao extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        SystemManager em = new SystemManager();
      
            List<Produto> lista ;
        try {
            lista=em.findAll();
            System.out.println(lista.get(0).getTipo());
            request.setAttribute("lista", lista);
            request.getRequestDispatcher("cadastroPromocao.jsp").forward(request,response);
        } catch (Exception ex) {
            System.out.println("ERROR          "+ex);
        }
            
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       SystemManager em = new SystemManager();
       Promocao pro = new Promocao();
       List<Produto> produtos;
       Produto p = new Produto();
       String idProduto = request.getParameter("produtos");
       int i = Integer.parseInt(idProduto);
       
       System.out.println(i);
        try {
            
            produtos = em.ProcurarProd(i);
        
            pro.setProdutoCollection(produtos);
            
         
        } catch (Exception ex) {
            System.out.println(ex);
        }
       String dataInicio = request.getParameter("inicio");
        String dataFim = request.getParameter("fim");
        
        
     
            pro.setDataInicio(dataInicio);
            pro.setDataFim(dataFim);
           
      
        String preco = request.getParameter("preco");
         float prec = Float.parseFloat(preco);
         pro.setDescontoPreco(prec);
        try {
            em.SalvarPromocao(pro);
            p = em.ProcurarProdComPromocao(i);
            p.setProdutoPromocao(pro);
            em.AtualizarProd(p);
            response.sendRedirect("telaADM");
        } catch (Exception ex) {
           System.out.println(ex);
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
