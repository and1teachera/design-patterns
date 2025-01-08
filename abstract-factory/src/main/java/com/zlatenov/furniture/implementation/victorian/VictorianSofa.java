package com.zlatenov.furniture.implementation.victorian;

import com.zlatenov.furniture.core.Sofa;

/**
 * VictorianSofa is a concrete implementation of the Sofa interface
 * representing a sofa in Victorian style.
 * @see Sofa
 *
 * @author Angel Zlatenov
 */
public class VictorianSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a luxurious Victorian sofa with tufted upholstery");
    }

    @Override
    public String getStyle() {
        return "Victorian";
    }
}