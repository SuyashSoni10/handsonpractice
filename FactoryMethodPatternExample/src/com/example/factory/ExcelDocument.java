package com.example.factory;

public class ExcelDocument implements Document{
    @Override
    public void  open(){
        System.out.println("Opening Excel Document (.xlsx)");
    }
    @Override
    public void save(){
        System.out.println("Saving Excel Document (.xlsx)");
    }
    @Override
    public void close(){
        System.out.println("Saving Excel Document (.xlsx)");
    }
}
