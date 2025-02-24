package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Tarea;
import com.service.Service;

@RestController
@RequestMapping("/api")
public class AssistantController {
	
	@Autowired
	Service service;
    
    @GetMapping("/hora")
    public String obtenerHora() {
        return service.obtenerHora();
    }
    
    @PostMapping("/tarea")
    public void crearTarea(@RequestBody Tarea tarea) {
        service.crearTarea(null, null, null);
    }

}
