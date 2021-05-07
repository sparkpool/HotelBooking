package services.impl;

import models.api.req.BookingRoom;
import models.api.res.BookingAmount;
import models.common.Hotel;
import services.intrface.IHotelService;

import java.util.List;

public class HotelServiceImpl implements IHotelService {
    @Override
    public List<Hotel> getAllHotels() {
        return null;
    }

    @Override
    public boolean isRoomAvailable(String hotelID, BookingRoom room) {
        return false;
    }

    @Override
    public BookingAmount getPrice(String hotelID, BookingRoom room) {
        return null;
    }
}
