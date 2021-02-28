package com.company;


// Создание абстрактного класса
public abstract class Vehicle {

    // Поле класса
    protected int wheelCount;

    // Конструктор
    public Vehicle (int wheelCount){
        this.wheelCount = wheelCount;
    }

    // Абстракный метод
    protected abstract void printInfo();



}
