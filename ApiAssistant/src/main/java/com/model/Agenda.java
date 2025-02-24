package com.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Agenda {
	// Lista que contiene las tareas de la agenda.
    private List<Tarea> tareas;

    // Constructor que inicializa la lista de tareas.
    public Agenda() {
        this.tareas = new ArrayList<>();
    }

    // Getter para obtener la lista de tareas.
    public List<Tarea> getTareas() {
        return tareas;
    }

    // Setter para establecer la lista de tareas.
    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    // Método para agregar una nueva tarea a la agenda.
    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    // Método para eliminar una tarea de la agenda.
    public boolean eliminarTarea(Tarea tarea) {
        return tareas.remove(tarea);
    }

}
