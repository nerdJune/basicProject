package io.jh.main.model;


import jakarta.persistence.*;
import lombok.Getter;

import java.time.OffsetDateTime;

@Getter
@Entity(name = "member")

public class MemberVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "email")
    private String email;

    @Column(name = "join_date")
    private OffsetDateTime joinDate;

    @Column(name = "last_login_date")
    private OffsetDateTime lastLoginDate;
}
