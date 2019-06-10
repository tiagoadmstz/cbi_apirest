/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.controllers;

import br.com.dsc.cbi.apirest.entities.Marca;
import br.com.dsc.cbi.apirest.repositories.MarcaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Tiago
 */
@RestController
@RequestMapping("/marcas")
public class MarcasControllers {

    @Autowired
    private MarcaRepository repository;

    @GetMapping("/admin/v1/all")
    public ResponseEntity<List<Marca>> getMarcas() {
        try {
            return new ResponseEntity(repository.findAll(), HttpStatus.FOUND);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

}
