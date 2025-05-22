package com.byusluer.commoncore.contant;

public class ValidationMessages {

    public static final class Address {
        public static final String STREET_REQUIRED = "Street is required";
        public static final String CITY_REQUIRED = "City is required";
        public static final String COUNTRY_REQUIRED = "Country is required";
    }

    public static final class Hotel {
        public static final String HOTEL_ID_REQUIRED = "HotelId is required";
        public static final String HOTEL_NAME_REQUIRED = "Hotel name is required";
    }

    public static final class Room {
        public static final String ROOM_NUMBER_REQUIRED = "Room number is required";
        public static final String ROOM_TYPE_REQUIRED = "Room type is required";
        public static final String ROOM_ID_REQUIRED = "RoomId is required";
        public static final String CAPACITY_MUST_BE_POSITIVE = "Capacity must be greater than zero";


    }
}
