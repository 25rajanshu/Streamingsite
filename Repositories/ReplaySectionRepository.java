package Priyanshu.com.Streamingsite_inMemory.Repositories;

import Priyanshu.com.Streamingsite_inMemory.Models.ReplaySection;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Repository

public class ReplaySectionRepository {

    private final HashMap<Long, ReplaySection> replaySections = new HashMap<>();
    private long nextId = 1;

    public void save(ReplaySection replaySection) {
        long id = nextId++;
        replaySection.setId(id);
        replaySections.put(id, replaySection);


    }

    public List<ReplaySection> findByUserId(Long userid){
        List<ReplaySection> UserReplaySections = new ArrayList<>();
        for(ReplaySection section : replaySections.values()){
         if(section.getUser().getUserid().equals(userid))
          {
              UserReplaySections.add(section);

          }

        }
        return UserReplaySections;

    }

}
