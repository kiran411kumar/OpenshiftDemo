package com.nemana.entity;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity(name = "Accounts")
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
