package com.gouv.gouvelection.controller;

import com.gouv.gouvelection.dto.ElectorDto;
import com.gouv.gouvelection.service.ElectorServiceInterface;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElectorController {
    private final ElectorServiceInterface electorService;
    public ElectorController(ElectorServiceInterface electorService) {
        this.electorService = electorService;
    }

    @PostMapping("/elector")
    public Boolean findElectorByNationalIdAndEmail(@RequestBody ElectorDto electorDto) {
        return this.electorService.findElectorByNationalIdAndEmail(electorDto);
    }
}
