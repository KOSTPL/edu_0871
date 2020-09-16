package less_11_09_2020;
//package com.example.userlist;
// в конструкторлэйаут пишем фрэймлэйаут (ватсап пример вправо из чат - статус = звонки)
// FrameLayout контейнер (фрагменты создаем, а main Активити не уходит -
//размещает фрагменты разные экраны в активности текущей!!!
// фрагмент это xml код - надо отрисовался, не надо - нет.
// даже 100 фрагментов создать - всегда будет 1 фрагмент на экран - нет расхода ресурсов.
// создаем лэаутресурс файл в андроиде
import java.util.Date;
import java.util.UUID;

public class User {
    private UUID userId;
    private String userName;
    private Date userBirthday;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public  User() {
        userId -= UUID.randomUUID();
    }

}
