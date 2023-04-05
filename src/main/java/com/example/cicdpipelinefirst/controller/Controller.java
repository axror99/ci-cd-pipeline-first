package com.example.cicdpipelinefirst.controller;

import com.example.cicdpipelinefirst.entity.Hp;
import com.example.cicdpipelinefirst.repository.Repository;
import com.example.cicdpipelinefirst.request.Request;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hp/")
@RequiredArgsConstructor
public class Controller {

    private final Repository repository;

    @GetMapping("/list")
    private List<Hp> getList() {
        return repository.findAll();
    }

    @PostMapping("/add")
    private Hp add(@RequestBody Request request) {
        Hp hp = new Hp();
        hp.setName(request.getName());
        hp.setPrice(request.getPrice());
        return repository.save(hp);
    }

}
