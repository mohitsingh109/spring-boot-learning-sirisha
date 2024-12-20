package com.springboot.learning.controller;

import com.springboot.learning.schema.Person;
import com.springboot.learning.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController // --> create a bean and load in your context
public class TestController {

    private final TestService testService;
    private final Person person;

    // Three

    @Autowired // Not recommended
    public TestController(TestService testService, Person person) {
        this.testService = testService;
        this.person = person;
        System.out.println("Controller = " + person); // memory location
    }

    // @Autowired
    // Via a Constructor (recommended)
    // Via a setter
    // Via a inline variable

//    @Autowired
//    public void setTestService(TestService testService) {
//        this.testService = testService;
//    }
//
//    @Autowired
//    public void setPerson(Person person) {
//        this.person = person;
//    }
}
