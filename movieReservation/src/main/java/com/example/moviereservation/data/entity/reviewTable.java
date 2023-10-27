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
@Table(name = "review")
public class reviewTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reviewNumber;
}
