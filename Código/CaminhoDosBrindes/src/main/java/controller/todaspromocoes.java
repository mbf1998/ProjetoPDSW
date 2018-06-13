/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
public class todaspromocoes extends HttpServlet {

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
            List<Promocao> lista02;
            
            int i=0;
            
        try {
            lista=em.ProcurarProdList();
            lista02=em.findAllPromocao();
            System.out.println(lista02);
            for(i=0;i<lista.size();i++){
                float precoInicial = lista.get(i).getPreco();
                float precoFinal = lista02.get(i).getDescontoPreco();
                precoInicial = precoInicial - precoFinal;
                lista.get(i).setPreco(precoInicial);
            }
           
            request.setAttribute("lista", lista);
            request.getRequestDispatcher("TodasPromocoes.jsp").forward(request,response);
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
