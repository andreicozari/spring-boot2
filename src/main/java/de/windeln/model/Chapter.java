package de.windeln.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Chapter {

    private String id;
    private String name;

    public Chapter(String name) {
        this.name = name;
    }
}
