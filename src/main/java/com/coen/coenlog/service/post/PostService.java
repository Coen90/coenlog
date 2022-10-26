package com.coen.coenlog.service.post;

import com.coen.coenlog.domain.post.Post;
import com.coen.coenlog.dto.post.PostResponseDto;
import com.coen.coenlog.exception.EntityNotFoundException;
import com.coen.coenlog.exception.ErrorCode;
import com.coen.coenlog.repository.post.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {

    private final PostRepository postRepository;

    @Transactional
    public Post registerPost(Post post) {
        return postRepository.save(post);
    }

    public Post editPost(Post post) {
        return postRepository.save(post);
    }

    public List<Post> getPosts() {
        List<Post> postList = postRepository.findAll();
        if (postList == null) {
            throw new EntityNotFoundException(ErrorCode.POSTS_NOT_EXIST);
        }
        return postList;
    }

    public PostResponseDto getPost(Long postId) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new EntityNotFoundException(ErrorCode.POST_NOT_EXIST));
        return PostResponseDto.of(post);
    }

}
