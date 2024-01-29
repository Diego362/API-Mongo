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
@Document(collection = "usuarios")
public class Usuarios {



    @Id
    private int id;

    private String nombre;

    private String email;

}
