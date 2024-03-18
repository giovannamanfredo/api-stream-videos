package com.api.stream.videos;

import com.api.stream.domain.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,String> {
}
