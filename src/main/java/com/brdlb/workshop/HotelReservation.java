package com.brdlb.workshop;

import java.util.ArrayList;
import java.util.List;

/**
 * WorkShop3 Program
 *
 * @author : AnjiRaj
 * @version : 16.0
 * @since : 26/10/2021
 * */

public class HotelReservation {
    /**
     * Create HotelReservation Class
     * create main method ,and welcome message
     *
     */
    public static void main(String args[]) {

        System.out.println("Welcome to hotel reservation system ");

    }

    /**
     * create List as Hotel
     * Assign to ArrayList
     * create the add method to add hotel
     *
     */

    private List<Hotel> hotels;

    public HotelReservation() {
        this.hotels = new ArrayList<Hotel>();
    }

    public void add(Hotel hotel) {
        this.hotels.add(hotel);

    }

    public List<Hotel> getHotelList() {
        return this.hotels;
    }
}
