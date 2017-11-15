package com.example.demo.services;

import com.example.demo.dao.VersionDao;
import com.example.demo.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class VersionServiceTest {

        @Spy
        @InjectMocks
        VersionServiceImpl versionService;

        @Mock
        VersionDao versionDao;

        @Before
        public void setup() {
            MockitoAnnotations.initMocks(this);
        }

        @Test
        public void getUsers_test(){
            List<User> userListTest = new ArrayList<>();
                userListTest.add(new User( "Andrew", "andrew@email.com"));
                userListTest.add(new User( "Richard", "richard@email.com"));
                userListTest.add(new User( "Susie", "susie@email.com"));
                userListTest.add(new User( "Kris", "kris@email.com"));
                userListTest.add(new User( "Frank", "frank@email.com"));
                userListTest.add(new User( "Jim", "jim@email.com"));

//            Setup
            when(versionDao.getUsers()).thenReturn((List<User>) userListTest);
//            Execute
            List<User> users = versionService.getUsers();
//            Assertion
            //            first argument is what you except the value to be, second argument is what you're testing
//            System.out.println(users);
            assertEquals(userListTest, users);
        }

//        @Test
//        public void setVersion_test(){

//        //Setup
//        int inputValue = 2;
//        when(VersionDao.setVersion()).thenReturn(2);
//
//        //Execute
//            versionService.setVersion(inputValue);
//
//        //Assertion
//
//        }

}


