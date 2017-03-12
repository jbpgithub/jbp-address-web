package jbp.address.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Silver on 12.3.2017..
 */
public class EditHandler implements GetHandler {
    public void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <title>Uredi kontakt</title>\n" +
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
                "    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n" +
                "        <ul class=\"nav navbar-nav\">\n" +
                "            <li><a href=\"meni.html\">Izbornik</a></li>\n" +
                "            <li><a href=\"c_new.html\">Novi kontakt</a></li>\n" +
                "            <li><a href=\"c_list.html\">Svi kontakti</a></li>\n" +
                "            <!-- <li><a href=\"c_edit.html\">Uredi kontakt</a></li>-->\n" +
                "        </ul>\n" +
                "        <ul class=\"nav navbar-nav navbar-right\">\n" +
                "            <li><a href=\"login.html\"><span class=\"glyphicon glyphicon-log-out\"></span> Odjava</a></li>\n" +
                "        </ul>\n" +
                "    </div>\n" +
                "</nav>\n" +
                "<!-- Navigation Bars End -->\n" +
                "\n" +
                "<!-- Content -->\n" +
                "<div class=\"container\">\n" +
                "    <div class=\"well\">\n" +
                "        <h3 class=\"text-center\">UREDI KONTAKT</h3>\n" +
                "        <form action=\"c_list.html\">\n" +
                "\n" +
                "            <fieldset disabled>\n" +
                "            <div class=\"form-group\">\n" +
                "                <label for=\"name\">Ime Prezime:</label>\n" +
                "                <input type=\"text\" class=\"form-control\" id=\"name\" placeholder=\"Pero Perić:\">\n" +
                "            </div>\n" +
                "            <div class=\"form-group\">\n" +
                "                <label for=\"email\">Email:</label>\n" +
                "                <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"pero.peric@gmail.com\">\n" +
                "            </div>\n" +
                "            <div class=\"form-group\">\n" +
                "                <label for=\"tel\">Lozinka:</label>\n" +
                "                <input type=\"text\" class=\"form-control\" id=\"tel\" placeholder=\"01 2222 222\">\n" +
                "            </div>\n" +
                "            <div class=\"form-group\">\n" +
                "                <label for=\"fax\">Faks:</label>\n" +
                "                <input type=\"text\" class=\"form-control\" id=\"fax\" placeholder=\"01 2222 223\">\n" +
                "            </div>\n" +
                "            <div class=\"form-group\">\n" +
                "                <label for=\"mob\">Mobitel:</label>\n" +
                "                <input type=\"text\" class=\"form-control\" id=\"mob\" placeholder=\"099 222 222\">\n" +
                "            </div>\n" +
                "            <div class=\"checkbox\" value=\"spol\">\n" +
                "                <label><input type=\"checkbox\" value=\"men\">Muško</label>\n" +
                "                <label><input type=\"checkbox\" value=\"female\" disabled>Žensko</label>\n" +
                "                <label><input type=\"checkbox\" value=\"other\" disabled>Nezna ni sam</label>\n" +
                "            </div>\n" +
                "            <div class=\"form-group\">\n" +
                "                <label for=\"adresa\">Adresa:</label>\n" +
                "                <input type=\"text\" class=\"form-control\" id=\"adresa\" placeholder=\"Ulica 1\">\n" +
                "            </div>\n" +
                "            <div class=\"form-group\">\n" +
                "                <label for=\"grad\">Grad:</label>\n" +
                "                <input type=\"text\" class=\"form-control\" id=\"grad\" placeholder=\"Zagreb\">\n" +
                "            </div>\n" +
                "            <div class=\"form-group\">\n" +
                "                <label for=\"drzava\">Država:</label>\n" +
                "                <input type=\"text\" class=\"form-control\" id=\"drzava\" placeholder=\"Hrvatska\">\n" +
                "            </div>\n" +
                "                </fieldset>\n" +
                "\n" +
                "            <button type=\"submit\" class=\"btn btn-default\">Spremi</button>\n" +
                "        </form>\n" +
                "\n" +
                "    </div>\n" +
                "</div>\n" +
                "<!-- End Content  -->\n" +
                "\n" +
                "<footer class=\"container text-center\">Copyright &copy; JBP</footer>\n" +
                "</body>\n" +
                "</html>");
    }
}
