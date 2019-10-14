package com.example.demo.controller;

import org.junit.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.Assert.*;

public class helloContollerUnitTest {

    @Test
    public void sayHello() {
        helloContoller h= new helloContoller();
        Model model = new BindingAwareModelMap();
        String result = h.sayHello("World", model);
        assertEquals("World", model.asMap().get("user"));
        assertEquals(result,"hello");

    }
}