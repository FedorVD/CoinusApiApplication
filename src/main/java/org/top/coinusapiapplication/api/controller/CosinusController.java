package org.top.coinusapiapplication.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.top.coinusapiapplication.api.message.OutputMessage;
import org.top.coinusapiapplication.api.message.SideResultMessage;
import org.top.coinusapiapplication.calculate.Triangle;

import java.io.IOException;

@RestController
@RequestMapping("api/cosinus")
public class CosinusController {

    @PostMapping
    public OutputMessage cosinus(@RequestBody Triangle triangle) throws IOException {
        //return data;
        assert triangle.getC() != null;
        return new SideResultMessage(
                triangle.getC().toString(),
                triangle.getA().toString(),
                triangle.getB().toString(),
                triangle.getAngle().toString()
                );
    }
}
