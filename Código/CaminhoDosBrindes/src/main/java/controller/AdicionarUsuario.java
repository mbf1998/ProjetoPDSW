/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cliente;
import model.SystemManager;

/**
 *
 * @author Usuario
 */
public class AdicionarUsuario extends HttpServlet {
    private int status;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        System.out.println("CHAMEI O SERVLET");
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
             out.print("<script>");
            out.print("alert ('Bem Vindo Usuário !')");
            out.print("</script>");
            response.sendRedirect("telaUS");
        } catch (Exception ex) {
            System.out.println("DEU ERRO"+ex);
        }
         System.out.println(cliente);
         
          
       
        //cliente.setEndereco(endereco);
        
        System.out.println("controller.AdicionarUsuario.doPost()");
        
       
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
