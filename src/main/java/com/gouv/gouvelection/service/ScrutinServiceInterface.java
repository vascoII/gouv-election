package com.gouv.gouvelection.service;

import com.gouv.gouvelection.entity.Scrutin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ScrutinServiceInterface {

    List<Scrutin> getAllScrutin();

}
