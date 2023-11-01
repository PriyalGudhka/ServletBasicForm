import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.IOException;
import javax.servlet.http.HttpSession;
import java.util.*;
import java.util.Map.Entry;

public class TutionWaiverForm extends HttpServlet {

    //Useing doGet() method for handling GET method
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Form Parameters</title></head>");
        out.println("<body BGCOLOR=\"#D3D3D3\">");


        Map < String, String[] > map = request.getParameterMap();

        Set set = map.entrySet();
        Iterator it = set.iterator();

        out.println("<TABLE BORDER=1 ALIGN=\"CENTER\">\n" +
            "<TR BGCOLOR=\"#FFAD00\">\n" +
            "<TH>Parameter Name<TH>Parameter Value");

        //Using while loop for iterating through all the elements

        while (it.hasNext()) {
            Map.Entry < String, String[] > entry =
                (Entry < String, String[] > ) it.next();
            String paramName = entry.getKey();
            out.print("<tr><td><b>" + paramName + "</td><td></b>");
            String[] paramValues = entry.getValue();
            if (paramValues.length == 1) {
                String paramValue = paramValues[0];
                if (paramValue.length() == 0)
                    out.println("<b>No Value</b>");
                else {
                    out.println(paramValue);
                    out.println("<br>");
                    out.println("<br>");

                }
            } else {
                out.println("<ul>");
                for (int i = 0; i < paramValues.length; i++) {
                    out.println("<li>" + paramValues[i] + "</li>");
                }
                out.println("</ul>");
            }
        }

        out.println("</body");
        out.println("</html");
    }

}