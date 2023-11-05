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
    private Integer reservationNumber; // 예매 번호

    @Column(nullable = false)
    private Integer movieInfoID; // movieTimetable moveInfoID참조

    @Column(nullable = false)
    private Integer seatNumber; // theaterTable의 seatNumber 참조
}
