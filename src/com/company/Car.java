package com.company;

public class Car extends Vehicle implements Costable{

    // Поле
    private int doorsCount;

    // Конструктор
    public Car (int wheelCount, int doorsCount){
        super(wheelCount);
        this.doorsCount = doorsCount;
    }

    // Реализация метода из абстрактоного класса
    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство: Машина" + "\n" +
                "Количество дверей: " + doorsCount + "\n" +
                "Количество колес: " + wheelCount + "\n" + "Цена: " + getCost() + "$");

    }

    // Реализация метода интерфейса
    @Override
    public int getCost() {
        return (int) (Math.random() * 10000);
    }
}
