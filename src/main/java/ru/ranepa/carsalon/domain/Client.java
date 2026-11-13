package ru.ranepa.carsalon.domain;

public class Client {
    private String name;
    private String phone;

    // создаёт клиента
    public Client(String name, String phone) {

        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }


    public String getPhone() {
        return phone;
    }
}