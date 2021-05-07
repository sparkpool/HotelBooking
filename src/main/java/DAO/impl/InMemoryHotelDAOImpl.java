package DAO.impl;

import DAO.intrface.IHotelDAO;
import models.api.req.BookingRoom;
import models.api.res.BookingAmount;
import models.common.BookedRoom;
import models.common.Hotel;
import models.common.Room;

import java.util.*;

public class InMemoryHotelDAOImpl implements IHotelDAO {

    private static final List<Hotel> HOTELS = new ArrayList<>();
    //Initial setup
    private static final Map<String, Set<Room>> HOTEL_ROOMS = new HashMap<>();
    //this is for booked rooms
    private static final Set<BookedRoom> BOOKED_ROOMS = new HashSet<>();

    static {
        HOTELS.add(new Hotel(UUID.randomUUID().toString(), "Hotel1"));
        HOTELS.add(new Hotel(UUID.randomUUID().toString(), "Hotel2"));
        HOTELS.add(new Hotel(UUID.randomUUID().toString(), "Hotel3"));
        HOTELS.add(new Hotel(UUID.randomUUID().toString(), "Hotel4"));
        HOTELS.add(new Hotel(UUID.randomUUID().toString(), "Hotel5"));
        HOTELS.add(new Hotel(UUID.randomUUID().toString(), "Hotel6"));
    }

    @Override
    public List<Hotel> getAllHotels() {
        return HOTELS;
    }

    @Override
    public boolean isRoomAvailable(String hotelID, BookingRoom room) {
        Set<Room> rooms = HOTEL_ROOMS.get(hotelID);
        if (rooms == null || rooms.size() == 0) {
            //check here with booked rooms with dates compare
        }
        return true;
    }

    @Override
    public BookingAmount getPrice(String hotelID, BookingRoom room) {
        Set<Room> rooms = HOTEL_ROOMS.get(hotelID);
        if (rooms == null || rooms.size() == 0) {
            //check here with booked rooms with dates compare
        }
        Room room = rooms.iterator().next();
        return new BookingAmount(room.getPrice());
    }
}
