package amir.wone.sn.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello Boss");
        return "Hello Amir!";
    }

}
