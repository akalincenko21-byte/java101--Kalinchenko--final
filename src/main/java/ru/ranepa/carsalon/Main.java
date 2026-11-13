package ru.ranepa.carsalon;

import ru.ranepa.carsalon.application.CarService;
import ru.ranepa.carsalon.application.ClientService;
import ru.ranepa.carsalon.application.port.CarRepository;
import ru.ranepa.carsalon.application.port.ClientRepository;
import ru.ranepa.carsalon.infrastructure.ConsoleMenu;
import ru.ranepa.carsalon.infrastructure.InMemoryCarRepository;
import ru.ranepa.carsalon.infrastructure.InMemoryClientRepository;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarRepository carRepository = new InMemoryCarRepository();

        ClientRepository clientRepository = new InMemoryClientRepository();


        CarService carService = new CarService(carRepository);
        ClientService clientService = new ClientService(clientRepository);


        Scanner scanner = new Scanner(System.in);
        ConsoleMenu menu = new ConsoleMenu(scanner, carService, clientService);

        menu.run();
    }
}