package jbp.address.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by kduvnjak on 06.03.2017.
 */
public class ListOfUsersHandler implements GetHandler {

    public void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<!DOCTYPE html>\n" +
                "<html lang=\"hr\">\n" +
                "<head>\n" +
                "    <title>Popis kontakta</title>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <!-- Start Responsive Web Design - Bootstrap  -->\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n" +
                "    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n" +
                "    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n" +
                "    <!-- End Responsive Web Design - Bootstrap  -->\n" +
                "    <link rel=\"stylesheet\" href=\"resources/css/myBootstrap.css\">\n" +
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
                "            <li><a href=\"c_new.html\">Novi kontakt</a></li>\n" +
                "        </ul>\n" +
                "        <ul class=\"nav navbar-nav navbar-right\">\n" +
                "            <li><a href=\"login.html\"><span class=\"glyphicon glyphicon-log-out\"></span> Odjava</a></li>\n" +
                "        </ul>\n" +
                "    </div>\n" +
                "</nav>\n" +
                "<!-- Navigation Bars End -->\n" +
                "\n" +
                "<div class=\"container\">\n" +
                "    <form action=\"c_edit.html\">\n" +
                "        <div class=\"table-responsive\">\n" +
                "            <table class=\"table table-hover table-striped\">\n" +
                "                <tr>\n" +
                "                    <th>Uredi</th>\n" +
                "                    <th>Ime Prezime</th>\n" +
                "                    <th>Email</th>\n" +
                "                    <th>Telefon</th>\n" +
                "                    <th>Fax</th>\n" +
                "                    <th>Mobitel</th>\n" +
                "                    <th>Spol</th>\n" +
                "                    <th>Adresa</th>\n" +
                "                    <th>Grad</th>\n" +
                "                    <th>Država</th>\n" +
                "                </tr>\n" +
                "                <tr>\n" +
                "                    <th><input type=\"submit\" value=\"Izmjeni\"></th>\n" +
                "                    <td>Pero Perić</td>\n" +
                "                    <td>pero.peric@gmail.com</td>\n" +
                "                    <td>01 2222 222</td>\n" +
                "                    <td>01 2222 223</td>\n" +
                "                    <td>099 222 222</td>\n" +
                "                    <td>Muško</td>\n" +
                "                    <td>Ulica 1</td>\n" +
                "                    <td>Zagreb</td>\n" +
                "                    <td>Hrvatska</td>\n" +
                "                </tr>\n" +
                "                <tr>\n" +
                "                    <th><input type=\"submit\" value=\"Izmjeni\"></th>\n" +
                "                    <td>Ivo Ivić</td>\n" +
                "                    <td>ivo.ivic@gmail.com</td>\n" +
                "                    <td>01 2223 222</td>\n" +
                "                    <td>01 2223 223</td>\n" +
                "                    <td>099 223 222</td>\n" +
                "                    <td>Muško</td>\n" +
                "                    <td>Ulica 2</td>\n" +
                "                    <td>Split</td>\n" +
                "                    <td>Hrvatska</td>\n" +
                "                </tr>\n" +
                "                <tr>\n" +
                "                    <th><input type=\"submit\" value=\"Izmjeni\"></th>\n" +
                "                    <td>Pero Hrabri</td>\n" +
                "                    <td>pero.hrabri@gmail.com</td>\n" +
                "                    <td>01 2224 222</td>\n" +
                "                    <td>01 2224 223</td>\n" +
                "                    <td>099 224 222</td>\n" +
                "                    <td>Muško</td>\n" +
                "                    <td>Ulica 5</td>\n" +
                "                    <td>Zabok</td>\n" +
                "                    <td>Hrvatska</td>\n" +
                "                </tr>\n" +
                "            </table>\n" +
                "        </div>\n" +
                "    </form>\n" +
                "</div>\n" +
                "<footer class=\"container text-center\">Copyright &copy; JBP</footer>\n" +
                "</body>\n" +
                "</html>");
    }
}
