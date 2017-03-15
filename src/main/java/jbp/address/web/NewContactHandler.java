package jbp.address.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Silver on 12.3.2017..
 */
public class NewContactHandler implements GetHandler {
    public void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<!DOCTYPE html>\n" +
                "<html lang=\"hr\">\n" +
                "<head>\n" +
                "    <title>Novi kontakt</title>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <!-- Start Responsive Web Design - Bootstrap  -->\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n" +
                "    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n" +
                "    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n" +
                "    <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n" +
                "    <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n" +
                "    <!-- End Responsive Web Design - Bootstrap  -->\n" +
                "    <link rel=\"stylesheet\" href=\"resources/css/myBootstrap.css\">\n" +
                "    <script src=\"resources/js/jQueryAdresar.js\"></script>\n" +
                " \n" +
                "</head>\n" +
                "<body>\n" +
                "<header>\n" +
                "    <div class=\"container page-header media\">\n" +
                "        <div class=\"media-left media-middle\">\n" +
                "            <img src=\"resources/img/jbp_tb.png\" class=\"media-object\" alt=\"jpb logo\" style=\"height:50px;\">\n" +
                "        </div>\n" +
                "        <div class=\"media-body\">\n" +
                "            <h1>Adresar</h1>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</header>\n" +
                "<!-- Navigation Bars -->\n" +
                "<nav class=\"container navbar navbar-inverse\">\n" +
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
                "            <li><a href=\"c_list.html\">Svi kontakti</a></li>\n" +
                "        </ul>\n" +
                "        <ul class=\"nav navbar-nav navbar-right\">\n" +
                "            <li><a href=\"login.html\"><span class=\"glyphicon glyphicon-log-out\"></span> Odjava</a></li>\n" +
                "        </ul>\n" +
                "    </div>\n" +
                "</nav>\n" +
                "<!-- Navigation Bars End -->\n" +
                "\n" +
                "<!-- Content -->\n" +
                "<div class=\"container well\">\n" +
                "\n" +
                "    <h3 class=\"text-center\">NOVI KONTAKT</h3>\n" +
                "    <h4 id=\"errormessage\" class=\"text-center text-danger\"></h4>\n" +
                "    <form action=\"c_list.html\" id=\"newContactForm\" class=\"form-horizontal\" method=\"post\">\n" +
                "        <div id=\"fname\" class=\"form-group conReqForm\">\n" +
                "            <label class=\"control-label col-sm-3\" for=\"name\">Ime Prezime:</label>\n" +
                "            <div class=\"col-sm-8\">\n" +
                "                <input type=\"text\" class=\"form-control required\" id=\"name\" placeholder=\"Unesite Ime Prezime:\">\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <div id=\"femail\" class=\"form-group conReqForm\">\n" +
                "            <label class=\"control-label col-sm-3\" for=\"email\">Email:</label>\n" +
                "            <div class=\"col-sm-8\">\n" +
                "                <input type=\"email\" class=\"form-control required \" id=\"email\" placeholder=\"Unesite email:\">\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <div id=\"ftel\" class=\"form-group conReqForm\">\n" +
                "            <label class=\"control-label col-sm-3\" for=\"tel\">Telefon:</label>\n" +
                "            <div class=\"col-sm-8\">\n" +
                "                <input type=\"text\" class=\"form-control required\" id=\"tel\" placeholder=\"Unesite broj telefona:\">\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <div id=\"ffax\" class=\"form-group conReqForm\">\n" +
                "            <label class=\"control-label col-sm-3\" for=\"fax\">Faks:</label>\n" +
                "            <div class=\"col-sm-8\">\n" +
                "                <input type=\"text\" class=\"form-control required\" id=\"fax\" placeholder=\"Unesite broj faksa:\">\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <div id=\"fmob\" class=\"form-group conReqForm\">\n" +
                "            <label class=\"control-label col-sm-3\" for=\"mob\">Mobitel:</label>\n" +
                "            <div class=\"col-sm-8\">\n" +
                "                <input type=\"text\" class=\"form-control required\" id=\"mob\" placeholder=\"Unesite broj mobitela:\">\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <div id=\"faddress\" class=\"form-group conOptForm\">\n" +
                "            <label class=\"control-label col-sm-3\" for=\"address\">Adresa:</label>\n" +
                "            <div class=\"col-sm-8\">\n" +
                "                <input type=\"text\" class=\"form-control conOptional\" id=\"address\" placeholder=\"Unesite adresu:\">\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <div id=\"fcity\" class=\"form-group conOptForm\">\n" +
                "            <label class=\"control-label col-sm-3\" for=\"city\">Grad:</label>\n" +
                "            <div class=\"col-sm-8\">\n" +
                "                <input type=\"text\" class=\"form-control conOptional\" id=\"city\" placeholder=\"Unesite grad:\">\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <div id=\"fcountry\" class=\"form-group conOptForm\">\n" +
                "            <label class=\"control-label col-sm-3\" for=\"country\">Država:</label>\n" +
                "            <div class=\"col-sm-8\">\n" +
                "                <input type=\"text\" class=\"form-control conOptional\" id=\"country\" placeholder=\"Unesite državu:\">\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <div class=\"form-group conOptForm\">\n" +
                "            <label class=\"control-label col-sm-3\" for=\"remark\">Napomena:</label>\n" +
                "            <div class=\"col-sm-8\">\n" +
                "                <input type=\"text\" class=\"form-control conOptional\" id=\"remark\" placeholder=\"Unesite napomenu:\">\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <div id=\"fdatepicker\" class=\"form-group conOptForm\">\n" +
                "            <label class=\"control-label col-sm-3\" for=\"datepicker\">Datum rođenja:</label>\n" +
                "            <div class=\"col-sm-3\">\n" +
                "                <input type=\"text\" class=\"form-control conOptional\" id=\"datepicker\" placeholder=\"Datum rođenja:\">\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <!--<div class=\"checkbox\">-->\n" +
                "        <div class=\"checkbox col-sm-3\"></div>\n" +
                "        <div class=\"col-sm-8\">\n" +
                "            <label class=\"control-label\">\n" +
                "                <input type=\"checkbox\" value=\"men\"> Muško\n" +
                "                <input type=\"checkbox\" value=\"female\"> Žensko\n" +
                "                <input type=\"checkbox\" value=\"other\"> Nezna ni sam\n" +
                "            </label>\n" +
                "        </div>\n" +
                "\n" +
                "        <div class=\"col-sm-3\"></div>\n" +
                "        <div class=\"col-sm-8\">\n" +
                "            <br>\n" +
                "            <button type=\"submit\" class=\"btn btn-default\">Spremi</button>\n" +
                "        </div>\n" +
                "\n" +
                "\n" +
                "    </form>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "<!-- End Content  -->\n" +
                "\n" +
                "<footer class=\"container text-center\">Copyright &copy; JBP</footer>\n" +
                "</body>\n" +
                "</html>");
    }
}
