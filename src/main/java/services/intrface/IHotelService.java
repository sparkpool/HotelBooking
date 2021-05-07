package services.intrface;

import models.api.req.BookingRoom;
import models.api.res.BookingAmount;
import models.common.Hotel;

import java.util.List;

public interface IHotelService {

    List<Hotel> getAllHotels();

    boolean isRoomAvailable(String hotelID, BookingRoom room);

    BookingAmount getPrice(String hotelID, BookingRoom room);
}
