package com.example.singleton;

public class SingletonTest {
    public static void main(String[] args){
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application Started");
        logger2.log("User logged in");

        if (logger1 == logger2){
            System.out.println("Same instance confirmed --> Singleton Works.");
        }else{
            System.out.println("Different instances --> Singleton failed.");
        }
        System.out.println("logger1 hash : " + logger1.hashCode());
        System.out.println("logger2 hash : " + logger2.hashCode());
    }
}
