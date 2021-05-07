package controller;

import controller.base.BaseController;
import models.api.req.BookingRequest;
import models.api.res.BookingResponse;

public class BookingController extends BaseController {


    //Spring boot annotation map it with API
    public BookingResponse book(BookingRequest request) {
        //Call Validator Service to validate client and requestID
        return null;
    }
}
