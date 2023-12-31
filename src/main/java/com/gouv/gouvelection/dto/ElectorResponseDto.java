package com.gouv.gouvelection.dto;

import com.gouv.gouvelection.entity.Elector;

public class ElectorResponseDto {
    private String firstName;
    private String lastName;
    private String nationalId;

    public ElectorResponseDto(Elector elector) {
        this.firstName = elector.getFirstName();
        this.lastName = elector.getLastName();
        this.nationalId = elector.getNationalId();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationalId() {
        return nationalId;
    }
}
