package com.example.CursoSpring.Services;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

public class RepositoryTestRodri {
	
	//TODO DECLARAR EL REPOSITORIO COMO ATRIBUTO DE CLASE
	//TODO INYECTAR POR CONTRUCTOR EL REPOSITORIO
	@EventListener(ApplicationReadyEvent.class)
	public void TesteandoRepo() {
		
	}
}
