package com.zlatenov;

/**
 * PDFDocumentCreator is a concrete implementation of DocumentCreator.
 * It creates PDFDocument instances.
 *
 * @author Angel Zlatenov
 */
public class PDFDocumentCreator extends DocumentCreator {

    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}