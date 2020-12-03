package com.example.commandMgt.Models;


import javax.persistence.*;
//#free_Badreddine
@Entity
@DiscriminatorValue("CC")
public class CompteCC extends Compte {
    private double D;
}
