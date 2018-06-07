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
import javax.servlet.http.HttpSession;
import model.Administrador;
import model.Cliente;
import model.SystemManager;

/**
 *
 * @author Nome
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        HttpSession session = request.getSession(); 
        

         PrintWriter out = response.getWriter();
        System.out.println("CHAMEI O SERVLET");
        Cliente cliente = new Cliente();
        Administrador adm = new Administrador();
        SystemManager em = new SystemManager();
        
        String login = request.getParameter("Login_cliente");
        String senha = request.getParameter("Senha_cliente");
         try {
            cliente = em.Login(login, senha);
            if(cliente==null){
                adm = em.LoginADM(login, senha);
                session.setAttribute("adm_nome",adm.getNomeAdministrador()); 
                session.setAttribute("adm_id",adm.getIdAdministrador()); 
                response.sendRedirect("telaADM.jsp");
                if(adm==null){
                out.print("ERROR");
                out.close();}
            }
            session.setAttribute("cliente",cliente);
             session.setAttribute("nome",cliente.getNome());
          System.out.println(cliente);
            response.sendRedirect("telaUS.jsp");
        } catch (Exception ex) {
            System.out.println("DEU ERRO"+ex);
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
