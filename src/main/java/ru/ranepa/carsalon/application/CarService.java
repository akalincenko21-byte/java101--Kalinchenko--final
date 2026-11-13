package ru.ranepa.carsalon.application;

import ru.ranepa.carsalon.application.port.CarRepository;
import ru.ranepa.carsalon.domain.Car;
import java.util.List;

public class CarService {
    private CarRepository carRepository;

    // получает репозиторий
    public CarService(CarRepository carRepository) {

        this.carRepository = carRepository;
    }

    public void addCar(String brand, String model, int year, double price) {
        // TODO
    }

    public List<Car> getAllCars() {
        // TODO

        return null;
    }

    public Car findCarByName(String name) {
        // TODO

        return null;
    }

    public boolean sellCar(String carName, String clientName) {
        // TODO
        return false;
    }

    public double getAveragePrice() {
        // TODO

        return 0;
    }
}