package com.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Tarea;

@Repository
public interface AgendaRepository<Tarea, Long> {
	
	// Ejemplo de consulta personalizada para obtener las tareas completadas
    List<Tarea> findByCompletada(boolean completada);

}
