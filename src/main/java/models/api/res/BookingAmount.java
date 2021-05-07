package models.api.res;

public class BookingAmount {

    private String currency;
    private Double price;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public BookingAmount(String currency, Double price) {
        this.currency = currency;
        this.price = price;
    }
}
