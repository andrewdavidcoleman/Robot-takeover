package com.example.demo.controllers;

import com.example.demo.controllers.Version;
import com.example.demo.domain.User;
import com.example.demo.services.VersionService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class VersionControllerTest {

    @InjectMocks
    Version version;

    @Mock
    VersionService versionService;

    private MockMvc mvc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mvc = MockMvcBuilders.standaloneSetup(version).build();
    }

    @Test
    public void getUsers_Get_200_Test() throws Exception {
        //Setup
        List<User> users = versionService.getUsers();
        when(versionService.getUsers()).thenReturn(users);
        //Execution
        mvc.perform(get("/demo/users")).andExpect(status().is(200)).andExpect(content().json(String.valueOf(users)));
        //Assertion
        //first argument is what you except the value to be, second argument is what you're testing
        System.out.println(users);
        assertEquals(users, versionService.getUsers());
    }


}
