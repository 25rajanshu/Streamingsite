package Priyanshu.com.Streamingsite_inMemory.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;



public class Video {
    private Long videoId;

    private String title;


    private int duration;

    public Video(Long id, String title, int duration) {
        this.videoId = id;

        this.title = title;
        this.duration = duration;
    }
    @JsonProperty("videoId")
    public Long getId() {
        return videoId;
    }

    public void setId(Long id) {
        this.videoId = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int  duration) {
        this.duration = duration;
    }
}
