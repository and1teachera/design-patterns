package com.zlatenov;

/**
 * WordDocument is a concrete implementation of the Document interface.
 * It represents a Microsoft Word document type.
 *
 * @author Angel Zlatenov
 */
public class WordDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Word document...");
    }

    @Override
    public void save() {
        System.out.println("Saving Word document...");
    }
}