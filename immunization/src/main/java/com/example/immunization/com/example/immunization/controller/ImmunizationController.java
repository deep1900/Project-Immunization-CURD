package com.example.immunization.com.example.immunization.controller;

import com.example.immunization.com.example.immunization.model.Model;
import com.example.immunization.repository.RepositoryMySQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/immunization")
public class ImmunizationController
{
    @Autowired
    RepositoryMySQL repositoryMySQL;

    @GetMapping(path = "/all",consumes = "application/json", produces = "application/json")
    public Iterable<Model> retriveStudent()
    {
       return repositoryMySQL.findAll();

    }

    @PostMapping(path="/save", consumes = "application/json", produces = "application/json")
    public String saveModel(@RequestBody Model model)
    {
        repositoryMySQL.save(model);
        return "saved";

    }

}
