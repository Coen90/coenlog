package com.coen.coenlog;

import com.coen.coenlog.domain.post.Post;
import com.coen.coenlog.repository.post.PostRepository;
import com.coen.coenlog.service.post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CoenlogApplication implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private PostRepository postRepository;

    public static void main(String[] args) {
        SpringApplication.run(CoenlogApplication.class, args);
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        List<Post> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Post("포스팅title" + i, "포스팅Content" + i));
        }
        postRepository.saveAll(list);
    }
}
