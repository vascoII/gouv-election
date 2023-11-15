package com.gouv.gouvelection.service;

import com.gouv.gouvelection.dto.ElectorDto;
import org.springframework.stereotype.Service;

@Service
public interface ElectorServiceInterface {
    Boolean findElectorByNationalIdAndEmail(ElectorDto electorDto);
}
