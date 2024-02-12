package Priyanshu.com.Streamingsite_inMemory.Repositories;

import Priyanshu.com.Streamingsite_inMemory.Models.Video;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository

public class VideoRepository {
    HashMap<Long, Video> videos = new HashMap<>();

    public void save(Video video){
        videos.put(video.getId(),video);
    }
    public Video findById(Long id){
        return videos.get(id);
    }
}
