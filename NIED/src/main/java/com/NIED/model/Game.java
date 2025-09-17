package com.NIED.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "games")
public class Game {
    @Id
    private String id;
    private String name;
    private double price;
    private String description;
}