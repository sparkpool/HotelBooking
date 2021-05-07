package models.common;

import models.api.req.BookingRoom;
import models.api.req.User;
import models.api.res.BookingAmount;

import java.util.List;

public class BookingInfo {
    @Override
    public String toString() {
        return "BookingInfo{" +
                "hotelID='" + hotelID + '\'' +
                ", currency='" + currency + '\'' +
                ", room=" + room +
                ", user=" + user +
                '}';
    }

    public BookingAmount getAmount() {
        return amount;
    }

    public void setAmount(BookingAmount amount) {
        this.amount = amount;
    }

    private String hotelID;
    private String currency;
    private List<BookingRoom> room;
    private User user;
    private BookingAmount amount;

    public String getHotelID() {
        return hotelID;
    }

    public void setHotelID(String hotelID) {
        this.hotelID = hotelID;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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
}
