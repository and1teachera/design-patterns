package com.zlatenov.furniture;

import com.zlatenov.furniture.core.Chair;
import com.zlatenov.furniture.core.FurnitureFactory;
import com.zlatenov.furniture.core.FurnitureStore;
import com.zlatenov.furniture.core.Sofa;
import com.zlatenov.furniture.implementation.modern.ModernChair;
import com.zlatenov.furniture.implementation.modern.ModernFurnitureFactory;
import com.zlatenov.furniture.implementation.modern.ModernSofa;
import com.zlatenov.furniture.implementation.victorian.VictorianChair;
import com.zlatenov.furniture.implementation.victorian.VictorianFurnitureFactory;
import com.zlatenov.furniture.implementation.victorian.VictorianSofa;

/**
 *  Main class to demonstrate the Abstract Factory pattern using the furniture store example.
 *  It creates a Modern Furniture Store and a Victorian Furniture Store.
 *
 *  @see FurnitureStore
 *  @see FurnitureFactory
 *  @see ModernFurnitureFactory
 *  @see VictorianFurnitureFactory
 *  @see Chair
 *  @see Sofa
 *  @see ModernChair
 *  @see ModernSofa
 *  @see VictorianChair
 *  @see VictorianSofa
 *
 * @author Angel Zlatenov
 */
public class Main {
    public static void main(String[] args) {
        // Create a store with Modern furniture factory
        System.out.println("Creating a Modern Furniture Store:");
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        FurnitureStore modernStore = new FurnitureStore(modernFactory);
        modernStore.displayFurniture();

        System.out.println("\nCreating a Victorian Furniture Store:");
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        FurnitureStore victorianStore = new FurnitureStore(victorianFactory);
        victorianStore.displayFurniture();

        System.out.println("\nDemonstrating individual factory usage:");
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();

        System.out.println("\nTesting Modern Furniture:");
        modernChair.sitOn();
        modernSofa.lieOn();
    }
}