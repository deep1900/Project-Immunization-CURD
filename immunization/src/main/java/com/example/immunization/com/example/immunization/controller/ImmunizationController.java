package com.example.immunization.com.example.immunization.controller;

import com.example.immunization.com.example.immunization.exception.BookNotFoundException;
import com.example.immunization.com.example.immunization.exception.NoRecordsAvailableExaception;
import com.example.immunization.com.example.immunization.model.Model;
import com.example.immunization.repository.RepositoryMySQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/immunization")
public class ImmunizationController
{
    @Autowired
    RepositoryMySQL repositoryMySQL;

    @GetMapping(path = "/all",consumes = "application/json", produces = "application/json")
    public Iterable<Model> retriveStudent() throws NoRecordsAvailableExaception {
        Iterable<Model> models = repositoryMySQL.findAll();
        List<Model> list = new ArrayList<>();
        models.forEach(list::add);
        if(list.isEmpty())
        {
            throw new NoRecordsAvailableExaception("No Recoord Found");
        }
        else
        {
            return list;
        }

    }

    @PostMapping(path="/save", consumes = "application/json", produces = "application/json")
    public String saveModel(@RequestBody Model model)
    {
        repositoryMySQL.save(model);
        return "saved";

    }
    
    @GetMapping(path = "/{id}")
    public Model findOne(@PathVariable int id)
    {
        return repositoryMySQL.findById(id)
                .orElseThrow(()->new BookNotFoundException(id));

    }

}
