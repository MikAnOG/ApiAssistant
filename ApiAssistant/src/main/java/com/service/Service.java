package com.service;

import java.time.LocalDateTime;
import java.util.List;

import com.model.Agenda;
import com.model.Tarea;

//@Service
@org.springframework.stereotype.Service
public class Service {
	
	// Agenda para almacenar las tareas de forma interna (en memoria).
    private Agenda agenda;

    // Constructor que inicializa la agenda.
    public Service() {
        this.agenda = new Agenda();
    }

    /**
     * Método para obtener la hora actual.
     *
     * @return La fecha y hora actual en formato ISO.
     */
    public String obtenerHora() {
        return LocalDateTime.now().toString();
    }

    /**
     * Método para crear una nueva tarea y agregarla a la agenda.
     *
     * @param titulo      Título de la tarea.
     * @param descripcion Descripción de la tarea.
     * @param fechaLimite Fecha límite para la tarea.
     * @return La tarea creada.
     */
    public Tarea crearTarea(String titulo, String descripcion, LocalDateTime fechaLimite) {
        Tarea nuevaTarea = new Tarea();
        nuevaTarea.setTitulo(titulo);
        nuevaTarea.setDescripcion(descripcion);
        nuevaTarea.setFechaLimite(fechaLimite);
        nuevaTarea.setCompletada(false);
        agenda.agregarTarea(nuevaTarea);
        return nuevaTarea;
    }

    /**
     * Método para obtener todas las tareas de la agenda.
     *
     * @return Una lista con todas las tareas.
     */
    public List<Tarea> obtenerTareas() {
        return agenda.getTareas();
    }

    /**
     * Método para marcar una tarea como completada, identificada por su índice en la lista.
     *
     * @param index Posición de la tarea en la lista.
     * @return true si la tarea se marca como completada, false si el índice es inválido.
     */
    public boolean marcarTareaCompleta(int index) {
        List<Tarea> tareas = agenda.getTareas();
        if (index >= 0 && index < tareas.size()) {
            Tarea tarea = tareas.get(index);
            tarea.setCompletada(true);
            return true;
        }
        return false;
    }

}
