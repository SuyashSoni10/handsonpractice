package com.example.singleton;
public class Logger {
    // step A
    private static Logger instance;
    // step B
    private Logger (){
        System.out.println("Logger Instance created.");
    }
    // step C
    public static Logger getInstance(){
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }
    public void log(String message){
        System.out.println("[LOG]" + message);
    }
}