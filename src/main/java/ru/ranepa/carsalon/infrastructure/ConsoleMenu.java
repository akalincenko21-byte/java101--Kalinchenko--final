package ru.ranepa.carsalon.infrastructure;

import ru.ranepa.carsalon.application.CarService;
import ru.ranepa.carsalon.application.ClientService;
import java.util.Scanner;

public class ConsoleMenu {
    private Scanner scanner;
    private CarService carService;
    private ClientService clientService;

    // получает сканер и сервисы
    public ConsoleMenu(Scanner scanner, CarService carService, ClientService clientService) {
        this.scanner = scanner;
        this.carService = carService;
        this.clientService = clientService;
    }

    public void run() {
        boolean running = true;
        while (running) {
            System.out.println();
            System.out.println("=== Автосалон ===");
            System.out.println("1 - Добавить автомобиль");
            System.out.println("2 - Добавить клиента");
            System.out.println("3 - Показать всех");
            System.out.println("4 - Найти автомобиль по названию");
            System.out.println("5 - Продать автомобиль");
            System.out.println("6 - Статистика");
            System.out.println("0 - Выход");
            System.out.print("Введите команду: ");

            String command = scanner.nextLine();


            switch (command) {
                case "1":
                    System.out.print("Марка: ");
                    String brand = scanner.nextLine();
                    System.out.print("Модель: ");
                    String model = scanner.nextLine();
                    System.out.print("Год выпуска: ");
                    int year = Integer.parseInt(scanner.nextLine());
                    System.out.print("Цена: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    carService.addCar(brand, model, year, price);
                    break;
                case "2":
                    System.out.print("Имя клиента: ");
                    String clientName = scanner.nextLine();
                    System.out.print("Телефон: ");
                    String phone = scanner.nextLine();
                    clientService.addClient(clientName, phone);
                    break;
                case "3":
                    carService.getAllCars();
                    clientService.getAllClients();

                    break;
                case "4":
                    System.out.print("Название автомобиля: ");
                    String searchName = scanner.nextLine();
                    carService.findCarByName(searchName);
                    break;
                case "5":
                    System.out.print("Название автомобиля: ");
                    String carName = scanner.nextLine();
                    System.out.print("Имя клиента: ");
                    String buyerName = scanner.nextLine();
                    carService.sellCar(carName, buyerName);

                    break;
                case "6":
                    carService.getAveragePrice();

                    break;
                case "0":
                    running = false;
                    System.out.println("Выход из программы");
                    break;
                default:

                    System.out.println("Неизвестная команда");
            }
        }
    }
}