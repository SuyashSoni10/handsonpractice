package com.example.factory;

public class WordDocument implements Document {
    @Override
    public void open(){
        System.out.println("Opening word Document (.docx)");
    }
    @Override
    public void save(){
        System.out.println("Saving word Document (.docx");
    }
    @Override
    public void close(){
        System.out.println("Closing word Document (.docx)");
    }
}
