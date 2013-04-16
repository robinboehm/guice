package robinboehm.jsr330;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Singleton
public class JSR330Servlet extends HttpServlet {

    @Inject
    private GuicyInterface gi;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        writer.println("Howdy Guice. " + "Injected impl " + gi.toString());

        writer.close();

    }
}
