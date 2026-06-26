package com.example.factory;

public class PdfDocument implements Document{
    @Override
    public void open(){
        System.out.println("Opening pdf document (.pdf)");
    }
    @Override
    public void save(){
        System.out.println("Saving pdf document (.pdf)");
    }
    @Override
    public void close(){
        System.out.println("Closing pdf document (.pdf)");
    }
}
