package models.common;

import java.util.Objects;

public class Room {

    private String roomNo;
    private Double price;
    //Missed noOfPerson allowed plus kids
    private Integer noOfAdults;
    private Integer noOfKids;
    private String type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomNo.equals(room.roomNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNo);
    }

    public Room(String roomNo, Double price) {
        this.roomNo = roomNo;
        this.price = price;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
