package com.zlatenov;

/**
 * DocumentCreator is an abstract class that defines the factory method pattern.
 * It declares the factory method that returns a Document object.
 *
 * @author Angel Zlatenov
 */
public abstract class DocumentCreator {

    /**
     * Factory method that creates a new Document.
     * This is the core of the Factory Method pattern.
     *
     * @return a new Document instance
     */
    public abstract Document createDocument();

    /**
     * Template method that creates and opens a document.
     * This demonstrates how the factory method is typically used.
     */
    public void openDocument() {
        Document doc = createDocument();
        doc.open();
    }
}