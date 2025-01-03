package com.zlatenov;

/**
 * Document interface represents the product in the Factory Method pattern.
 * This is the common interface that all document types will implement.
 *
 * @author Angel Zlatenov
 */
public interface Document {
    /**
     * Opens the document for viewing or editing.
     */
    void open();

    /**
     * Saves the current state of the document.
     */
    void save();
}