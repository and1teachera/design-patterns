package com.zlatenov;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for the Factory Method pattern implementation.
 * Tests the creation and behavior of different document types.
 *
 * @author Angel Zlatenov
 */
public class DocumentCreatorTest {
    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;

    @BeforeEach
    void setUp() {
        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    @DisplayName("Should create and open Word document")
    void shouldCreateAndOpenWordDocument() {
        DocumentCreator creator = new WordDocumentCreator();
        creator.openDocument();

        String output = outputStream.toString();
        assertTrue(output.contains("Opening Word document..."));
    }

    @Test
    @DisplayName("Should create and open PDF document")
    void shouldCreateAndOpenPDFDocument() {
        DocumentCreator creator = new PDFDocumentCreator();
        creator.openDocument();

        String output = outputStream.toString();
        assertTrue(output.contains("Opening PDF document..."));
    }

    @Test
    @DisplayName("Should create and save Word document")
    void shouldCreateAndSaveWordDocument() {
        DocumentCreator creator = new WordDocumentCreator();
        Document doc = creator.createDocument();
        doc.save();

        String output = outputStream.toString();
        assertTrue(output.contains("Saving Word document..."));
    }

    @Test
    @DisplayName("Should create and save PDF document")
    void shouldCreateAndSavePDFDocument() {
        DocumentCreator creator = new PDFDocumentCreator();
        Document doc = creator.createDocument();
        doc.save();

        String output = outputStream.toString();
        assertTrue(output.contains("Saving PDF document..."));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }
}