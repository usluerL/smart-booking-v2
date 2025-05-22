package com.byusluer.hotelservice.domain.model.room;

import com.byusluer.commoncore.contant.ValidationMessages;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Room {

   /* private final RoomId id;
    private final RoomNumber roomNumber;
    private RoomType type;
    private int capacity;
    private Set<Feature> features;
    private Map<Season, Money> prices;

    public Room(RoomId id, RoomNumber roomNumber, RoomType type, int capacity) {
        this.id = Objects.requireNonNull(id, ValidationMessages.Room.ROOM_ID_REQUIRED);
        this.roomNumber = Objects.requireNonNull(roomNumber, ValidationMessages.Room.ROOM_NUMBER_REQUIRED);
        this.type = Objects.requireNonNull(type, ValidationMessages.Room.ROOM_TYPE_REQUIRED);
        if (capacity <= 0) {
            throw new IllegalArgumentException(ValidationMessages.Room.CAPACITY_MUST_BE_POSITIVE);
        }

        this.capacity = capacity;
        this.features = new HashSet<>();
        this.prices = new HashMap<>();
    }

    public void addFeature(Feature feature) {
        features.add(feature);
    }

    public void removeFeature(Feature feature) {
        features.remove(feature);
    }

    public void setPrice(Season season, Money price) {
        prices.put(season, price);
    }

    public Optional<Money> getPriceFor(Season season) {
        return Optional.ofNullable(prices.get(season));
    }*/


}
