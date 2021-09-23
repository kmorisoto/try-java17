package com.example.recods;

public class App {
    public static void main(String[] args) {
        User user1 = new User("aaa");
        User user2 = new User("bb");
        System.out.println(user1.name());
        System.out.println(user1.foo());
        System.out.println(user1.equals(user2));
        System.out.println(user1 == user2);
    }
}
