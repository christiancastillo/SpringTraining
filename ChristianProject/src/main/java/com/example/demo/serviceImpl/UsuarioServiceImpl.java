package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PersonaEntity;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.service.UsuarioService;

@Service("usuarioservice")
public class UsuarioServiceImpl implements UsuarioService{
	@Autowired
	@Qualifier("usuariorepository")
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List listAllUsers() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}

	@Override
	public PersonaEntity addUsuario(PersonaEntity usuario) {
		// TODO Auto-generated method stub
		return (PersonaEntity) usuarioRepository.save(usuario);
	}
	
}
