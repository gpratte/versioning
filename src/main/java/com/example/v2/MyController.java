package com.example.v2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Value("#{ '${version}' == 'version2' ? '${version2.one.two}' : '${one.two}' }")
    private String url;

    @GetMapping("/")
    public String getUrl() {
        return url;
    }

}
