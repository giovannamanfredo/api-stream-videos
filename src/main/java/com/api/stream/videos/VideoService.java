package com.api.stream.videos;

import com.api.stream.domain.Video;
import com.api.stream.domain.dtos.PaginationDTO;
import com.api.stream.domain.dtos.VideoDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VideoService {
    @Autowired
    private VideoRepository repository;

    public VideoDto convertToVideoDTO(Video video) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(video, VideoDto.class);
    }

    public List<VideoDto> convertListToDTO(List<Video> videos) {
        return videos.stream()
                .map(this::convertToVideoDTO)
                .collect(Collectors.toList());
    }

    public PaginationDTO listVideos(Pageable pageable, Specification<Video> specification){
        Page<Video> videos = repository.findAll(pageable);
        List<VideoDto> dtos = convertListToDTO(videos.toList());
        return new PaginationDTO(dtos,videos.getTotalPages(),videos.getNumberOfElements(),videos.getNumber(), videos.getSize());
    }

//    public Video createVideo(Video video) {
//        return repository.save(video);
//
//    }
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
