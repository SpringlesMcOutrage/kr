package deep;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AddNewsServlet extends HttpServlet {

    private NewsStorage newsStorage;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        newsStorage = new NewsStorage();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String title = request.getParameter("title");
        String category = request.getParameter("category");
        String content = request.getParameter("content");

        newsStorage.addNews(title, content, category);

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Новина додана!</title></head><body>");
        out.println("<h2>Новина додана успішно!</h2>");
        out.println("<a href='admin.jsp'>Добавити ще одну?</a>");
        out.println("<a href='index.jsp'>Повернутися назад</a>");
        out.println("</body></html>");
        out.close();
    }
}
