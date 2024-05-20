package com.e.commerce.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="users")
public class Users {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private UUID id;

        private String image;

        @Column(nullable = false, unique = true)
        private String email;

        @Column(nullable = false, unique = true)
        private String username;

        @Column(nullable = false)
        private String password;

        @Column(name = "first_name", nullable = false)
        private String firstName;

        @Column(name = "last_name", nullable = false)
        private String lastName;

        private String phone;

        @Column(name = "address_city")
        private String addressCity;

        @Column(name = "address_street")
        private String addressStreet;

        @Column(name = "address_number")
        private Integer addressNumber;

        @Column(name = "address_zipcode")
        private String addressZipcode;

}
