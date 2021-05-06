package com.TestMyProject.function;

import java.util.function.Supplier;

/**
 * 生产者 主要是使用get方法
 */
public class MySupplier {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            return "生产者的应用";
        };
        String result = supplier.get();
        System.out.println(result);


//        生产者的应用
        Supplier<User> supplier1 = () -> {
            User user = new User();
            user.setAge(11);
            user.setName("zs");
            return user;
        };

        System.out.println(supplier1.get());
        System.out.println(supplier1.get().getAge()+"  "+supplier1.get().getName());
    }
}
