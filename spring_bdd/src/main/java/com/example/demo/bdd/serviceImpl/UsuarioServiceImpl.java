package com.example.demo.bdd.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.bdd.entity.Usuario;
import com.example.demo.bdd.repository.UsuarioRepository;
import com.example.demo.bdd.service.UsuarioService;

@Service("usuarioservice") //definicion del nombre del bean de esta clase
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	@Qualifier("usuariorepository") //aqui va el nombre del bean
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List<Usuario> listAllUsuario() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario addUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

}
