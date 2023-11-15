package com.gouv.gouvelection.service;

import com.gouv.gouvelection.dto.ElectionDto;
import com.gouv.gouvelection.entity.Election;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ElectionServiceInterface {

    Election getElection(String name);

    List<Election> getNextElections(ElectionDto electionDto);
}
