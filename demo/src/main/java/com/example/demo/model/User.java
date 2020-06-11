package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "info")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "passport")
    private String passport;

}
