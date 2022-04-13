package br.com.nava.repositories;
import org.springframework.data.jpa.repository.JpaRepository;// HERANÇA TRAZENDO TODOS OS METODOS JÁ EXISTENTES NO JPA (CRUD)
import org.springframework.stereotype.Repository;

import br.com.nava.entities.ProfessorEntity; // IMPORTAR A ENTIDADE 

import org.springframework.stereotype.Repository;

import br.com.nava.entities.ProfessorEntity;



@Repository // CAMADA DE ACESSO AO BANCO    //  (ENTIDADE DE CLASSE, e o TIPO DA CHAVE PRIMARIAa)					
public interface ProfessorRepository extends JpaRepository<ProfessorEntity, Integer> {
	
	//ORM - OBJECT RELATIONAL MAPPING - MAPEAMENTO RELACIONAL DE OBJETOS
	
	
	}
