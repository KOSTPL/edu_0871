package less_11_09_2020;

import java.util.ArrayList;
import java.util.UUID;

public class UserList {//Синглетный класс - не позволяет создавать более 1 объекта своего гласса
private static UserList userList;
private list<User> users;

    public list<User> getUsers() {// тут хранятся юзеры
        return users;
    }

    public User getUser(UUID id{ // принимаем идентификатор пользователя в getUser
        for (User user: users){
            if (user.getUserId().equals(id))
                return user;
            return null;
        }
    }

    public static UserList get(){//через get() мы получаем объект в 1 экземпляре
        if(userList == null)//если юзер лист не создан, те. равен пустоте
            userList = new UserList();// объект  userList  статический !
        return userList;
}
    private  UserList(){//UserList конструктор приватный (не паблик),чтобы не создавать множество эклемпляров класса
        // привт конструктор может вызхывать только геттер,
        // а геттер - условие если userList == null то создаем объект если нет - не будем создавать.
        users = new ArrayList<>();
        for (int i=0; i<100, i++){
            User user = new User();
            user.setUserName("Пользователь №" + i);
            users.add(user);
        }
    }
}
