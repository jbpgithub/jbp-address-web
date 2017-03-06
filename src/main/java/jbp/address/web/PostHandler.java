package jbp.address.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by kduvnjak on 06.03.2017.
 */
public interface PostHandler {
    public void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException;
}
