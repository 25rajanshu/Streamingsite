package Priyanshu.com.Streamingsite_inMemory.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReplaySection {
    private long id;

    private User user;

    private Video video;


    private int startSecond;


    private int endSecond;

    public ReplaySection() {
        // Default constructor for Jackson deserialization
    }

    public ReplaySection(User user, Video video, int startSecond, int endSecond) {
        this.user = user;
        this.video = video;
        this.startSecond = startSecond;
        this.endSecond = endSecond;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public int getStartSecond() {
        return startSecond;
    }

    public void setStartSecond(int startSecond) {
        this.startSecond = startSecond;
    }

    public int getEndSecond() {
        return endSecond;
    }

    public void setEndSecond(int endSecond) {
        this.endSecond = endSecond;
    }
}