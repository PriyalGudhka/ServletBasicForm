import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.IOException;
import javax.servlet.http.HttpSession;
import java.util.*;

public class GetHeaders extends HttpServlet {

    //Using doGet() method for handling the GET requests
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE HTML>");
        out.println("<HTML>");
        out.println("<head><title>Request Headers:</title></head>");
        out.println("<body BGCOLOR=\"#D3D3D3\">");
        out.println("<h1>The request headers are as follows: </h1>");

        out.println("<TABLE BORDER=1 ALIGN=\"CENTER\">\n" +
            "<TR BGCOLOR=\"#FFAD00\">\n" +
            "<TH>Header Name<TH>Header Value");

        Enumeration headerNames = request.getHeaderNames(); //Used getHeaderNames() method

        while (headerNames.hasMoreElements()) {
            String headerName = (String) headerNames.nextElement();
            out.println("<TR><TD>" + headerName);
            out.println(" <TD>" + request.getHeader(headerName));
        }
        out.println("</TABLE>");

        out.println("</body>");
        out.println("</HTML>");
    }


}