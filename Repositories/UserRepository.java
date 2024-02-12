package Priyanshu.com.Streamingsite_inMemory.Repositories;

import Priyanshu.com.Streamingsite_inMemory.Models.User;
import Priyanshu.com.Streamingsite_inMemory.Models.Video;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Optional;
@Repository

public class UserRepository {

    HashMap<Long, User> users= new HashMap<>();
    public void save(User user){
      users.put(user.getUserid(), user);
    }
    public User FindById(Long id){
        return users.get(id);
    }



}
