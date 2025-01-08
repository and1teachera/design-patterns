package com.zlatenov.furniture.implementation.modern;


import com.zlatenov.furniture.core.Chair;
import com.zlatenov.furniture.core.FurnitureFactory;
import com.zlatenov.furniture.core.Sofa;

/**
 * ModernFurnitureFactory is a concrete implementation of the FurnitureFactory
 * that creates modern style furniture.
 * @see FurnitureFactory
 * @see Chair
 * @see Sofa
 * @see ModernChair
 * @see ModernSofa
 *
 * @author Angel Zlatenov
 */
public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public String getStyle() {
        return "Modern";
    }
}