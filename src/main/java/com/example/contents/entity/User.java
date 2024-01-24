package com.example.contents.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Entity
@Table(name = "user_table")
@EqualsAndHashCode
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // UserRepository 단위에서 중복 이름을 허용하지 않는
    // 요구사항을 만족하려면 UNIQUE INDEX가 필요하다.
    @Column(unique = true)
    private String username;
    private String email;
    @Setter
    private String phone;
    @Setter
    private String bio;
    @Setter
    private String avatar;

    public User(String username, String email, String phone, String bio) {
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.bio = bio;
    }
}
