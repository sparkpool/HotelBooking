package DAO.models;

import models.api.req.BookingRoom;
import models.api.req.User;
import models.api.res.BookingAmount;
import models.common.BookingInfo;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Booking {

    private String hotelID;
    private List<BookingRoom> room;
    private User user;
    private BookingAmount amount;
    private String bookingID;
    private String reqID;

    public String getHotelID() {
        return hotelID;
    }

    public void setHotelID(String hotelID) {
        this.hotelID = hotelID;
    }

    public List<BookingRoom> getRoom() {
        return room;
    }

    public void setRoom(List<BookingRoom> room) {
        this.room = room;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BookingAmount getAmount() {
        return amount;
    }

    public void setAmount(BookingAmount amount) {
        this.amount = amount;
    }

    public Booking(final BookingInfo info) {
        this.hotelID = info.getHotelID();
        if (info.getAmount() == null || info.getUser() == null) {
            throw new InvalidParameterException("Invalid Amount in booking");
        }
        this.amount = new BookingAmount(info.getAmount().getCurrency(), info.getAmount().getPrice());
        this.user = new User(info.getUser().getName(), info.getUser().getEmail(), info.getUser().getPhoneCountryCode(), info.getUser().getPhoneNo());
        this.room = new ArrayList<>(this.room);
    }
}
