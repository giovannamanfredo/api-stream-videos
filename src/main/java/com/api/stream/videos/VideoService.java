package com.api.stream.videos;

import com.api.stream.domain.Video;
import com.api.stream.domain.dtos.VideoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;
import java.util.Optional;

@Service
public class VideoService {
    @Autowired
    private VideoRepository repository;

    public List<Video> listVideos(){
        return repository.findAll();
    }
    public Optional<Video> getVideoById(String id){
        return repository.findById(id);
    }

    public Video createVideo(Video video) {
        return repository.save(video);

    }
//    public VideoDto updateVideo(String id, VideoDto videoDto) {
//        Video existVideo = repository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
//
//        existVideo.sey
//
//        Video updatedProduct = repository.save(existVideo);
//
//
//        return convertToDTO(updatedProduct);
//    }
//
//    private VideoDto convertToDTO(Video video) {
//        return new VideoDto(video.);
//    }

}
