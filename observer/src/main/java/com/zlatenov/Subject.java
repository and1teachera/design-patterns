package com.zlatenov;

/**
 * @author Angel Zlatenov
 */

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
