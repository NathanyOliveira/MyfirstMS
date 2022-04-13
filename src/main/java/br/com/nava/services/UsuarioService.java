package br.com.nava.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.nava.entities.UsuarioEntity;
import br.com.nava.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void mostrar() {
		System.out.println("Mostrar");
	}
	
	public List<UsuarioEntity> getAll(){
		return usuarioRepository.findAll();
	}
	

	
	public UsuarioEntity getOne(int id) {
				return usuarioRepository.findById(id).orElse(new UsuarioEntity());
	}
	
	public UsuarioEntity save(UsuarioEntity usuario) {
		return usuarioRepository.save(usuario);		
	}

		
		
		public UsuarioEntity update(int id, UsuarioEntity usuario) {
			
			 //VERIFICAR SE O REGISTRO EXISTE
			Optional<UsuarioEntity> optional = usuarioRepository.findById(id);
		
			 //SE EXISTIR
			if(optional.isPresent() == true) {
				//PEGAR O OBJETO DENTRO O OPTIONAL VINDO DO BANCO E SETO COM O VALOR DE ENTRADA NO PARAMETRO DA FUNÇÃO
				UsuarioEntity usuarioBD = optional.get();
				usuarioBD.setNome(usuario.getNome());
				usuarioBD.setEmail(usuario.getEmail());
				
				return usuarioRepository.save(usuarioBD);
			}
		
			else {
				return new UsuarioEntity();
			}
		}
		
		
		public void delete(int id) {
			usuarioRepository.deleteById(id);
		}


}
