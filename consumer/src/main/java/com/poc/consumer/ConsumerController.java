package com.poc.consumer;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService service;

    @GetMapping(value = "/consumer/books",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> produce(){
        return ResponseEntity.ok(this.service.getBooksFromProducer());
    }
}
