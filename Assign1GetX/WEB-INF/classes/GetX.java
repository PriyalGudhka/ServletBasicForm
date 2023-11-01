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

public class GetX extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>GetX</title></head>");
        out.println("<body BGCOLOR=\"#D3D3D3\">");

        out.println("<h1>getX() methods from the HttpServletRequest class</h1>");

        out.println("<TABLE BORDER=1 ALIGN=\"CENTER\">\n" +
            "<TR BGCOLOR=\"#FFAD00\">\n" +
            "<TH>Parameter Method<TH>Parameter Value");

        out.println("<TR><TD><b>getAuthType</b>");
        out.println(" <TD>" + request.getAuthType());

        out.println("<TR><TD><b>getContextPath</b>");
        out.println(" <TD>" + request.getContextPath());

        out.println("<TR><TD><b>getCookies</b>");
        out.println(" <TD>" + request.getCookies());

        out.println("<TR><TD><b>getMethod</b>");
        out.println(" <TD>" + request.getMethod());

        out.println("<TR><TD><b>getPathInfo</b>");
        out.println(" <TD>" + request.getPathInfo());

        out.println("<TR><TD><b>getPathTranslated</b>");
        out.println(" <TD>" + request.getPathTranslated());

        out.println("<TR><TD><b>getQueryString</b>");
        out.println(" <TD>" + request.getQueryString());

        out.println("<TR><TD><b>getRemoteUser</b>");
        out.println(" <TD>" + request.getRemoteUser());

        out.println("<TR><TD><b>getRequestedSessionId</b>");
        out.println(" <TD>" + request.getRequestedSessionId());

        out.println("<TR><TD><b>getRequestURI</b>");
        out.println(" <TD>" + request.getRequestURI());

        out.println("<TR><TD><b>getRequestURL</b>");
        out.println(" <TD>" + request.getRequestURL());

        out.println("<TR><TD><b>getServletPath</b>");
        out.println(" <TD>" + request.getServletPath());

        out.println("<TR><TD><b>getSession</b>");
        out.println(" <TD>" + request.getSession());

        out.println("<TR><TD><b>getHttpServletMapping</b>");
        out.println(" <TD>" + request.getHttpServletMapping());

        out.println("</TABLE>");

        out.println("=============================================================================================================================================");

        out.println("<h1>getX() methods from the super interface ServletRequest: </h1>");

        out.println("<TABLE BORDER=1 ALIGN=\"CENTER\">\n" +
            "<TR BGCOLOR=\"#FFAD00\">\n" +
            "<TH>Parameter Method<TH>Parameter Value");

        out.println("<TR><TD><b>getCharacterEncoding</b>");
        out.println(" <TD>" + request.getCharacterEncoding());

        out.println("<TR><TD><b>getContentLength</b>");
        out.println(" <TD>" + request.getContentLength());

        out.println("<TR><TD><b>getContentLengthLong</b>");
        out.println(" <TD>" + request.getContentLengthLong());

        out.println("<TR><TD><b>getContentType</b>");
        out.println(" <TD>" + request.getContentType());

        out.println("<TR><TD><b>getDispatcherType</b>");
        out.println(" <TD>" + request.getDispatcherType());

        out.println("<TR><TD><b>getInputStream</b>");
        out.println(" <TD>" + request.getInputStream());

        out.println("<TR><TD><b>getLocalAddr</b>");
        out.println(" <TD>" + request.getLocalAddr());

        out.println("<TR><TD><b>getLocale</b>");
        out.println(" <TD>" + request.getLocale());

        out.println("<TR><TD><b>getLocalName</b>");
        out.println(" <TD>" + request.getLocalName());

        out.println("<TR><TD><b>getLocalPort</b>");
        out.println(" <TD>" + request.getLocalPort());

        out.println("<TR><TD><b>getProtocol</b>");
        out.println(" <TD>" + request.getProtocol());

        out.println("<TR><TD><b>getRemoteAddr</b>");
        out.println(" <TD>" + request.getRemoteAddr());

        out.println("<TR><TD><b>getRemoteHost</b>");
        out.println(" <TD>" + request.getRemoteHost());

        out.println("<TR><TD><b>getRemotePort</b>");
        out.println(" <TD>" + request.getRemotePort());

        out.println("<TR><TD><b>getScheme</b>");
        out.println(" <TD>" + request.getScheme());

        out.println("<TR><TD><b>getServerName</b>");
        out.println(" <TD>" + request.getServerName());

        out.println("<TR><TD><b>getServerPort</b>");
        out.println(" <TD>" + request.getServerPort());

        out.println("<TR><TD><b>getServletContext</b>");
        out.println(" <TD>" + request.getServletContext());

        out.println("<TR><TD><b>getServletContext</b>");
        out.println(" <TD>" + request.getServletContext());

        out.println("</TABLE>");


        out.println("</body");
        out.println("</html");
    }

}