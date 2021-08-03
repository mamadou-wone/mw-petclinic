package amir.wone.sn.controllers;

import amir.wone.sn.services.GreetingService;
import amir.wone.sn.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void setGreetingService() {
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting() );
    }
}