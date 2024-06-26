package org.deep.deepnews;


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class SearchServlet extends HttpServlet {

    private NewsStorage newsStorage;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        newsStorage = new NewsStorage();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        String keywords = request.getParameter("keywords");
        String category = request.getParameter("category");

        List<News> searchResults = newsStorage.searchNews(keywords, category);

        out.println("<html><head><title>Результат пошуку</title></head><body>");
        out.println("<h2>Результат пошуку</h2>");
        out.println("<a href=\"index.jsp\">Повернутися назад</a>");

        if (searchResults.isEmpty()) {
            out.println("<p>Результатів не знайдено</p>");
        } else {
            for (News news : searchResults) {
                out.println("<h3>" + news.getTitle() + "</h3>");
                out.println("<p>Категорія: " + news.getCategory() + "</p>");
                out.println("<p>Опубліковано: " + news.getTimeSinceCreation() + "</p>");
                out.println("<p>" + news.getContent() + "</p>");
                out.println("<hr>");
            }
        }

        out.println("</body></html>");
        out.close();
    }
}
