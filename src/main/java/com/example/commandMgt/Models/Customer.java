package com.example.commandMgt.Models;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.*;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @NonNull
    private String name;

    @OneToMany(mappedBy="custm",cascade = CascadeType.ALL)
    private Set<Command> commandes=new HashSet<>();
}


