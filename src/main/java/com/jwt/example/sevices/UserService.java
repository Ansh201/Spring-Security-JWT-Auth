package com.jwt.example.sevices;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store=new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Ansh Gangwar","ansh123@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Manish Chaudhary","Manish123@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Deepak Singh","deepak123@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Amit Kumar","a mit123@gmail.com"));

    }
    public List<User> getUsers(){
        return this.store;
    }

}
