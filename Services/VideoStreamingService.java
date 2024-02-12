package Priyanshu.com.Streamingsite_inMemory.Services;

import Priyanshu.com.Streamingsite_inMemory.Exception.NotFoundException;
import Priyanshu.com.Streamingsite_inMemory.Models.ReplaySection;
import Priyanshu.com.Streamingsite_inMemory.Models.User;
import Priyanshu.com.Streamingsite_inMemory.Models.Video;
import Priyanshu.com.Streamingsite_inMemory.Repositories.ReplaySectionRepository;
import Priyanshu.com.Streamingsite_inMemory.Repositories.UserRepository;
import Priyanshu.com.Streamingsite_inMemory.Repositories.VideoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class VideoStreamingService {
    ReplaySectionRepository replaySectionRepository;
    UserRepository userRepository;
    VideoRepository videoRepository;

    public VideoStreamingService(ReplaySectionRepository replaySectionRepository,
                                 UserRepository userRepository,
                                 VideoRepository videoRepository) {
        this.replaySectionRepository = replaySectionRepository;
        this.userRepository = userRepository;
        this.videoRepository = videoRepository;
    }
    public void createUser(User user){
        userRepository.save(user);
    }
    public User getUserById(Long userid) throws NotFoundException {

        if(userRepository.FindById(userid)==null){
     throw  new NotFoundException("user with" + userid + " not found");
        }
        return userRepository.FindById(userid);
    }
    public void createVideo(Video video){
       videoRepository.save(video);
    }
    public Video getVideoById(Long videoId) {
        return videoRepository.findById(videoId);
    }
    public void createReplaySection(ReplaySection replaySection) {
        replaySectionRepository.save(replaySection);
    }
    public List<ReplaySection> getReplaySectionsByUserId(Long userId)  {
     /*  List<ReplaySection> replaySections=replaySectionRepository.findByUserId(userId);
       if(replaySections==null){
           throw new NotFoundException("product with" + userId + " not found");
       }
       return replaySections;*/
        return replaySectionRepository.findByUserId(userId);

    }
}
