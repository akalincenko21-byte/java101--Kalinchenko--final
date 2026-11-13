package ru.ranepa.carsalon.infrastructure;

import ru.ranepa.carsalon.application.port.CarRepository;
import ru.ranepa.carsalon.domain.Car;
import java.util.ArrayList;
import java.util.List;

public class InMemoryCarRepository implements CarRepository {
    private List<Car> cars = new ArrayList<>();

    public void add(Car car) {
        // TODO
    }


    public List<Car> findAll() {
        // TODO

        return null;
    }

    public Car findByName(String name) {
        // TODO
        return null;
    }
}