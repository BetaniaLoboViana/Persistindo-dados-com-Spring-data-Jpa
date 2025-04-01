package dio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
//import javax.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class user {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "user_id")
    private Integer Id;
    @Column (length = 50, nullable = false)
    private String name;
    @Column (length = 30, nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    private String username;
    @Column (length = 100, nullable = false)
    private String password;
    @Override
    public String toString() {
        return "user [Id=" + Id + ", name=" + name + ", username=" + username + ", password=" + password + "]";
    }
    

  
}
