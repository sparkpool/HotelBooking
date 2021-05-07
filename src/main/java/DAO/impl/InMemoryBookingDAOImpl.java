package DAO.impl;

import DAO.intrface.IBookingDAO;
import DAO.models.Booking;
import models.common.BookingInfo;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class InMemoryBookingDAOImpl implements IBookingDAO {

    private static final Map<String, Booking> BOOKINGS = new HashMap<>();
    private static final Map<String, String> REQ_BOOKING = new HashMap<>();

    @Override
    public String newBooking(BookingInfo info) {
        validate(info);
        String bookingID = UUID.randomUUID().toString();
        BOOKINGS.put(bookingID, new Booking(info));
        return bookingID;
    }

    private void validate(BookingInfo info) {
        if (info == null || info.getHotelID() == null || info.getRoom() == null || info.getCurrency() == null || info.getUser() == null) {
            throw new InvalidParameterException("Mandatory parameters in BookingInfo is invalid" + info);
        }
    }
}
