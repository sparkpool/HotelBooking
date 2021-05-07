package models.common;

public class Hotel {

    private String hotelId;

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Hotel(String hotelId, String hotelName) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
    }

    private String hotelName;
    //Other information like: location and all
}
