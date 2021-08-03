package amir.wone.sn;

import amir.wone.sn.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PetclinicApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(PetclinicApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);

    }

}
