package com.TestMyProject.function;

import java.util.function.Consumer;


public class MyConsumer {
    public static void main(String[] args) {
        Consumer<User> consumer = (user) ->{
            user.setName("测试名称" +
                    "");
            System.out.println(user.getName());
        };
        User user = new User();
        consumer.accept(user);
    }


}
