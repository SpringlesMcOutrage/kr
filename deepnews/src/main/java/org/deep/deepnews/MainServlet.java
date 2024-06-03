package org.deep.deepnews;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class MainServlet extends HttpServlet {
    private NewsStorage newsStorage;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        newsStorage = new NewsStorage();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");


        PrintWriter out = response.getWriter();
        out.println("<html><body><a href=\"index.jsp\">Повернутися назад</a>");


        List<News> newsList = newsStorage.getAllNews();
        for (News news : newsList) {
            out.println("<h2>" + news.getTitle() + "</h2>");
            out.println("<p>Категорія: " + news.getCategory() + "</p>");
            out.println("<p>Опубліковано: " + news.getTimeSinceCreation() + "</p>");
            out.println("<p>" + news.getContent() + "</p>");
            out.println("<hr>");
        }

        out.println("</body></html>");
        out.close();
    }

}
