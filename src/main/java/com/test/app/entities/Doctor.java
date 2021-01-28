package com.test.app.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "doctors")

public class Doctor {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private int identification_type;
    private String identification;
    private String professional_card;
    private int experience_years;
    private String speciality;
    private String start_time;
    private String end_time;
}
