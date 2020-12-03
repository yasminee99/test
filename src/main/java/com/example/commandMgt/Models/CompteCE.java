package com.example.commandMgt.Models;


import javax.persistence.*;

@Entity
@DiscriminatorValue("CE")
public class CompteCE extends Compte{
private double E;
}
