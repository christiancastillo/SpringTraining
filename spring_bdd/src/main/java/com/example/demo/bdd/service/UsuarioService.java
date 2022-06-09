package com.example.demo.bdd.service;

import java.util.List;

import com.example.demo.bdd.entity.Usuario;

public interface UsuarioService {
	public abstract List<Usuario> listAllUsuario();
	public abstract Usuario addUsuario(Usuario usuario);
}
