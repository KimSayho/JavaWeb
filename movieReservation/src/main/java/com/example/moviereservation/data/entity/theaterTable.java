package com.example.moviereservation.data.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "theaterInfo")
public class theaterTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reviewNumber;

    @Column(nullable = false)
    private Integer movieID;    //  movie 의 movieID 참조

    @Column(nullable = false)
    private String movieName; // movie 의 movieName 참조
}
