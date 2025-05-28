package org.top.coinusapiapplication.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.top.coinusapiapplication.api.message.StringMessage;

@RestController
@RequestMapping("api")
public class StatusController {

    @GetMapping
    public StringMessage status(){
        return new StringMessage("Server is running");
    }

    @GetMapping("ping")
    public StringMessage ping(){
        return new StringMessage("pong");
    }

}
