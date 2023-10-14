package com.template.ProjectTemplate.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.antlr.v4.runtime.misc.NotNull;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class Product implements Serializable {


    private final static long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private Double price;

    @NotNull
    @ManyToOne
    private Category category;


}
