package com.gouv.gouvelection.controller;

import com.gouv.gouvelection.dto.ElectionDto;
import com.gouv.gouvelection.entity.Election;
import com.gouv.gouvelection.service.ElectionServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class ElectionController {
    private final ElectionServiceInterface electionService;
    public ElectionController(ElectionServiceInterface electionService) {
        this.electionService = electionService;
    }

    @GetMapping("/election/{name}")
    public Election getElection(@PathVariable String name) {
        return this.electionService.getElection(name);
    }

    @GetMapping("/election/next")
    public List<Election> getOpenElections() {
        ElectionDto electionDto = new ElectionDto(new Date());
        return this.electionService.getNextElections(electionDto);
    }
}
