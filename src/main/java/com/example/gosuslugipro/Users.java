//package com.example.gosuslugipro;
//import jakarta.persistence.*;
//@Entity
//public class Users {
//    private int ID;
//    private String FirstName;
//    private String LastName;
//    private float Av;
//    private String City;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//        public int getID() {return ID;}
//        public void setID(int ID) {
//            this.ID = ID;
//        }
//        public String getFirstName() {return FirstName;}
//        public void setFirstName(String FirstName) {this.FirstName = FirstName;}
//        public String getLastName() {return LastName;}
//        public void setLastName(String LastName) {this.LastName = LastName;}
//        public String getCity() {return City;}
//        public void setCity(String City) {this.City = City;}
//        public float getAv() {return Av;}
//        public void setAv(float Av) {
//            this.Av = Av;
//        }
//}



package com.example.gosuslugipro;

import jakarta.persistence.*;

@Entity
public class Users {
    private int ID;
    private String firstName;
    private String lastName;
    private float av;
    private String city;
    private String email;
    private String service;
    private String appointmentDate;
    private String appointmentTime;
    private String appointmentAddress;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getAv() {
        return av;
    }

    public void setAv(float av) {
        this.av = av;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getAppointmentAddress() {
        return appointmentAddress;
    }

    public void setAppointmentAddress(String appointmentAddress) {
        this.appointmentAddress = appointmentAddress;
    }
}