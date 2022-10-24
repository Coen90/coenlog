package com.coen.coenlog.dto.post;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@ToString
@NoArgsConstructor
public class EditPostDto {

    @NotBlank(message = "타이틀이 없어요.")
    private String title;
    @NotBlank(message = "내용이 없어요.")
    private String content;

    @Builder
    public EditPostDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
