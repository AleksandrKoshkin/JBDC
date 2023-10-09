package org.example.controller;

import org.example.repository.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private org.example.repository.Repository Repository;

    public Controller(Repository Repository) {
        this.Repository = Repository;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam (value = "name", required = false)  String name) {
        return Repository.getProductName(name);
    }
}
