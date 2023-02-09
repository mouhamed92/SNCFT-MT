package com.sncft.Billetterie.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Imprimante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_machine;
    private String num_inventaire;
    private String marque;
    private String etat;
    private String observations;
    private String interventions;

}
