package com.sncft.Billetterie.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Gare {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_gare ;
    private String nom_gare ;
}
