package com.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Tarea {
	private String titulo;
    private String descripcion;
    private LocalDateTime fechaLimite;
    private boolean completada;
    
    // Getters y setters

}
