package kurs.Jokes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal Snopek on 11.07.2019.
 */
public abstract class User {

    private String username;
    private  String password;
    private List<String> roles=new ArrayList<>();

    public User(String username, String password) {
        this.username = username;
        this.password = password;
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

    public void setPassword(String password) {this.password = password;
    }
}
