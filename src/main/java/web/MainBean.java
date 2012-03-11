package web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "mainbean")
@SessionScoped
public class MainBean {

    public String doAction(String action) {
        return action;
    }

}
