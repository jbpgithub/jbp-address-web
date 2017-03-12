package jbp.address.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kduvnjak on 27.02.2017.
 */
public class DispatcherServlet extends HttpServlet {

    private Map<String, GetHandler> getHandlerMap;

    private Map<String, PostHandler> postHandlerMap;

    public DispatcherServlet() {
        getHandlerMap = new HashMap<String, GetHandler>();
        getHandlerMap.put("c_list", new ListOfUsersHandler());
        getHandlerMap.put("c_new", new NewContactHandler());
        getHandlerMap.put("c_edit", new EditHandler());
        getHandlerMap.put("login", new LoginHandler());
        getHandlerMap.put("meni", new MeniHandler());
        getHandlerMap.put("index", new IndexHandler());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

        GetHandler getHandler = null;
        String uri = req.getRequestURI();

        for (String urlPatern : getHandlerMap.keySet()) {
            if (uri.contains(urlPatern)) {
                getHandler = getHandlerMap.get(urlPatern);
            }
        }

        if (getHandler == null) {
            throw new IllegalStateException("Url pattern not supported by application");
        }

        getHandler.doGet(req,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
    }
}
