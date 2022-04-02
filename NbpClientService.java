package com.devopsi.akademia.exchangeapi;


import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import java.util.Arrays;


@Service

public class NbpClientService {


    public RateTable getForRates() {
        String Url = "http://api.nbp.pl/api/exchangerates/tables/a/";
        RestTemplate restTemplate = new RestTemplate();
        RateTable[] rateTables = restTemplate.getForObject(Url, RateTable[].class);
        assert rateTables != null;
        return Arrays.stream(rateTables).findFirst().orElseThrow();
    }


}