package com.example.moviereservation.data.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "movieInfo")
public class movieTable {
    @Id
    private Integer movieID;
}
