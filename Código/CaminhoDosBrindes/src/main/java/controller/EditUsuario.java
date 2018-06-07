/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;
import model.Produto;
import model.SystemManager;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Nome
 */
public class EditUsuario extends HttpServlet {

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
         // String id = request.getParameter("id");
       SystemManager em = new SystemManager();
      // int i = Integer.parseInt(id);
       HttpSession session = request.getSession(); 
      PrintWriter out = response.getWriter();
    Cliente c = (Cliente) session.getAttribute("cliente"); // dai faço o que quiser e depois devolvo
    session.setAttribute("cliente",c);
       
        request.getRequestDispatcher("editarUsuario.jsp").forward(request,response);
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
         HttpSession session = request.getSession(); 
         Cliente cliente = (Cliente) session.getAttribute("cliente");
        SystemManager em = new SystemManager();
        cliente.setNome( request.getParameter("Nome_cliente"));
        cliente.setEmail(request.getParameter("Email_cliente"));
        cliente.setLogin(request.getParameter("Login_cliente"));
        cliente.setSenha(request.getParameter("Senha_cliente"));
        cliente.setSobrenomeUsuario(request.getParameter("Sobrenome_cliente"));
        cliente.setBairroUsuario(request.getParameter("Bairro_cliente"));
        cliente.setCidadeUsuario( request.getParameter("Cidade_cliente"));
        cliente.setCepUsuario(request.getParameter("Cep_cliente"));       
        cliente.setTelefoneUsuario(request.getParameter("Telefone_cliente"));
        cliente.setCelularUsuario(request.getParameter("Celular_cliente"));
        PrintWriter out = response.getWriter();
     
        try {
            cliente = em.Salvar(cliente);
            out.print("<script>alert('Seu cadastro foi atualizado, por favor, faça o login de novo');</script>");
            response.sendRedirect("inicio.jsp");
        } catch (Exception ex) {
            System.out.println("DEU ERRO"+ex);
        }
         System.out.println(cliente);
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
