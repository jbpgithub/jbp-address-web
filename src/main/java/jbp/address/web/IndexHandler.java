package jbp.address.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Silver on 12.3.2017..
 */
public class IndexHandler implements GetHandler {
    public void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>JBP</title>\n" +
                "    <link rel=\"stylesheet\" href=\"css/stil.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<div style=\"margin: auto; width:500px;\">\n" +
                "<a href=\"login.html\">\n" +
                "<img src=\"img/jbp_bw.png\" alt=\"logo jpg\" style=\"width:500px;height:500px;\">\n" +
                "</a>\n" +
                "</div>\n" +
                "</body>");
    }
}
