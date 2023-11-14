package com.github.ninja.api.controller;

import com.github.ninja.api.models.Ninjas;
import com.github.ninja.api.repository.NinjasRepository;
import com.github.ninja.api.services.NinjaService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ninjas")
public class NinjaController {

    @Autowired
    NinjasRepository ninjasRepository;
    @Autowired
    NinjaService ninjaService;

    @GetMapping
    public Iterable<Ninjas> getNinjas(){
        return ninjaService.getNinjas();
    }

    @PostMapping("/create")
    @Transactional
    public void createNinja(@RequestBody Ninjas ninjas){
        ninjasRepository.save(ninjas);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteNinja(@PathVariable long id){
        ninjaService.deleteNinja(id);
    }

}
