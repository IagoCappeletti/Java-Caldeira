package com.github.ninja.api.services;

import com.github.ninja.api.models.Ninjas;
import com.github.ninja.api.repository.NinjasRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class NinjaService {
    @Autowired
    NinjasRepository ninjasRepository;
    public Iterable<Ninjas> getNinjas(){
        return ninjasRepository.findAll();
    }

    public void createNinjas(Ninjas ninjas){
        ninjasRepository.save(ninjas);
    }

    public void deleteNinja(long id){
        ninjasRepository.deleteById(id);
    }

}
