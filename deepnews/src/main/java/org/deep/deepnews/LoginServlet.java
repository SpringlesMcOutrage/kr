package org.deep.deepnews;


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("root".equals(username) && "root".equals(password)) {
            response.sendRedirect("admin.jsp");
        } else {
            PrintWriter out = response.getWriter();
            out.println("<html><body><h2>Помилка: Невірний логін або пароль <a href=\"login.jsp\">Повернутися назад</a></h2></body></html>");
        }
    }
}