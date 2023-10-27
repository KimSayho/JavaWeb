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
    private Integer theaterID;
}
