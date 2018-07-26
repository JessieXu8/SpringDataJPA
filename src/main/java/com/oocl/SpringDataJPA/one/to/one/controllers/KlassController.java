package com.oocl.SpringDataJPA.one.to.one.controllers;

import com.oocl.SpringDataJPA.one.to.one.entities.Klass;
import com.oocl.SpringDataJPA.one.to.one.repositories.KlassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/klasses")
public class KlassController {
    private KlassRepository klassRepository;

    @Autowired
    public KlassController(KlassRepository klassRepository){
        this.klassRepository=klassRepository;
    }

    @PostMapping(path = "",produces = MediaType.APPLICATION_JSON_VALUE)
    public Klass getALL(@RequestBody Klass klass){
        return klassRepository.save(klass);
    }
}
