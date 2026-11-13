package ru.ranepa.carsalon.application;

import ru.ranepa.carsalon.application.port.ClientRepository;
import ru.ranepa.carsalon.domain.Client;
import java.util.List;

public class ClientService {
    private ClientRepository clientRepository;


    // получает репозиторий
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void addClient(String name, String phone) {
        // TODO
    }

    public List<Client> getAllClients() {
        // TODO
        return null;
    }
}