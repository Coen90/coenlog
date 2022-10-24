package com.coen.coenlog.dto.post;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CreatePostDto {

    @NotBlank(message = "타이틀이 없어요.")
    private String title;
    @NotBlank(message = "내용이 없어요.")
    private String content;

    @Builder
    public CreatePostDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
