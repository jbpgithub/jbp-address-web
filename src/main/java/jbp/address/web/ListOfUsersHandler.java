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
        PrintWriter printWriter = response.getWriter();
        printWriter.println("Test");
    }
}
