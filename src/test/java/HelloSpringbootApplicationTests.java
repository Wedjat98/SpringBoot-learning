import com.lionlemon.pojo.Cat;

import com.lionlemon.pojo.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloSpringbootApplicationTests {
    @Autowired
    private Person person;
    @Test
    public void contextLoads(){
        System.out.println(person);
    }
}
