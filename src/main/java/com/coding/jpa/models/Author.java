package com.coding.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Author {
    @Id
    @GeneratedValue
    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private int age;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

    @OneToMany(mappedBy = "author_publication")
    private List<Book> publications;

}
