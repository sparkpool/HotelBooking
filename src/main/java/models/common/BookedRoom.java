package models.common;

import java.util.Date;

public class BookedRoom {

    private Room room;
    private Date fromDate;
    private Date toDate;

    public BookedRoom(Room room, Date fromDate, Date toDate) {
        this.room = room;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
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
