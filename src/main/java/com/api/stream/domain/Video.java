package com.api.stream.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "videos")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String uuid;

    private  String title;

    private String description;

    private String url;

    private LocalDateTime created_at;



}
