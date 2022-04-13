package br.com.nava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nava.entities.VendaEntity;
import br.com.nava.repositories.VendaRepository;

@Service
public class VendaService {

	@Autowired
	private VendaRepository vendaRepository;
	
	public List<VendaEntity> getAll(){
		return vendaRepository.findAll();
	}
	
	public VendaEntity getOne(int id) {
		return vendaRepository.findById(id).orElse(new VendaEntity());
	}
	
	public VendaEntity save(VendaEntity venda) {
		
			return this.vendaRepository.save(venda);
	}
	
	public VendaEntity update(int id, VendaEntity novaVenda) {
		
		Optional<VendaEntity> optional = vendaRepository.findById(id);
		
		if (optional.isPresent()) {
			VendaEntity venda = optional.get();
			
			venda.setValorTotal( novaVenda.getValorTotal());
			
			return vendaRepository.save(venda);
		}else {
			return new VendaEntity();
		}
	}
	
	public void delete(int id) {
		vendaRepository.deleteById(id);
	}
}
