package com.examle.testsws.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String email;
    private String surname;
    private String name;
    private String patronymic;
    private String telephone;

    public User() {
    }

    public User(String email, String surname, String name, String patronymic, String telephone) {
        this.email = email;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getTelephon() {
        return telephone;
    }

    public void setTelephon(String telephon) {
        this.telephone = telephon;
    }
}
