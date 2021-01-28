package com.test.app.controllers;

import com.test.app.entities.Doctor;
import com.test.app.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService service;

    @PostMapping("/saveDoctor")
    public Doctor addDoctor(@RequestBody Doctor doctor){
        return service.saveDoctor(doctor);
    }

    @PostMapping("/saveDoctors")
    public List<Doctor> addDoctors(@RequestBody List<Doctor> doctors){
        return service.saveDoctors(doctors);
    }

    @GetMapping("/doctors")
    public List<Doctor> findAllDoctors(){
        return service.getDoctors();
    }

    @GetMapping("/doctor/{id}")
    public Doctor findDoctor(@PathVariable int id){
        return service.getDoctor(id);
    }

    @PutMapping("/updateDoctor")
    public Doctor updateDoctors(@RequestBody Doctor doctor){
        return service.updateDoctor(doctor);
    }

    @DeleteMapping("/deleteDoctor/{id}")
    public String deleteDoctor(@PathVariable int id){
        return service.deleteDoctor(id);
    }

}
;