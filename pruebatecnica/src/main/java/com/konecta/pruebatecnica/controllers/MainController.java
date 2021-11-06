package com.konecta.pruebatecnica.controllers;


import com.konecta.pruebatecnica.models.Empleado;
import com.konecta.pruebatecnica.models.Solicitud;
import com.konecta.pruebatecnica.repository.EmpleadoRepository;
import com.konecta.pruebatecnica.repository.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@Controller
@RequestMapping(path = "api")
public class MainController {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private SolicitudRepository solicitudRepository;

    @CrossOrigin
    @GetMapping("solicitudes")
    public @ResponseBody List<Solicitud> findAllPetitions(){
       Iterable<Solicitud> solicitudes = solicitudRepository.findAll();
       List<Solicitud> solicitudList = new ArrayList<>();
       solicitudes.forEach(solicitudList::add);

       return solicitudList;
   }

    public void createNewPetition(){}

    @CrossOrigin
    @GetMapping("empleados")
    public @ResponseBody
    Iterable<Empleado> findAllEmployees(){
        Iterable<Empleado> empleados= empleadoRepository.findAll();
        return empleados;
    }

    @CrossOrigin
    @PostMapping("empleados")
    public void insertNewEmployee(@RequestBody Empleado empleado){
        empleadoRepository.save(empleado);
    }
}
