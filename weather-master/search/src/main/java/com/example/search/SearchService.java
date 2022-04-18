package com.example.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class SearchService {

    private final RestTemplate restTemplate;

    @Autowired
    public SearchService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public City getCities()
    {
        return restTemplate.getForObject("", City.class);
    }

}
