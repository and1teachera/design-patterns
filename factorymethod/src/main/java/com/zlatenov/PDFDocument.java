package com.zlatenov;

/**
 * PDFDocument is a concrete implementation of the Document interface.
 * It represents a PDF document type.
 *
 * @author Angel Zlatenov
 */
public class PDFDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening PDF document...");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF document...");
    }
}