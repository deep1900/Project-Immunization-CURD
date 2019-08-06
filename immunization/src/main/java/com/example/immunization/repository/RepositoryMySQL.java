package com.example.immunization.repository;


import com.example.immunization.com.example.immunization.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryMySQL extends JpaRepository<Model,Integer>
{


}
