package com.ys.tddspringex.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

/**
 * packageName    : com.ys.tddspringex.user
 * fileName       : Users
 * author         : 조영상
 * date           : 4/21/25
 * description    : 자동 주석 생성
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/21/25         조영상        최초 생성
 */
@Entity
@Getter
@Builder
@AllArgsConstructor
@Table(name = "USERS")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true, length = 30)
    private String email;

    @Column(nullable = false)
    private String password;

    private String imgUrl;

    @Enumerated(EnumType.STRING)
    @JsonIgnore
    private PublicStatus publicStatus;

    private LocalDate createdAt;
}
