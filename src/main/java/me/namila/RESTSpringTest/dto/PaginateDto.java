package me.namila.RESTSpringTest.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PaginateDto {
    public Integer page = 1;
    public Integer pageSize = 10;
    List<SortedDto> sorted;
    List<FilteredDto> filtered;
}
