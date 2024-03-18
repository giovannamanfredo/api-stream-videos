package com.api.stream.videos;

import com.api.stream.domain.Video;
import com.api.stream.domain.dtos.VideoDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/video")
public class VideoController {
    @Autowired
    private VideoService service;
    @GetMapping
    public List<Video> listVideos(){
        return service.listVideos();
    }

    @GetMapping("/{id}")
    public Optional<Video> getVideo(@PathVariable String id){
        return service.getVideoById(id);
    }

    @PostMapping
    public Video createVideo(@Valid @RequestBody Video video){
        return service.createVideo(video);
    }

    @PutMapping("/{id}")
    public void updateVideo(@PathVariable String id, @RequestBody VideoDto videoDto){
        return ;
    }

    @DeleteMapping("/{id}")
    public void deleteVideo(@PathVariable Long id){

    }
}
