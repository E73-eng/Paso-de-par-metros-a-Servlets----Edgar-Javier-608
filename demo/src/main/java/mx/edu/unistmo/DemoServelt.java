package mx.edu.unistmo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name="DemoServelt", urlPatterns = {"/"}) //Desde donde podemos acceder de este servelt    "/"-- desde el directo..Raiz
public class DemoServelt extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{

        String nombre =request.getParameter("nombre");
        String apellido =request.getParameter("apellido");

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>Hello " + nombre +" "+apellido+"</h1>");
        out.println("<h2>Informática</h2>");
        out.println("</body></html>");
    }

}
