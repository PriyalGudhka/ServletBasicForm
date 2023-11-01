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

public class Form extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        //Using getParameter('name') method for retrieveing the values of all the parameters in the form

        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        String pictureName = request.getParameter("picture");
        String gender = request.getParameter("gender");
        String country = request.getParameter("country");
        String hobby[] = request.getParameterValues("hobby");
        String address = request.getParameter("address");

        out.println("<html>");
        out.println("<head><title>Form Parameters</title></head>");
        out.println("<body BGCOLOR=\"#D3D3D3\">");

        out.println("<h1>Form Parameters using getParameter() method</h1>");

        out.println("<TABLE BORDER=1 ALIGN=\"CENTER\">\n" +
            "<TR BGCOLOR=\"#FFAD00\">\n" +
            "<TH>Parameter Name<TH>Parameter Value");

        out.println("<TR><TD><b>Email</b>");
        out.println(" <TD>" + email);

        out.println("<TR><TD><b>Password</b>");
        out.println(" <TD>" + password);

        out.println("<TR><TD><b>Confirm Password</b>");
        out.println(" <TD>" + confirmPassword);

        out.println("<TR><TD><b>File Name</b>");
        out.println(" <TD>" + pictureName);

        out.println("<TR><TD><b>Gender</b>");
        out.println(" <TD>" + gender);

        out.println("<TR><TD><b>Country</b>");
        out.println(" <TD>" + country);

        out.println("<TR><TD><b>Hobby</b>");
        out.println(" <TD>");
        out.println("<ul>");
        for (String hobbyName: hobby) {
            out.println("<li>" + hobbyName + "</li>");
        }
        out.println("</ul>");

        out.println("<TR><TD><b>Address</b>");
        out.println(" <TD>" + address);

        out.println("</TABLE>");
        out.println("<br>");

        out.println("=============================================================================================================================================");

        out.println("<h1>Form Parameters using getParameterNames() method</h1>");

        out.println("<TABLE BORDER=1 ALIGN=\"CENTER\">\n" +
            "<TR BGCOLOR=\"#FFAD00\">\n" +
            "<TH>Parameter Name<TH>Parameter Value");

        //Using getParameterNames() method for retrieveing the values of all the parameters in the form

        Enumeration enumber = request.getParameterNames();

        while (enumber.hasMoreElements()) {
            Object obj = enumber.nextElement();
            String parameterName = (String) obj;
            String parameterValue = request.getParameter(parameterName);

            if (parameterName.equals("hobby")) {
                String[] values = request.getParameterValues(parameterName);
                out.println("<TR><TD><b>" + parameterName + "</b>");
                out.println(" <TD>");
                out.println("<ul>");
                for (int i = 0; i < values.length; i++) {
                    out.println("<li>" + values[i] + "</li>");
                }
                out.println("</ul>");

            } else {
                out.println("<TR><TD><b>" + parameterName + "</b>");
                out.println(" <TD>" + parameterValue);
            }
        }
        out.println("</TABLE>");
        out.println("<br>");

        out.println("=============================================================================================================================================");

        out.println("<h1>Form Parameters using getParameterMap() method</h1>");

        //Using getParameterMap() method for retrieveing the values of all the parameters in the form

        Map < String, String[] > map = request.getParameterMap();

        Set set = map.entrySet();
        Iterator it = set.iterator();

        out.println("<TABLE BORDER=1 ALIGN=\"CENTER\">\n" +
            "<TR BGCOLOR=\"#FFAD00\">\n" +
            "<TH>Parameter Name<TH>Parameter Value");

        while (it.hasNext()) {
            Map.Entry < String, String[] > entry =
                (Entry < String, String[] > ) it.next();
            String paramName = entry.getKey();
            String[] paramValues = entry.getValue();

            out.println("<TR><TD><b>" + paramName + "</b>");
            if (paramValues.length == 1) {
                String paramValue = paramValues[0];
                if (paramValue.length() == 0)
                    out.println("<b>No Value</b>");
                else {
                    out.println(" <TD>" + paramValue);
                    out.println("<br>");

                }
            } else {
                out.println(" <TD>");
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