package Priyanshu.com.Streamingsite_inMemory.Models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class User {
    private Long userid;
    private String name;
    private String password;

    public User(Long userid, String name, String password) {
        this.userid = userid;
        this.name = name;
        this.password = password;
    }
}
