# Hotel Booking API LLD with implementation

Multiple hotels across the globe and design a booking API to book the rooms

Customers for this API can be:
1. Own website
2. Aggregators

Requirements:
1. Booking rooms
2. Showing availability according to the hotel - Not in scope


Scale:
1. Scale is not is priority right now

Throttling is very important because aggregator is also in picture

AS of now focus on API and functionality and throttling can be taken up later

One Service with name: Booking Service


DataStore will be in InMemory no external data store

API:

RestAPI

MethodType: POST

URI: /api/v1/book/room

Request:

header : {
clientId: "",
requestID: "",
hash: ""
}

Body:

{
hotelID: "",
currency: "INR/USD/SGD",
rooms : [{
type: ""
adult:
kid:
additionalReq : {

      }
    }],
    user : {
    	name: "",
    	email : "",
    	phoneCountryCode : "",
    	phoneNumber: ""
    }

}

Response:

{
bookingId: "",
amount : {
currency: "",
amount:
},
code : "",// code can be success/failure
error : {
code: "",
message: ""
}
}

Use cases:

Validations:
filter:

1. syntax validations
2. Business validations - clientId is valid or not and hash -> based on clientID i will get the salt

Move to another layer called controller:
clientId(call external service/ In memory to validate) and reqId(unique) -> how?
hotelId -> call another service validation whether it's valid hotel or not and this hotel is given to this client or not

Server Startup:
1. Put Client information with salt in Memory - Have an expiry also
2. Health Checks for databases and dependent services - mandatory services
3. Hotel information can be put in memory - Have an Expiry also
4. I don't keep this mapping on server startup but what i prefer is to call external service and keep this in memory

Booking:
1. Price and Availability we have to take care in Booking service 



