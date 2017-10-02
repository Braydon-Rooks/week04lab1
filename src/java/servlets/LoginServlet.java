/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import userService.UserService;

/**
 *
 * @author 671978
 */
public class LoginServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        UserService userServ = new UserService();
        String user=request.getParameter("user");
        String pass = request.getParameter("pass");
        String remember = request.getParameter("remember");
        
        if(user==null||user.isEmpty()||pass==null||pass.isEmpty())
        {
            request.setAttribute("notFull", "Please Fill Both Fields");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
        if(userServ.login(user,pass) != null)
        {
            HttpSession session = request.getSession();
            session.setAttribute("loggedInUser",userServ.login(user,pass));
            
            if("BUTTON CHECKED")
            {
                Cookie cookie= new Cookie("cookie",user);
                cookie.setMaxAge(60*60*24);
                cookie.setPath("/");
                response.addCookie(cookie);
            
            }
            
            
        }
        
        if( remember == null);
        {
            request.setAttribute("check","not checked");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
        request.setAttribute("check", "checked");
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        
      
    }


}
