package com.api.stream.domain.dtos;

import java.util.List;

public record PaginationDTO(
        List<?> data,
        int totalPages,
        long totalElements,
        int currentPage,
        int pageElementsSize
) {
    public PaginationDTO(){
        this(null, 0, 0,0,0);
    }
}
