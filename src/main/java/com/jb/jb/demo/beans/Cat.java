package com.jb.jb.demo.beans;

import lombok.*;
import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 40)
    private String name;

    private float weight;



    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @Singular
    private List<Toy> toysList = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private Color color;

    public Cat(String name, float weight, List<Toy> toysList, Color color) {
        this.name = name;
        this.weight = weight;
        this.toysList = toysList;
        this.color = color;
    }
}
