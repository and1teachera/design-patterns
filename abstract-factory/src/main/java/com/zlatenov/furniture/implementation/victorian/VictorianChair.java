package com.zlatenov.furniture.implementation.victorian;


import com.zlatenov.furniture.core.Chair;

/**
 * VictorianChair is a concrete implementation of the Chair interface
 * representing a chair in Victorian style.
 * @see Chair
 *
 * @author Angel Zlatenov
 */
public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on an ornate Victorian chair with intricate wooden carvings");
    }

    @Override
    public String getStyle() {
        return "Victorian";
    }
}