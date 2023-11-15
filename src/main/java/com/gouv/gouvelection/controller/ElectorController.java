package com.gouv.gouvelection.controller;

import com.gouv.gouvelection.dto.ElectorDto;
import com.gouv.gouvelection.dto.ElectorResponseDto;
import com.gouv.gouvelection.service.ElectorServiceInterface;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElectorController {
    private final ElectorServiceInterface electorService;
    public ElectorController(ElectorServiceInterface electorService) {
        this.electorService = electorService;
    }

    @PostMapping(value = "/elector", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ElectorResponseDto> findElectorByNationalIdAndEmail(@RequestBody ElectorDto electorDto) {
        ElectorResponseDto electorResponseDto = this.electorService.findElectorByNationalIdAndEmail(electorDto);
        if (electorResponseDto != null) {
            return ResponseEntity.ok(electorResponseDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
