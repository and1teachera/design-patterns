package com.zlatenov;

/**
 * WordDocumentCreator is a concrete implementation of DocumentCreator.
 * It creates WordDocument instances.
 *
 * @author Angel Zlatenov
 */
public class WordDocumentCreator extends DocumentCreator {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
