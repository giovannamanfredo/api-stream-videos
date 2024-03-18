package com.api.stream.videos;

import com.api.stream.domain.Video;
import com.api.stream.domain.dtos.PaginationDTO;
import com.api.stream.domain.dtos.VideoDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/video")
public class VideoController {
    @Autowired
    private VideoService service;
    @GetMapping
    public PaginationDTO listVideos(
            @RequestParam(value = "title", required = false) String title,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size){

        Pageable pageable = PageRequest.of(page, size);
        Specification<Video> spec = Specification.where(null );
        return service.listVideos(pageable, spec);
    }

//    @GetMapping("/{id}")
//    public Optional<VideoDto> getVideo(@PathVariable String id){
//        return service.getVideoById(id);
//    }

//    @PostMapping
//    public Video createVideo(@Valid @RequestBody Video video){
//        return service.createVideo(video);
//    }
//
//    @PutMapping("/{id}")
//    public void updateVideo(@PathVariable String id, @RequestBody VideoDto videoDto){
//        return ;
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteVideo(@PathVariable Long id){
//
//    }
}
