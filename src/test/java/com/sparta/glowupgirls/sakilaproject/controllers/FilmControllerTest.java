package com.sparta.glowupgirls.sakilaproject.controllers;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class FilmControllerTest {

    @Autowired
    private FilmController filmController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void actorControllerTest() {
        Assertions.assertNotNull(filmController);
    }

    @Test
    public void getActors() throws Exception{
        this.mockMvc.perform(get("/films")).andDo(print()).andExpect(status().isOk()).andExpect(model().attributeExists("films", "allFilms"));
    }
}