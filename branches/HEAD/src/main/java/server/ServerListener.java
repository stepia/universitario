package server;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServerListener implements ServletContextListener {

    private ServletContext context = null;

    public ServerListener() {
        System.out.println(13);
    }

    public void contextDestroyed(ServletContextEvent event) {
        // Output a simple message to the server's console
        System.out.println("The Simple Web App. Has Been Removed");
        this.context = null;

    }

    public void contextInitialized(ServletContextEvent event) {
        this.context = event.getServletContext();
        // Output a simple message to the server's console
        System.out.println("The Simple Web App. Is Ready");

    }

}
