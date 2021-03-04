package com.nemana.model;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="CUSTOMERNAME", columnDefinition = "name")
    private String customerName="";
    private String effectiveDate;
    private String description;
    private String status;
}
