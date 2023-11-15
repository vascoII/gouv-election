package com.gouv.gouvelection.service;

import com.gouv.gouvelection.dto.ElectorDto;
import com.gouv.gouvelection.entity.Elector;
import com.gouv.gouvelection.repository.ElectorRepositoryInterface;
import org.springframework.stereotype.Service;

@Service
public class ElectorService implements ElectorServiceInterface {
    private final ElectorRepositoryInterface electorRepository;

    public ElectorService(ElectorRepositoryInterface electorRepository) {
        this.electorRepository = electorRepository;
    }

    @Override
    public Boolean findElectorByNationalIdAndEmail(ElectorDto electorDto) {
        Elector elector = this.electorRepository.findByNationalIdAndPassword(electorDto.getNationalId(), electorDto.getPassword());
        return elector != null;
    }
}
