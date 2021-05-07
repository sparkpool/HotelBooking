package services.intrface;

import models.common.Booking;
import models.common.BookingInfo;

public interface IBookingService {

    Booking book(BookingInfo info);
}
