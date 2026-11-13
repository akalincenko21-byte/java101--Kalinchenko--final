package ru.ranepa.carsalon.infrastructure;

import ru.ranepa.carsalon.application.port.ClientRepository;
import ru.ranepa.carsalon.domain.Client;
import java.util.ArrayList;
import java.util.List;

public class InMemoryClientRepository implements ClientRepository {
    private List<Client> clients = new ArrayList<>();

    public void add(Client client) {
        // TODO
    }

    public List<Client> findAll() {
        // TODO

        return null;
    }

    public Client findByName(String name) {
        // TODO
        return null;
    }
}