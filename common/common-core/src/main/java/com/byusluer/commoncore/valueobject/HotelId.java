package com.byusluer.commoncore.valueobject;

import com.byusluer.commoncore.contant.ValidationMessages;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public record HotelId(UUID value) implements Serializable {
    public HotelId(UUID value) {
        this.value = Objects.requireNonNull(value, ValidationMessages.Hotel.HOTEL_ID_REQUIRED);
    }

    public static HotelId generate() {
        return new HotelId(UUID.randomUUID());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HotelId hotelId)) return false;
        return value.equals(hotelId.value);
    }

    @Override
    public String toString() {
        return value.toString();
    }

}
