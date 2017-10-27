package io.javabrains.springboot.service;

import io.javabrains.springboot.controller.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService
{
    private List<Topic> topics =  new ArrayList<Topic>();

    TopicService()
    {
        topics.add(new Topic("spring","Spring Framework","Spring Framework Description"));
        topics.add(new Topic("java","Core Java","Core Java Description"));
        topics.add(new Topic("javascript","JavaScript","JavaSCript Description"));
    }

    public List<Topic> getAllTopics()
    {
        return topics;
    }

    public Topic getTopic(String id)
    {
        for(Topic t: topics)
        {
            if(t.getId().equals(id))
            {
                return t;
            }
        }

        return null;
    }

    public void addTopic(Topic topic)
    {
        topics.add(topic);
    }

    public void updateTopics(String id, Topic topic)
    {
        for(int i = 0; i < topics.size(); i++)
        {
            if(topics.get(i).getId().equals(id))
            {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void delteTopic(String id)
    {
        for(Topic t: topics)
        {
            if(t.getId().equals(id))
            {
                topics.remove(t);
                break;
            }
        }
    }
}
