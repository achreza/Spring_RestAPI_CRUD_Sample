package com.example.apicrud.repositories;

import com.example.apicrud.entities.CarEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Integer>{

}