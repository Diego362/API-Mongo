package com.Diego.apimongo.documentos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@AllArgsConstructor
@Document(collation = "Usuarios")
public class Usuarios {



    @Id
    private int id;

    @Field
    private String nombre;

    @Field
    private String email;

}
