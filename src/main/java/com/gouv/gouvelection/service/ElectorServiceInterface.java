package com.gouv.gouvelection.service;

import com.gouv.gouvelection.dto.ElectorDto;
import com.gouv.gouvelection.dto.ElectorResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface ElectorServiceInterface {
    ElectorResponseDto findElectorByNationalIdAndEmail(ElectorDto electorDto);
}
