package amir.wone.sn;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class PetclinicApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(LocalDate.now().getYear());
    }

}
