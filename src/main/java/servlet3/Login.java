package servlet3;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Login", value = "/Login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user= request.getParameter("username");
        String pass = request.getParameter("password");

        //Si el usuario es correcto (admin -admin) redirigimos a inicio.html, en caso contrario, a error.html
        if (user.equals("admin") && pass.equals("admin")){
            response.sendRedirect("inicio.html");
        }else{
            response.sendRedirect("error.html");
        }
    }
}
