package store;

import exceptions.ServerStartupException;
import models.common.Client;
import services.intrface.IClientService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientDataStore {

    private static IClientService clientService;
    private static final Map<String, Client> CLIENTS = new HashMap<>();

    public static void initialize() {
        List<Client> clients = clientService.getAllClients();

        if (clients == null || clients.size() == 0) {
            throw new ServerStartupException("Could not load clients from data store on server startup");
        }
        populate(clients);
    }

    private static void populate(List<Client> clients) {
        for (final Client client : clients) {
            CLIENTS.put(client.getId(), client);
        }
    }

    public static Client getClientByID(String clientID) {
        return CLIENTS.get(clientID);
    }
}
