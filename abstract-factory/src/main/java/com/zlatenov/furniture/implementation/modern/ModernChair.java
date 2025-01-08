package com.zlatenov.furniture.implementation.modern;

import com.zlatenov.furniture.core.Chair;

/**
 * ModernChair is a concrete implementation of the Chair interface
 * representing a chair in modern style.
 * @see Chair
 *
 * @author Angel Zlatenov
 */
public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a sleek, modern chair with minimalist design");
    }

    @Override
    public String getStyle() {
        return "Modern";
    }
}
