package servlet;

import dao.StudyDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SuggestionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int studentId = Integer.parseInt(request.getParameter("id"));
        StudyDAO dao = new StudyDAO();
        int hours = dao.getTotalStudyHours(studentId);

        String suggestion;
        if (hours < 10)
            suggestion = "Increase study time. Focus on basics.";
        else
            suggestion = "Good progress. Maintain consistency.";

        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(suggestion);
    }
}

