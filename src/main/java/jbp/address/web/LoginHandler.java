package jbp.address.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Silver on 12.3.2017..
 */
public class LoginHandler implements GetHandler {
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
                "    \n" +
                "    <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n" +
                "    <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n" +
                "    <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n" +
                "    <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n" +
                "    <!-- End Responsive Web Design - Bootstrap  -->\n" +
                "    <link rel=\"stylesheet\" href=\"css/myBootstrap.css\">\n" +
                "    <script src=\"js/jQueryAdresar.js\"></script>\n" +
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
                "\n" +
                "<nav class=\"container navbar navbar-inverse\">\n" +
                "</nav>\n" +
                "\n" +
                "<!-- Content -->\n" +
                "<div class=\"container\">\n" +
                "    <div class=\"col-sm-8 col-sm-offset-2\">\n" +
                "    <div class=\"well\">\n" +
                "        <h4 class=\"text-center\">Prijava u aplikaciju</h4>\n" +
                "        <form action=\"meni.html\">\n" +
                "            <div class=\"form-group\">\n" +
                "                <label for=\"usernameInput\">Korisničko ime:</label>\n" +
                "                <div class=\"hide\"><p class=\"text-danger\">Molimo unesite korisničko ime!</p></div>\n" +
                "                <input type=\"text\" class=\"form-control required\" id=\"usernameInput\" placeholder=\"Unesi korisničko ime:\">\n" +
                "            </div>\n" +
                "            <div class=\"form-group\">\n" +
                "                <label for=\"passwordInput\">Lozinka:</label>\n" +
                "                <div class=\"hide\"><p class=\"text-danger\">Molimo unesite lozinku!</p></div>\n" +
                "                <input type=\"password\" class=\"form-control required\" id=\"passwordInput\" placeholder=\"Unesi lozinku\">\n" +
                "            </div>\n" +
                "            <div class=\"checkbox\">\n" +
                "                <label><input type=\"checkbox\">Zapamti me</label>\n" +
                "            </div>\n" +
                "            <button type=\"submit\" class=\"btn btn-default\">Prijavi se</button>\n" +
                "        </form>\n" +
                "    </div>\n" +
                "    </div>\n" +
                "</div>\n" +
                "<!-- End Content  -->\n" +
                "\n" +
                "<script>\n" +
                "\n" +
                "\n" +
                "</script>\n" +
                "\n" +
                "<footer class=\"container text-center\">Copyright &copy; JBP</footer>\n" +
                "\n" +
                "</body>\n" +
                "\n" +
                "</html>");
    }
}
