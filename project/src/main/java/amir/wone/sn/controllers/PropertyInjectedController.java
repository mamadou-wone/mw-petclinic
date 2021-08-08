package amir.wone.sn.controllers;

import amir.wone.sn.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }


}
