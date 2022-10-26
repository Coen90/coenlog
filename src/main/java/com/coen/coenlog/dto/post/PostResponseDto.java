package com.coen.coenlog.dto.post;

import com.coen.coenlog.domain.post.Post;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class PostResponseDto {

    private Long postId;

    private String title;

    private String content;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;

    public static PostResponseDto of(Post post) {
        return PostResponseDto.builder()
                .postId(post.getPostId())
                .title(post.getTitle())
                .content(post.getContent())
                .title(post.getTitle())
                .createBy(post.getCreateBy())
                .createTime(post.getCreateTime())
                .updateBy(post.getUpdateBy())
                .updateTime(post.getUpdateTime())
                .build();
    }
}
