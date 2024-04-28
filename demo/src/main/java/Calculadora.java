import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="DemoServelt", urlPatterns = {"/"}) 
public class Calculadora extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
  
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<form method='post'>");
            out.println("¿Qué operación quiere realizar? ");
            out.println("<br> <br>");

            out.println("<select name='operacion'>");
                out.println("<option value='suma'>Suma</option>");
                out.println("<option value='resta'>Resta</option>");
                out.println("<option value='multiplicacion'>Multiplicacion</option>");
                out.println("<option value='division'>Division</option>");
            out.println("</select><br><br>");
                
            out.println("Numero 1: <br>");
            out.println("<input type='text' name='N1'/> <br><br>");
            out.println("Numero 2: <br>");
            out.println("<input type='text' name='N2'/> <br><br>");

            out.println("<input type='submit' value='Resultado'/><br>");
            
        out.println("</form>");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
        String operacion = request.getParameter("operacion");
        int Num1 = Integer.parseInt(request.getParameter("N1"));
        int Num2 = Integer.parseInt(request.getParameter("N2")); 
        int R = 0;
        String mensaje = "";

        switch (operacion) {
            case "suma":
                R = Num1 + Num2;
                mensaje = "La suma es = " + R;
            break;
            case "resta":
                R = Num1 - Num2;
                mensaje = "La resta es = " + R;
            break;
            case "multiplicacion":
                R = Num1 * Num2;
                mensaje = "La multiplicacion es = " + R;
            break;
            case "division":
                if(Num2 != 0){
                    R = Num1 / Num2;
                    mensaje = "La division es = " + R;
                } else {
                    mensaje = "No se puede dividir por cero.";
                }
            break;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();  

        out.println("<html>");                    
            out.println("<body>");
             out.println("<p>" + mensaje + "</p>");
            out.println("</body>");
        out.println("</html>");
    }      
}