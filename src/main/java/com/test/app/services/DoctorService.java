package com.test.app.services;

import com.test.app.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.app.entities.Doctor;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository repository;

    public Doctor saveDoctor(Doctor doctor){
        return repository.save(doctor);
    }

    public List<Doctor> saveDoctors(List<Doctor> doctors){
        return repository.saveAll(doctors);
    }

    public List<Doctor> getDoctors(){
        return repository.findAll();
    }

    public Doctor getDoctor(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteDoctor(int id){
        repository.deleteById(id);
        return "Doctor removed" + id;
    }

    public Doctor updateDoctor(Doctor doctor){
        Doctor existingDoctor = repository.findById(doctor.getId()).orElse(null);

        existingDoctor.setName(doctor.getName());
        existingDoctor.setIdentification_type(doctor.getIdentification_type());
        existingDoctor.setIdentification(doctor.getIdentification());
        existingDoctor.setIdentification(doctor.getProfessional_card());
        existingDoctor.setExperience_years(doctor.getExperience_years());
        existingDoctor.setSpeciality(doctor.getSpeciality());
        existingDoctor.setStart_time(doctor.getStart_time());
        existingDoctor.setEnd_time(doctor.getEnd_time());
        return repository.save(existingDoctor);
    }






}

