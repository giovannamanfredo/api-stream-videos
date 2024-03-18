package com.api.stream.domain.dtos;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record VideoDto(
        @NotNull
         String title,
         String description,
         String url,
         LocalDateTime created_at
) {
    public VideoDto() {
        this(null, null, null,null);
    }
}

