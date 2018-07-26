package com.oocl.SpringDataJPA.one.to.one.controllers;

import com.oocl.SpringDataJPA.one.to.one.entities.Leader;
import com.oocl.SpringDataJPA.one.to.one.repositories.LeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/leaders")
public class LeaderController {
    private LeaderRepository leaderRepository;

    @Autowired
    public LeaderController(LeaderRepository leaderRepository ){
        this.leaderRepository=leaderRepository;
    }

    @Transactional
    @PostMapping(path = "",produces = MediaType.APPLICATION_JSON_VALUE)
    public Leader save(@RequestBody Leader leader){
        if(leader.getKlass()!=null){
            leader.getKlass().setLeader(leader);
        }
        return leaderRepository.save(leader);
    }

    @Transactional
    @GetMapping(path = "",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Leader> findALL(){
        return leaderRepository.findAll();
    }

    @Transactional
    @DeleteMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Leader delete(@PathVariable("id") Long id){
        Leader leader = leaderRepository.findById(id).get();
        leaderRepository.delete(leader);
        return leader;
    }

}
