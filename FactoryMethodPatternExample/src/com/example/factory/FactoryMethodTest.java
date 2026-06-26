package com.example.factory;

public class FactoryMethodTest {
    public static void main(String[] args){
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        System.out.println("---Word Document---");
        wordFactory.openDocument();

        System.out.println("---Pdf Document---");
        pdfFactory.openDocument();

        System.out.println("---Excel Document---");
        excelFactory.openDocument();

        System.out.println("\n---Using base type only---");
        DocumentFactory factory = new PdfDocumentFactory();
        Document doc = factory.createDocument();
        doc.open();
    }
}
