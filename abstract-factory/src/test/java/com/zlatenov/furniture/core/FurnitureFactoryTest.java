package com.zlatenov.furniture.core;

import com.zlatenov.furniture.implementation.modern.ModernFurnitureFactory;
import com.zlatenov.furniture.implementation.victorian.VictorianFurnitureFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class FurnitureFactoryTest {
    private ByteArrayOutputStream outputStream;
    private FurnitureFactory modernFactory;
    private FurnitureFactory victorianFactory;

    @BeforeEach
    void setUp() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        modernFactory = new ModernFurnitureFactory();
        victorianFactory = new VictorianFurnitureFactory();
    }

    @Test
    @DisplayName("Modern factory should create modern style furniture")
    void modernFactoryShouldCreateModernFurniture() {
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();

        assertEquals("Modern", modernChair.getStyle());
        assertEquals("Modern", modernSofa.getStyle());
    }

    @Test
    @DisplayName("Victorian factory should create Victorian style furniture")
    void victorianFactoryShouldCreateVictorianFurniture() {
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();

        assertEquals("Victorian", victorianChair.getStyle());
        assertEquals("Victorian", victorianSofa.getStyle());
    }

    @Test
    @DisplayName("Modern furniture should have appropriate behavior")
    void modernFurnitureShouldHaveCorrectBehavior() {
        Chair chair = modernFactory.createChair();
        Sofa sofa = modernFactory.createSofa();

        chair.sitOn();
        sofa.lieOn();

        String output = outputStream.toString();
        assertTrue(output.contains("sleek, modern chair"));
        assertTrue(output.contains("clean-lined, modern sofa"));
    }

    @Test
    @DisplayName("Victorian furniture should have appropriate behavior")
    void victorianFurnitureShouldHaveCorrectBehavior() {
        Chair chair = victorianFactory.createChair();
        Sofa sofa = victorianFactory.createSofa();

        chair.sitOn();
        sofa.lieOn();

        String output = outputStream.toString();
        assertTrue(output.contains("ornate Victorian chair"));
        assertTrue(output.contains("luxurious Victorian sofa"));
    }

    @Test
    @DisplayName("Furniture store should correctly handle modern furniture orders")
    void furnitureStoreShouldHandleModernOrders() {
        FurnitureStore store = new FurnitureStore(modernFactory);
        store.displayFurniture();

        String output = outputStream.toString();
        assertTrue(output.contains("sleek, modern chair"));
        assertTrue(output.contains("clean-lined, modern sofa"));
    }

    @Test
    @DisplayName("Furniture store should correctly handle Victorian furniture orders")
    void furnitureStoreShouldHandleVictorianOrders() {
        FurnitureStore store = new FurnitureStore(victorianFactory);
        store.displayFurniture();

        String output = outputStream.toString();
        assertTrue(output.contains("ornate Victorian chair"));
        assertTrue(output.contains("luxurious Victorian sofa"));
    }

    @Test
    @DisplayName("Objects created by factories should be of correct type")
    void factoriesShouldCreateCorrectTypeObjects() {
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();

        assertNotNull(modernChair);
        assertNotNull(modernSofa);
        assertNotNull(victorianChair);
        assertNotNull(victorianSofa);
    }
}