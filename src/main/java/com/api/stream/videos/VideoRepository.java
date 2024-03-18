package com.api.stream.videos;

import com.api.stream.domain.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VideoRepository extends JpaRepository<Video,String>, JpaSpecificationExecutor<Video> {
}
