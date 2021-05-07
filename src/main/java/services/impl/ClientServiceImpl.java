package services.impl;

import DAO.impl.InMemoryClientDAOImpl;
import DAO.intrface.IClientDAO;
import models.common.Client;
import models.common.Hotel;
import services.intrface.IClientService;

import java.util.List;

public class ClientServiceImpl implements IClientService {

    //Initialize through spring so that we can change later also
    private IClientDAO clientDAO = new InMemoryClientDAOImpl();

    @Override
    public List<Client> getAllClients() {
        return clientDAO.getAllClients();
    }

    @Override
    public Hotel getHotelByClient(String clientId) {
        return null;
    }
}
