package pl.houserenting.model;

import javax.persistence.*;

@Entity
public class Flat {

    public Flat() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String streetName;
    private int flatNumber;
    private int flatSize;
    private int roomsNumber;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public int getFlatSize() {
        return flatSize;
    }

    public void setFlatSize(int flatSize) {
        this.flatSize = flatSize;
    }

    public int getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(int roomsNumber) {
        this.roomsNumber = roomsNumber;
    }
//
//    public Landlord getLandlord() {
//        return landlord;
//    }
//
//    public void setLandlord(Landlord landlord) {
//        this.landlord = landlord;
//    }
}
