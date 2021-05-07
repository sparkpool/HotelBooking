package DAO.intrface;

import models.common.Client;
import models.common.Hotel;

import java.util.List;

public interface IClientDAO {

    List<Client> getAllClients();

    Hotel getHotelByClient(String clientId);
}
