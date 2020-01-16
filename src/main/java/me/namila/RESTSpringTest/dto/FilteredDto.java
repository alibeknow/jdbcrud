package me.namila.RESTSpringTest.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FilteredDto {
    public String id;
    public String value;

    public FilteredDto() {

    }

    public FilteredDto(String id, String value){
        this.id = id;
        this.value = value;
    }

}
