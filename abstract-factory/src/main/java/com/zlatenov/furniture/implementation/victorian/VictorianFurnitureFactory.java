package com.zlatenov.furniture.implementation.victorian;


import com.zlatenov.furniture.core.Chair;
import com.zlatenov.furniture.core.FurnitureFactory;
import com.zlatenov.furniture.core.Sofa;

/**
 * VictorianFurnitureFactory is a concrete implementation of the FurnitureFactory
 * that creates Victorian style furniture.
 * @see FurnitureFactory
 * @see Chair
 * @see Sofa
 * @see VictorianChair
 * @see VictorianSofa
 *
 * @author Angel Zlatenov
 */
public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public String getStyle() {
        return "Victorian";
    }
}