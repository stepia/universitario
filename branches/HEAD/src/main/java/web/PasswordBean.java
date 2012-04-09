package web;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import service.UserManager;
import entry.User;

@ManagedBean
@SessionScoped
public class PasswordBean {
    @ManagedProperty(value = "#{userManager}")
    private UserManager userManager;
    private String newPassword;
    private String confirmPassword;
    private String password;
    private String username;

    public PasswordBean() {

    }

    public UserManager getUserManager() {
        return userManager;
    }

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String doChange(ActionEvent actionEvent) {
        String status = "success";
        if (isNewPasswordValid()) {
            if (getUsername() == null || getUsername().isEmpty()) {
                setUsername(String.valueOf(FacesContext.getCurrentInstance().getExternalContext().getRemoteUser()));
            }
            User user = userManager.getUser(username);
            if (user == null) {
                FacesContext.getCurrentInstance().addMessage(
                            null,
                            new FacesMessage(FacesMessage.SEVERITY_ERROR, "Wrong username",
                                        "Username is wrong"));
                status = "failure";
            } else if (!user.getPassword().equals(getPassword())) {
                FacesContext.getCurrentInstance().addMessage(
                            null,
                            new FacesMessage(FacesMessage.SEVERITY_ERROR, "Wrong password",
                                        "Wrong username or password"));
                status = "failure";
            } else {
                user.setPassword(newPassword);
                userManager.editUser(user);
                FacesContext.getCurrentInstance().addMessage(
                            null,
                            new FacesMessage(FacesMessage.SEVERITY_INFO, "Password was changed",
                                        "Wrong username or password"));
                setUsername("");
            }
        }
        return status;

    }

    private boolean isNewPasswordValid() {
        boolean status = true;
        if (!getNewPassword().equals(getConfirmPassword())) {
            FacesContext.getCurrentInstance().addMessage("pnlChangePassword:newPassword",
                        new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                    "Values in 'Confirm Password' and 'New Password' fields are different",
                                    null));
            status = false;

        } else if (getNewPassword().length() < 3 || getNewPassword().length() > 20) {
            FacesContext.getCurrentInstance().addMessage("pnlChangePassword:newPassword", new
                        FacesMessage(FacesMessage.SEVERITY_ERROR,
                                    "Error in Password Length", null));
            status = false;

        } else {
            Pattern p1 = Pattern.compile("^[a-zA-Z0-9]+$");
            Matcher m1 = p1.matcher(getNewPassword());
            boolean matchFound1 = m1.matches();
            if (!matchFound1) {
                FacesContext.getCurrentInstance().addMessage("pnlChangePassword:newPassword",
                            new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                        "Error in Password", null));
                status = false;

            }
        }
        return status;
    }
}
