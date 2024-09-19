package com.solibook.solibook.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "model1")
public class Model1 {
    @Id
    private String id;
    private String name;
    private int age;
    private String email;
}
