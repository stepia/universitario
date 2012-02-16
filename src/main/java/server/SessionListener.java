package server;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent arg0) {
        System.out.println("Session is created");
    }

    public void sessionDestroyed(HttpSessionEvent arg0) {
        System.out.println("Session is destroyed");
    }
}