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
    private Integer reviewBoardNumber;

    @Column(nullable = false)
    private Integer reviewNumber; // reviewTable의 reviewNumber 참조

    @Column(nullable = false)
    private Integer userId; // userTable의 userId 참조

    @Column(nullable = false)
    private String reviewName; // 리뷰 제목

    @Column(nullable = false)
    private String reviewDetail; // 리뷰 내용

    @Column(nullable = false)
    private float movieEvaluation; // 영화 평가
}
