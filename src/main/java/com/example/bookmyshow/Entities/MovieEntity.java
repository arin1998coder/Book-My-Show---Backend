package com.example.bookmyshow.Entities;

import com.example.bookmyshow.Enum.Genre;
import com.example.bookmyshow.Enum.Language;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movies")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true,nullable = false)
    private String movieName;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    private double rating;

    private int duration;

    @Enumerated(EnumType.STRING)
    private Language language;

    @OneToMany(mappedBy = "movieEntity",cascade = CascadeType.ALL)
    private List<ShowEntity> showEntityList = new ArrayList<>();

}
