package io.javabrains.springbootstarter.topic;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @RequestMapping("/Topics")
    public List<Topic> getAllTopics()
    {
        return Arrays.asList(
                new Topic("spring","Spring Framework","Spring Framework Description"),
                new Topic("Java","Core Java","Core Java Description"),
                new Topic("javascript","Javascript","Javascript Description")
        );
    }
}
