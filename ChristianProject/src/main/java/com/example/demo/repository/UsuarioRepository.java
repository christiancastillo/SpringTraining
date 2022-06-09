package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.PersonaEntity;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository("usuariorepository")
public interface UsuarioRepository<PersonaEntity> extends JpaRepository<PersonaEntity, Serializable>{
	

}
