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
@Table(name = "reservateionMgmt")
public class reservationTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer number;
}
