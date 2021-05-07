package DAO.impl;

import DAO.intrface.IClientDAO;
import models.common.Client;
import models.common.Hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class InMemoryClientDAOImpl implements IClientDAO {

    private static final List<Client> CLIENTS = new ArrayList<>();

    static {
        CLIENTS.add(new Client(UUID.randomUUID().toString(), "Hotel1"));
        CLIENTS.add(new Client(UUID.randomUUID().toString(), "Hotel2"));
        CLIENTS.add(new Client(UUID.randomUUID().toString(), "Hotel3"));
        CLIENTS.add(new Client(UUID.randomUUID().toString(), "Hotel4"));
        CLIENTS.add(new Client(UUID.randomUUID().toString(), "Hotel5"));
        CLIENTS.add(new Client(UUID.randomUUID().toString(), "Hotel6"));

    }

    @Override
    public List<Client> getAllClients() {
        return CLIENTS;
    }

    @Override
    public Hotel getHotelByClient(String clientId) {
        return null;
    }
}
