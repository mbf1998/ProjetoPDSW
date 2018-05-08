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
       int i = 1;
       Cliente p = new Cliente();
       p=em.edita(i);
       request.setAttribute("cliente", p);
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
         Cliente cliente = new Cliente();
        SystemManager em = new SystemManager();
        String nome = request.getParameter("Nome_cliente");
        String email = request.getParameter("Email_cliente");
        String login = request.getParameter("Login_cliente");
        String senha = request.getParameter("Senha_cliente");
        String sobrenome = request.getParameter("Sobrenome_cliente");
        String bairro = request.getParameter("Bairro_cliente");
        String cidade = request.getParameter("Cidade_cliente");
        String c = request.getParameter("Cep_cliente");       
        String telefone = request.getParameter("Telefone_cliente");
        String celular = request.getParameter("Celular_cliente");
         String id = request.getParameter("id");
        int i = Integer.parseInt(id);
        cliente.setUserID(i);
        cliente.setBairroUsuario(bairro);
        cliente.setCelularUsuario(celular);
        cliente.setCepUsuario(c);
        cliente.setEmail(email);
        cliente.setLogin(login);
        cliente.setNome(nome);
        cliente.setSobrenomeUsuario(sobrenome);
        cliente.setTelefoneUsuario(telefone);
        cliente.setSenha(senha);
        cliente.setCidadeUsuario(cidade);
        try {
            cliente = em.Salvar(cliente);
            
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
