package com.Diego.apimongo.repository;

import com.Diego.apimongo.documentos.Usuarios;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository <Usuarios, Integer>{


}
