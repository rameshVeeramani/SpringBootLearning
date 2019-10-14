package com.example.demo.controller;

import com.example.demo.entities.Greeting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloRestControllerTest {
    @Autowired
    private TestRestTemplate template;
/*
    @Test
    public void greetWithoutName() {
        //ResponseEntity<Greeting> entity = template.getForEntity("/rest", com.example.demo.entities.Greeting.class);
        ResponseEntity<Greeting> entity =template.exchange("/rest",
                HttpMethod.GET,
                new ParameterizedTypeReference<Greeting>());

                assertEquals(HttpStatus.OK, entity.getStatusCode());
        assertEquals(MediaType.APPLICATION_JSON_UTF8, entity.getHeaders().getContentType());
        Greeting response = entity.getBody();
        assertEquals("Hello, World!", response.getMessage());
    }

    @Test
    public void greetWithName() {
        Greeting response = template.getForObject("/rest?name=Dolly", Greeting.class);
        assertEquals("Hello, Dolly!", response.getMessage());
    }
    */
}
