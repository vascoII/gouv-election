package com.gouv.gouvelection.service;

import com.gouv.gouvelection.dto.ElectionDto;
import com.gouv.gouvelection.entity.Election;
import com.gouv.gouvelection.repository.ElectionRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectionService implements ElectionServiceInterface {
    private final ElectionRepositoryInterface electionRepository;

    public ElectionService(ElectionRepositoryInterface electionRepository) {
        this.electionRepository = electionRepository;
    }

    @Override
    public Election getElection(String name) {
        return this.electionRepository.findByName(name);
    }

    @Override
    public List<Election> getNextElections(ElectionDto electionDto) {
        return this.electionRepository.findAllAfterCurrentDate(electionDto.getDate());
    }
}
