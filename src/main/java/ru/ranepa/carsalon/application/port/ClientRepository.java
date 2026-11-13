package ru.ranepa.carsalon.application.port;

import ru.ranepa.carsalon.domain.Client;
import java.util.List;

public interface ClientRepository {
    void add(Client client);

    List<Client> findAll();

    Client findByName(String name);
}