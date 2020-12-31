import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateDiscountServlet" , urlPatterns = "/display-discount" )
public class CalculateDiscountServlet  extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String descriptionProduct=req.getParameter("Product_Description") ;
        double listPrice=Double.parseDouble(req.getParameter("List_Price"));
        double discountPercent=Double.parseDouble(req.getParameter("Discount_Percent"));


        double discountAmount=listPrice * discountPercent * 0.01;
        double discountPrice=listPrice-discountAmount;
        PrintWriter writer= resp.getWriter();
        writer.println("<html>");
        writer.println("<h1> Product Description: "+descriptionProduct+"</h1>");
        writer.println("<h1> List Price         : "+listPrice+"</h1>");
        writer.println("<h1> Discount Percent   : "+discountPercent+"</h1>");
        writer.println("<h1> Discount Amount    : "+discountAmount+"</h1>");
        writer.println("<h1> Discount Price     : "+discountPrice+"</h1>");
        writer.println("</html>");
    }
}
