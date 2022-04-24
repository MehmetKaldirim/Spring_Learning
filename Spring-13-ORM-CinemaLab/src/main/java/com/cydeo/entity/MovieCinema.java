package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@NoArgsConstructor
@Data
public class MovieCinema extends BaseEntity{

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate dateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="movie_id")
    private Movie movie;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="cinema_id")
    private Cinema cinema;


}
