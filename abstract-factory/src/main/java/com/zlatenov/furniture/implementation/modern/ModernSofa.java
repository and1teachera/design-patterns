package com.zlatenov.furniture.implementation.modern;

import com.zlatenov.furniture.core.Sofa;

/**
 * ModernSofa is a concrete implementation of the Sofa interface
 * representing a sofa in modern style.
 * @see Sofa
 *
 * @author Angel Zlatenov
 */
public class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a clean-lined, modern sofa with geometric shapes");
    }

    @Override
    public String getStyle() {
        return "Modern";
    }
}
