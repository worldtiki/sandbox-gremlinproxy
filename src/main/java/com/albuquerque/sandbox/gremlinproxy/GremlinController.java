package com.albuquerque.sandbox.gremlinproxy;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GremlinController {

    private final GremlinClient client;

    @Inject
    public GremlinController(GremlinClient client) {
        this.client = client;
    }

    @RequestMapping("/ping")
    public String ping() {
        return "pong";
    }

    @RequestMapping("/echo/{message}")
    public String echo(@PathVariable("message") final String message) {
        return message;
    }

    @RequestMapping("/call")
    public String call() {
        return client.ping();
    }
}
