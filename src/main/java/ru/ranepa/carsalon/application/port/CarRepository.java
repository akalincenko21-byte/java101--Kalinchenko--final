package ru.ranepa.carsalon.application.port;

import ru.ranepa.carsalon.domain.Car;
import java.util.List;

public interface CarRepository {
    void add(Car car);

    List<Car> findAll();

    Car findByName(String name);
}