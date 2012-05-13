package server;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServerListener implements ServletContextListener {

    private ServletContext context = null;

    public ServerListener() {

    }

    public void contextDestroyed(ServletContextEvent event) {
        // Output a simple message to the server's console
        System.out.println("The Simple Web App. Has Been Removed");
        this.setContext(null);

    }

    public void contextInitialized(ServletContextEvent event) {
        this.setContext(event.getServletContext());
        // Output a simple message to the server's console
        System.out.println("The Simple Web App. Is Ready");

    }

    public ServletContext getContext() {
        return context;
    }

    public void setContext(ServletContext context) {
        this.context = context;
    }

}
