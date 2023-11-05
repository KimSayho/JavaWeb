package com.example.moviereservation.data.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalTime;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieID; // primary key

    @Column(nullable = false)
    private String movieName; // 영화 이름

    @Column(nullable=false)
    private String movieRated; // 영화 등급

    @Column(nullable=false)
    private String movieGenre; // 영화 장르

    @Column(nullable=false)
    private String movieActor; // 영화 배우

    @Column(nullable = false)
    private String movieDirector; // 영화 감독

    @Column(nullable=false)
    private String movieStory; // 영화 줄거리

    @Column(nullable=false)
    private LocalTime movieTime; // 영화 상영 시간

    @Column(nullable=false)
    private float movieScore; // 영화 평점
}
