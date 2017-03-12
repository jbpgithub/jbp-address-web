package jbp.address.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Silver on 12.3.2017..
 */
public class MeniHandler implements GetHandler {
    public void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <title>Izbornik</title>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <!-- Start Responsive Web Design - Bootstrap  -->\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n" +
                "    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n" +
                "    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n" +
                "    <!-- End Responsive Web Design - Bootstrap  -->\n" +
                "    <link rel=\"stylesheet\" href=\"css/myBootstrap.css\">\n" +
                "    <!--\n" +
                "    <link rel=\"stylesheet\" href=\"css/stil.css\">\n" +
                "    -->\n" +
                "</head>\n" +
                "<body>\n" +
                "<header>\n" +
                "    <div class=\"container page-header media\">\n" +
                "        <div class=\"media-left media-middle\">\n" +
                "            <img src=\"img/jbp_tb.png\" class=\"media-object\" alt=\"jpb logo\" style=\"height:50px;\">\n" +
                "        </div>\n" +
                "        <div class=\"media-body\">\n" +
                "            <h1>Adresar</h1>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</header>\n" +
                "<!-- Navigation Bars -->\n" +
                "<nav class=\"container navbar navbar-inverse\">\n" +
                "    <!-- -->\n" +
                "    <div class=\"navbar-header\">\n" +
                "        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n" +
                "            <span class=\"icon-bar\"></span>\n" +
                "            <span class=\"icon-bar\"></span>\n" +
                "            <span class=\"icon-bar\"></span>\n" +
                "        </button>\n" +
                "\n" +
                "        <form class=\"navbar-form\" role=\"search\">\n" +
                "            <div class=\"form-group input-group\">\n" +
                "                <input type=\"text\" class=\"form-control\" placeholder=\"Traži..\">\n" +
                "                <span class=\"input-group-btn\">\n" +
                "                            <button class=\"btn btn-default\" type=\"button\">\n" +
                "                            <span class=\"glyphicon glyphicon-search\"></span>\n" +
                "                            </button>\n" +
                "                        </span>\n" +
                "            </div>\n" +
                "        </form>\n" +
                "    </div>\n" +
                "    <!--   -->\n" +
                "    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n" +
                "        <ul class=\"nav navbar-nav\">\n" +
                "            <!--   <li><a href=\"meni.html\">Izbornik</a></li>\n" +
                "                   <li><a href=\"c_new.html\">Novi kontakt</a></li>\n" +
                "                   <li><a href=\"c_list.html\">Prikaz kontakta</a></li>\n" +
                "                   <li><a href=\"c_edit.html\">Uredi kontakt</a></li>\n" +
                "             -->\n" +
                "        </ul>\n" +
                "        <ul class=\"nav navbar-nav navbar-right\">\n" +
                "            <li><a href=\"login.html\"><span class=\"glyphicon glyphicon-log-out\"></span> Odjava</a></li>\n" +
                "        </ul>\n" +
                "    </div>\n" +
                "    <!--\n" +
                "    <div class=\"collapse navbar-collapse\" id=\"mySNavbar\">\n" +
                "        <ul class=\"nav navbar-nav\">\n" +
                "            <li><form class=\"navbar-form\" role=\"search\">\n" +
                "                <div class=\"form-group input-group\">\n" +
                "                    <input type=\"text\" class=\"form-control\" placeholder=\"Traži..\">\n" +
                "\n" +
                "                    <span class=\"input-group-btn\">\n" +
                "            <button class=\"btn btn-default\" type=\"button\">\n" +
                "              <span class=\"glyphicon glyphicon-search\"></span>\n" +
                "            </button>\n" +
                "          </span>\n" +
                "                </div>\n" +
                "            </form></li>\n" +
                "        </ul>\n" +
                "    </div>\n" +
                "    -->\n" +
                "</nav>\n" +
                "\n" +
                "<!-- Menu -->\n" +
                "<div class=\"container\">\n" +
                "    <div class=\"well\">\n" +
                "        <a href=\"c_list.html\" class=\"btn btn-default btn-lg btn-block\" role=\"button\" data-toggle=\"tooltip\"\n" +
                "           data-placement=\"auto\" title=\"Prikaz svih kontakta\">\n" +
                "            <span class=\"glyphicon glyphicon-th-list\"></span> Svi kontakti</a>\n" +
                "        <br>\n" +
                "        <a href=\"c_new.html\" class=\"btn btn-default btn-lg btn-block\" role=\"button\" data-toggle=\"tooltip\"\n" +
                "           data-placement=\"auto\" title=\"Kreiraj novi kontakt\">\n" +
                "            <span class=\"glyphicon glyphicon-user\"></span> Novi kontakt</a>\n" +
                "    </div>\n" +
                "</div>\n" +
                "\n" +
                "<script>\n" +
                "$(document).ready(function(){\n" +
                "    $('[data-toggle=\"tooltip\"]').tooltip();\n" +
                "});\n" +
                "</script>\n" +
                "\n" +
                "<footer class=\"container text-center\">Copyright &copy; JBP</footer>\n" +
                "\n" +
                "</body>\n" +
                "\n" +
                "</html>");
    }
}
