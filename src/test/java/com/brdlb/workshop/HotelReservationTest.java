package com.brdlb.workshop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    @Test
    public void hotelNameAndRateTest1() {

        Hotel hotel = new Hotel("Lakewood", 110);

        Assertions.assertEquals("Lakewood", hotel.getName());
        Assertions.assertEquals(110, hotel.getRate());
    }
    @Test
    public void hotelNameAndRateTest2() {

        Hotel hotel1 = new Hotel("Bridgewood", 160);

        Assertions.assertEquals("Bridgewood", hotel1.getName());
        Assertions.assertEquals(160, hotel1.getRate());
    }
    @Test
    public void hotelNameAndRateTest3() {

        Hotel hotel2 = new Hotel("Ridgewood", 220);

        Assertions.assertEquals("Ridgewood", hotel2.getName());
        Assertions.assertEquals(220, hotel2.getRate());
    }

}
