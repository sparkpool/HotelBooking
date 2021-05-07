package models.api.req;

import models.api.Header;

import java.util.Date;
import java.util.List;

public class BookingRequest {
    public BookingRequest(Header header, String hotelID, String currency, List<BookingRoom> room, User user, Date fromDate, Date toDate) {
        this.header = header;
        this.hotelID = hotelID;
        this.currency = currency;
        this.room = room;
        this.user = user;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    private Header header;
    private String hotelID;
    private String currency;
    private List<BookingRoom> room;
    private User user;
    private Date fromDate;
    private Date toDate;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

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

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
