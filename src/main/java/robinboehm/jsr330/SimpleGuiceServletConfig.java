package robinboehm.jsr330;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

import javax.servlet.annotation.WebListener;


@WebListener
public class SimpleGuiceServletConfig extends GuiceServletContextListener {
    @Override
    protected Injector getInjector() {
        return Guice.createInjector(new ServletModule() {

            @Override
            protected void configureServlets() {
                bind(GuicyInterface.class).to(GuicyInterfaceImpl.class);
                serve("/*").with(JSR330Servlet.class);
            }
        });
    }
}
