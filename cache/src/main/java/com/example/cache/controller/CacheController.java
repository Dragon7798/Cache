package com.example.cache.controller;

import com.example.cache.entity.Emp;
import com.example.cache.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Optional;

@RestController
public class CacheController {
    @Autowired
    DbService dbService;

    @GetMapping("/get")
    ResponseEntity<Object> response() {

        return new ResponseEntity<>(new String[]{"Response"}, HttpStatus.OK);
    }


    @GetMapping("/db")
    ResponseEntity<Optional<Emp>> data(@RequestParam("id") int id) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        return new ResponseEntity<>(dbService.getById(id), headers, HttpStatus.OK);

    }
}
