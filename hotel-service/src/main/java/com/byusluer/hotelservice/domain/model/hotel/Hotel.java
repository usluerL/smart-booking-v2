package com.byusluer.hotelservice.domain.model.hotel;

import com.byusluer.commoncore.valueobject.HotelId;
import com.byusluer.hotelservice.domain.model.room.Room;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private final HotelId id;
    private String name;
    private Address address;
    private List<Room> rooms;
    private HotelStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public Hotel(HotelId id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.rooms = new ArrayList<>();
        this.status = HotelStatus.ACTIVE;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

}
