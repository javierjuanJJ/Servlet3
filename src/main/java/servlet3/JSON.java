package servlet3;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "JSON", value = "/JSON")
public class JSON extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();

        out.println("{\"employees\":[\n"
                + "    {\"firstName\":\"John\", \"lastName\":\"Doe\"},\n"
                + "    {\"firstName\":\"Anna\", \"lastName\":\"Smith\"},\n"
                + "    {\"firstName\":\"Peter\", \"lastName\":\"Jones\"}\n"
                + "]}");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
