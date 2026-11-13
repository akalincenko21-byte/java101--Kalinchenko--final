package ru.ranepa.carsalon.domain;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private boolean sold;
    // создаёт машину
    public Car(String brand, String model, int year, double price) {

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.sold = false;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public boolean isSold() {
        return sold;
    }
}