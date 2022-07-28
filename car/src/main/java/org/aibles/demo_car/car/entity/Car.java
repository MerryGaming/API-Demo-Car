package org.aibles.demo_car.car.entity;

import javax.persistence.*;

@Entity
@Table(name = "car")

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;

    @Column(name ="name")
    private String name;

    @Column(name ="color")
    private String color;

    @Column(name ="date")
    private int date;

    @Column(name ="price")
    private float price;



}
