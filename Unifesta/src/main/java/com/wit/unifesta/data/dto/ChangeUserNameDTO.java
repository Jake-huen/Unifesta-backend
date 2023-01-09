package com.wit.unifesta.data.dto;

public class ChangeUserNameDTO {

    private Long id;
    private String name;

    public ChangeUserNameDTO(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public ChangeUserNameDTO(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
