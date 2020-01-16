package me.namila.RESTSpringTest.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter

public class PageDto {
    private Long pageCount;
    private List data;

    public PageDto(Long pageCount, List<?> data) {
        this.data = data;
        this.pageCount = pageCount;
    }
}
