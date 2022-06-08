package com.example.demo.service;

import java.util.List;

public interface UsuarioService<PersonaEntity> {
	public abstract List<PersonaEntity> listAllUsers();
	public abstract PersonaEntity addUsuario(PersonaEntity usuario);
	public abstract com.example.demo.entity.PersonaEntity addUsuario(com.example.demo.entity.PersonaEntity usuario);
}
