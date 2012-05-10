package entry;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Person {

    private String firstnameru;
    private String firstnameeng;
    private String firstnameua;
    private String lastnameru;
    private String lastnameeng;
    private String lastnameua;
    private String middleName;
    private Date dob;
    private Long id;
    private String address;
    private String details;
    private String sex;
    private String phone;
    private String email;
    private String code;
    private Date modified;
    private Date created;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getFirstnameru() {
        return firstnameru;
    }

    public void setFirstnameru(String firstnameru) {
        this.firstnameru = firstnameru;
    }
    
    public String getFirstnameeng() {
        return firstnameeng;
    }

    public void setFirstnameeng(String firstnameeng) {
        this.firstnameeng = firstnameeng;
    }
    
    public String getFirstnameua() {
        return firstnameua;
    }

    public void setFirstnameua(String firstnameua) {
        this.firstnameua = firstnameua;
    }

    public String getLastnameru() {
        return lastnameru;
    }

    public void setLastnameru(String lastnameru) {
        this.lastnameru = lastnameru;
    }
    
    public String getLastnameeng() {
        return lastnameeng;
    }

    public void setLastnameeng(String lastnameeng) {
        this.lastnameeng = lastnameeng;
    }
    
    public String getLastnameua() {
        return lastnameua;
    }

    public void setLastnameua(String lastnameua) {
        this.lastnameua = lastnameua;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

}
