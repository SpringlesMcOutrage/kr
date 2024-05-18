package deep;

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
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        String keywords = request.getParameter("keywords");
        String category = request.getParameter("category");

        List<News> searchResults;
        if (category != null && !category.isEmpty()) {
            searchResults = newsStorage.searchByCategory(category);
        } else {
            searchResults = newsStorage.searchNews(keywords);
        }

        out.println("<html><head><title>Результати пошуку</title></head><body>");
        out.println("<h2>Результати пошуку</h2>");

        if (searchResults.isEmpty()) {
            out.println("<p>Не знайдено новин за вашими критеріями</p>");
        } else {
            for (News news : searchResults) {
                out.println("<h3>" + news.getTitle() + "</h3>");
                out.println("<p>Категорія: " + news.getCategory() + "</p>");
                out.println("<p>" + news.getContent() + "</p>");
                out.println("<hr>");
            }
        }
        out.println("<a href='index.jsp'>Повернутися назад</a>");
        out.println("</body></html>");
        out.close();
    }
}
