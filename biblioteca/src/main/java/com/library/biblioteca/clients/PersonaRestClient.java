package com.library.biblioteca.clients;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.library.biblioteca.dto.ClienteDTO;


@Service
public class PersonaRestClient {
    RestTemplate restTemplate = new RestTemplate();

    String url = "http://clientes-service:8081/api/personas/aleatorio";
    
    public ClienteDTO getPersonaAleatoria() {
        return restTemplate.getForObject(url, ClienteDTO.class);
    }
}
