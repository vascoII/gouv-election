package com.gouv.gouvelection.service;

import com.gouv.gouvelection.entity.Scrutin;
import com.gouv.gouvelection.repository.ScrutinRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ScrutinService implements ScrutinServiceInterface {
    private final ScrutinRepositoryInterface scrutinRepository;

    public ScrutinService(ScrutinRepositoryInterface scrutinRepository) {
        this.scrutinRepository = scrutinRepository;
    }

    @Override
    public List<Scrutin> getAllScrutin() {
        return new ArrayList<>((Collection) this.scrutinRepository.findAll());
    }

}
