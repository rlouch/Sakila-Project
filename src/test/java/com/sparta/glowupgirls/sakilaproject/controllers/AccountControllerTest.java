package com.sparta.glowupgirls.sakilaproject.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class AccountControllerTest {

    @Autowired
    private AccountController accountController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    @WithMockUser(username ="user1" , password = "pwd",roles = "USER")
    public void currentUser() throws Exception {
        mockMvc.perform(get("/account")).andDo(print()).andExpect(status().isOk()).andExpect(model().attributeExists());
    }


}