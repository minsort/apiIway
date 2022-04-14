package com.seleznev.iway.service;

import com.seleznev.iway.model.SiteDto;
import com.seleznev.iway.model.SitesDto;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Component
public class IwayClient {
HttpClient httpClient = HttpClientBuilder.create().build();
ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
    private RestTemplate restTemplate = new RestTemplate(requestFactory);

    public List<SiteDto> getSites() throws URISyntaxException {
        String url = "https://sandbox.iway.io/transnextgen/v3/prices?lang=ru¤cy=RUB\n" +
                "&user_id=1863&start_place_point=55.035705,82.896254&finish_place_point=55.029283,82.926286";
        SitesDto response = restTemplate.getForObject(new URI(url), SitesDto.class);
        return response.getResult();
    }









}
