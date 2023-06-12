package com.example.denariappspringboot.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column (nullable = false)
    private String firstName;
    @Column
    private String middleName;
    @Column (nullable = false)
    private String lastName;
    @Column (nullable = false)
    private String email;
    @Column (nullable = false)
    private String SSN;
    @Column (nullable = false)
    private String DOB;
    @Column (nullable = false)
    private String phoneNumber;
    @Column (nullable = false)
    private String street;
    @Column
    private String appt_number;
    @Column (nullable = false)
    private String city;
    @Column (nullable = false)
    private String state;
    @Column
    private String postal_code;
    @Column (nullable = false)
    private String monthly_rent;
    @Column (nullable = false)
    private String moveIn_date;
    @Column
    private String moveOut_date;


    public User(User copy) {
        id = copy.id; // This line is SUPER important! Many things won't work if it's absent
        firstName = copy.firstName;
        middleName = copy.middleName;
        lastName = copy.lastName;
        email = copy.email;
        SSN = copy.SSN;
        DOB = copy.DOB;
        phoneNumber = copy.phoneNumber;
        street = copy.street;
        appt_number = copy.appt_number;
        city = copy.city;
        state = copy.state;
        postal_code = copy.postal_code;
        monthly_rent = copy.monthly_rent;
        moveIn_date = copy.moveIn_date;
        moveOut_date = copy.moveOut_date;
    }

    public User(long id, String firstName, String lastName, String email, String SSN, String DOB, String phoneNumber,
                String street, String appt_number, String city, String state, String postal_code, String monthly_rent, String moveIn_date, String moveOut_date, String form_payment) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.SSN = SSN;
        this.DOB = DOB;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.appt_number = appt_number;
        this.city = city;
        this.state = state;
        this.postal_code = postal_code;
        this.monthly_rent = monthly_rent;
        this.moveIn_date = moveIn_date;
        this.moveOut_date = moveOut_date;
    }
    public User() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAppt_number() {
        return appt_number;
    }

    public void setAppt_number(String appt_number) {
        this.appt_number = appt_number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getMonthly_rent() {
        return monthly_rent;
    }

    public void setMonthly_rent(String monthly_rent) {
        this.monthly_rent = monthly_rent;
    }

    public String getMoveIn_date() {
        return moveIn_date;
    }

    public void setMoveIn_date(String moveIn_date) {
        this.moveIn_date = moveIn_date;
    }

    public String getMoveOut_date() {
        return moveOut_date;
    }

    public void setMoveOut_date(String moveOut_date) {
        this.moveOut_date = moveOut_date;
    }

}
