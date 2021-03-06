package pl.houserenting.model;

import javax.persistence.*;
import java.util.Date;

public class RentalDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long prize;
    private Date rentalPeriod;

    @ManyToOne
    private Landlord landlord;

    @ManyToOne
    private Flat flat;

    public RentalDetails() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrize() {
        return prize;
    }

    public void setPrize(Long prize) {
        this.prize = prize;
    }

    public Date getRentalPeriod() {
        return rentalPeriod;
    }

    public void setRentalPeriod(Date rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }

    public Landlord getLandlord() {
        return landlord;
    }

    public void setLandlord(Landlord landlord) {
        this.landlord = landlord;
    }

    public Flat getFlat() {
        return flat;
    }

    public void setFlat(Flat flat) {
        this.flat = flat;
    }
}
