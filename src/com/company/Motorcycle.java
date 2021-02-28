package com.company;

public class Motorcycle extends Vehicle {

    // Поле
    private int  maxSpeed;

    // Конструтор
    public Motorcycle (int wheelCount, int maxSpeed){
        super(wheelCount);
        this.maxSpeed = maxSpeed;
    }

    // Реализация метода из абстрактоного класса
    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство: Мотоцикл" + "\n" +
                "Количество колес: " + wheelCount + "\n" +
                "Максимальная скорость: " + maxSpeed + "км/ч");
    }
}
