package com.example;

import io.micronaut.http.annotation.*;

@Controller("/restTest")
public class RestTestController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}