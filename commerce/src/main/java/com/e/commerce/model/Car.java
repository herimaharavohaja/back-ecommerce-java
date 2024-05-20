package com.e.commerce.model;

import com.e.commerce.model.enums.*;
import jakarta.persistence.*;

import java.util.UUID;

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Enumerated(EnumType.STRING)
    private CarCategory carCategory;
    @Enumerated(EnumType.STRING)
    private CarBrand carBrand;
    @Enumerated(EnumType.STRING)
    private MotorType motorType;
    private String image;
    @Column(columnDefinition = "TEXT")
    private String description;
    private Double price;
    @Enumerated(EnumType.STRING)
    private Color color;
    @Enumerated(EnumType.STRING)
    private AppointmentStatus appointmentStatus;

}
