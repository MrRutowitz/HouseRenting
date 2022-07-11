package pl.houserenting.model;

import javax.persistence.*;


@Entity
public class Landlord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String surname;
    private String name;
    private int pesel;
    private String email;
    private int phoneNumber;


}
