//작성완료_2023_10_28_최동규
package com.example.moviereservation.data.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "movieTime")
public class movieTimeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieInfoID;

    @Column(nullable = false)
    private Integer movieID;    //  movie 의 movieID참조

    @Column(nullable = false)
    private Integer theaterID;  //  theater 의 theaterID참조

    @Column(nullable = false)
    private LocalDateTime runningDay;

    @Column(nullable = false)
    private LocalDateTime startTime;

    @Column(nullable = false)
    private LocalDateTime endTime;
}