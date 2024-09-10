package de.neuefische.java.cgnjava244springdata;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("products")
public record Product(
        @Id
        String id,
        String name
) {

}
