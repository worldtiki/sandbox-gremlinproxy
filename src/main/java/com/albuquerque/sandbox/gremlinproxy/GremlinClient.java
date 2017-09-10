package com.albuquerque.sandbox.gremlinproxy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GremlinClient {

    @Value("${REMOTE_HOST}")
    private String host;
    @Value("${REMOTE_PORT}")
    private Integer port;

    private RestTemplate restTemplate = new RestTemplate();

    public String ping() {
        return restTemplate.getForObject("http://" + host + ":" + port + "/ping", String.class);
    }
}
