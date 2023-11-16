package com.gouv.gouvelection.controller;

import com.gouv.gouvelection.entity.Scrutin;
import com.gouv.gouvelection.service.ScrutinServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScrutinController {
    private final ScrutinServiceInterface scrutinService;
    public ScrutinController(ScrutinServiceInterface scrutinService) {
        this.scrutinService = scrutinService;
    }

    @GetMapping("/scrutin/all")
    public List<Scrutin> getAllElection() {
        return this.scrutinService.getAllScrutin();
    }

}
