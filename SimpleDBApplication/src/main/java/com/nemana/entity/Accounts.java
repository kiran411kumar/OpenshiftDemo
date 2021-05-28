package com.nemana.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

@Data
@Entity(name = "Accounts")
@ToString
public class Accounts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer accountID;

    private String name;
    private String street;
    private String city;
    private String state;
    private String postal;
    private String country;
}
