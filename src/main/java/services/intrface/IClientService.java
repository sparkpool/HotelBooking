package services.intrface;

import models.common.Client;
import models.common.Hotel;

import java.util.List;

public interface IClientService {

    List<Client> getAllClients();

    Hotel getHotelByClient(String clientId);
}
