package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);

    void addObserver(com.kodilla.patterns2.observer.homework.Observer observer);

    void removeObserver(com.kodilla.patterns2.observer.homework.Observer observer);

    void notifyObservers();
}
