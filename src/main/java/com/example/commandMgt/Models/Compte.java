package com.example.commandMgt.Models;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type_CPT", discriminatorType=DiscriminatorType.STRING, length=2)
public abstract class Compte {
    @Id
    private String codeCompte;
    private Date dateCreation;
}
