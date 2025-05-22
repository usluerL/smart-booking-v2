package com.byusluer.hotelservice.domain.model.hotel;

import com.byusluer.commoncore.contant.ValidationMessages;

import java.util.Objects;

public record Address(String street, String city, String country) {

    public Address(String street, String city, String country) {
        this.street = Objects.requireNonNull(street, ValidationMessages.Address.STREET_REQUIRED);
        this.city = Objects.requireNonNull(city, ValidationMessages.Address.CITY_REQUIRED);
        this.country = Objects.requireNonNull(country, ValidationMessages.Address.COUNTRY_REQUIRED);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address(String street1, String city1, String country1))) return false;
        return street.equals(street1) &&
                city.equals(city1) &&
                country.equals(country1);
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + country;
    }

}
