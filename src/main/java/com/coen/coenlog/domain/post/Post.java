package com.coen.coenlog.domain.post;

import com.coen.coenlog.domain.base.BaseEntity;
import com.coen.coenlog.domain.member.Member;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "post")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @Column
    private String title;

    @Lob
    private String content;

    @Builder
    public Post (String title, String content) {
        this.title = title;
        this.content = content;
    }

}
