package de.windeln.model;

import lombok.Data;

@Data
public class Chapter {

    private String id;
    private String name;

    public Chapter(String name) {
        this.name = name;
    }
}
