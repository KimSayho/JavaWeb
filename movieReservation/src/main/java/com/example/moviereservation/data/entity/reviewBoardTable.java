package com.example.moviereservation.data.entity;

import lombok.*;
import org.springframework.data.relational.core.sql.In;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "BoardMgmt")
public class reviewBoardTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer number;
}
