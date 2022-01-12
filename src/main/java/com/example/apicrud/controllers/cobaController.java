package com.example.apicrud.controllers;

import java.util.List;

import com.example.apicrud.entities.CarEntity;
import com.example.apicrud.repositories.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/coba")
public class cobaController {

    @Autowired
    CarRepository carRepository;


    @GetMapping(value = "checkAPI")
    public String checkApi(){

        return "Java Springboot - First API";
    }

    @PostMapping(value = "addNewCar")
    public String addNewCar(@RequestBody CarEntity param){
        carRepository.save(param);
        return "Berhasil!";
    }

    @GetMapping(value = "getAll")
    public List<CarEntity> getAllCar(){
        return carRepository.findAll();
    }

    @GetMapping(value = "getById")
    public CarEntity getById(@RequestParam int id){
        return carRepository.findById(id).get();
    }

    @PostMapping(value = "updateCar")
    public CarEntity updateCar(@RequestBody CarEntity param){
        return carRepository.save(param);
    }

    @GetMapping(value = "deleteCar")
    public String deleteCar(@RequestParam int id){
        carRepository.deleteById(id);
        return "Sukses Menghapus Data dengan id : "+id;
    }


    
}
