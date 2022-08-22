package com.arpit24.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int userCounter = 3;

    static {
        users.add(new User("arpit", 20, new Date()));
        users.add(new User("archit", 24, new Date()));
        users.add(new User("aman", 22, new Date()));
        users.add(new User("raman", 21, new Date()));
    }


    public List<User> getAllUsers() {
        return users;
    }

    public User saveNewUser(User u) {
        if (u.getId() == 0) {
            u.setId(++userCounter);
        }
        users.add(u);
        return u;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User deleteOneUser(int id) {
//        for (User u : users) {
//            if (u.getId() == id) {
//                users.remove(u);
//                return u;
//            }
//        }
//        return null;
//    }
        Iterator<User> it = users.iterator();
        while (it.hasNext()) {
            User u = it.next();
            if (u.getId() == id) {
                it.remove();
                return u;
            }
        }
        return null;
    }
}
