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
    private Long userId; // 회원 ID

    @Column(nullable = false)
    private String password; // 회원 계정 비밀번호

    @Column(nullable = false)
    private String nickname; // 회원 계정 닉네임

    @Column(nullable = false)
    private String Pnum; // 회원 전화번호
}
