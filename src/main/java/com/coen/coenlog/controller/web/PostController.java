package com.coen.coenlog.controller.web;

import com.coen.coenlog.domain.post.Post;
import com.coen.coenlog.dto.post.PostResponseDto;
import com.coen.coenlog.service.post.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/posts")
    public String posts (Model model) {
        model.addAttribute("postList", postService.getPosts());
        return "post/postList";
    }

    @GetMapping("/post/{postId}")
    public String post (Model model, @PathVariable Long postId) {
        model.addAttribute("post", postService.getPost(postId));
        return "post/post";
    }

}
