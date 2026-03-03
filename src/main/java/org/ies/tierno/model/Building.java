package org.ies.tierno.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Building {

    private String address;
    private String city;
    private int zipCode;
    private List<Apartment> apartments;

    public void showApartments(){

    }

    /* public Apartment getApartment(int floor, String door){
        if (door.equals(null)){
            return null;
        }

        for (var apartment : apartments){

        }
    } */

}
