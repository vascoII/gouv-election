package com.gouv.gouvelection.dto;

import java.util.Date;

public class ElectionDto {
    private Date date;

    public ElectionDto(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

}
