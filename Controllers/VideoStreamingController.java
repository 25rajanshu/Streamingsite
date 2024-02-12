package Priyanshu.com.Streamingsite_inMemory.Controllers;

import Priyanshu.com.Streamingsite_inMemory.DTOs.ExceptionDto;
import Priyanshu.com.Streamingsite_inMemory.Exception.NotFoundException;
import  Priyanshu.com.Streamingsite_inMemory.Models.ReplaySection;

import Priyanshu.com.Streamingsite_inMemory.Models.User;
import Priyanshu.com.Streamingsite_inMemory.Models.Video;

import Priyanshu.com.Streamingsite_inMemory.Services.VideoStreamingService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VideoStreamingController {

  VideoStreamingService videoStreamingService;

    public VideoStreamingController(VideoStreamingService videoStreamingService) {
        this.videoStreamingService = videoStreamingService;
    }

    @PostMapping("/users")
    public void createUser(@RequestBody User user){
        videoStreamingService.createUser(user);
    }
    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable("userId") Long userid ) throws NotFoundException {

        return videoStreamingService.getUserById(userid);
    }

    @PostMapping("/videos")
    public void createVideo(@RequestBody Video video){
       videoStreamingService.createVideo(video);
    }


    @GetMapping("/videos/{videoId}")
    public Video getVideoById(@PathVariable("videoId") Long id){
        return videoStreamingService.getVideoById(id);
    }

    @PostMapping("/replay-sections")
    public void CreateReplaySection(@RequestBody ReplaySection replaySection){

        videoStreamingService.createReplaySection(replaySection);
    }

    @GetMapping("/replay-sections/{UserId}")
    public List<ReplaySection> getReplaySectionByUserId(@PathVariable("UserId") Long id)  {
        return videoStreamingService.getReplaySectionsByUserId(id);
    }
    @ExceptionHandler(NotFoundException.class)
   public ResponseEntity<ExceptionDto> handleNotFoundException
            (NotFoundException  notFoundException) {
        return new ResponseEntity<>
                (new ExceptionDto(HttpStatus.NOT_FOUND, notFoundException.getMessage()), HttpStatus.NOT_FOUND);
    }


}

