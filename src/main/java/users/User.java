package users;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @Column
    private String email;
    private String fName;
    private String lName;
    private String password;


    public User(String email, String password, String fName, String lName) {
        this.email = email;
        this.password = password;
        this.fName = fName;
        this.lName = lName;
    }

    protected User(){
    }

    public String getEmail() {
        return email;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}