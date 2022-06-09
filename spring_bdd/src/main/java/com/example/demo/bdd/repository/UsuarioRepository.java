package com.example.demo.bdd.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bdd.entity.Usuario;

@Repository("usuariorepository") //nombre del bean
public interface UsuarioRepository extends JpaRepository<Usuario, Serializable>{

}
