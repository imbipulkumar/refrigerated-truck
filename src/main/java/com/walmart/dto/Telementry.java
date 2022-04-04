package com.walmart.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Telementry {
    private Integer id;

    private Double temperature;

    private Double humidity;

    private String location;

    private Date timestamp;
}
