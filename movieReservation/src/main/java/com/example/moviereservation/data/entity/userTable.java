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
@Table(name = "user")
public class userTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
