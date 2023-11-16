package models;

import lombok.Data;

@Data
public class PersonalDetailsPojo {
    private String lastName;
    private String dateOfBirth;
    private String country;
    private String city;
    private String street;
    private String streetNumber;
    private String flat;
    private String zipCode;
    private String phoneNumber;
}
