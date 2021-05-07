package models.api.req;


import java.util.Date;
import java.util.Map;

public class BookingRoom {

    public BookingRoom(Integer noOfAdults, Integer noOfKids, Map<String, String> additionalReq) {
        this.noOfAdults = noOfAdults;
        this.noOfKids = noOfKids;
        this.additionalReq = additionalReq;
    }

    public Integer getNoOfAdults() {
        return noOfAdults;
    }

    public void setNoOfAdults(Integer noOfAdults) {
        this.noOfAdults = noOfAdults;
    }

    public Integer getNoOfKids() {
        return noOfKids;
    }

    public void setNoOfKids(Integer noOfKids) {
        this.noOfKids = noOfKids;
    }

    public Map<String, String> getAdditionalReq() {
        return additionalReq;
    }

    public void setAdditionalReq(Map<String, String> additionalReq) {
        this.additionalReq = additionalReq;
    }

    //We will have JSON annotations to parse with exact name from the API
    private Integer noOfAdults;
    private Integer noOfKids;
    private Map<String, String> additionalReq;
    private Date fromDate;
    private Date toDate;

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
