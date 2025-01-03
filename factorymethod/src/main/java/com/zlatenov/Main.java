package com.zlatenov;

/**
 * Main class to demonstrate the usage of the Factory Method pattern
 * in a document creation system.
 *
 * @author Angel Zlatenov
 */
public class Main {
    public static void main(String[] args) {
        // Create document creators
        DocumentCreator wordCreator = new WordDocumentCreator();
        DocumentCreator pdfCreator = new PDFDocumentCreator();

        // Create and open a Word document
        System.out.println("Creating and opening a Word document:");
        wordCreator.openDocument();

        // Create and open a PDF document
        System.out.println("\nCreating and opening a PDF document:");
        pdfCreator.openDocument();
    }
}