package com.coen.coenlog.service.post;

import com.coen.coenlog.domain.post.Post;
import com.coen.coenlog.service.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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
            throw new RuntimeException("데이터가 없어요.");
        }
        return postList;
    }

    public Post getPost(Long postId) {
        return postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("찾으시는 포스트가 사라졌어요."));
    }

}
