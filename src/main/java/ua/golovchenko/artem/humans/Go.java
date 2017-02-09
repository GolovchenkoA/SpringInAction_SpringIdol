package ua.golovchenko.artem.humans;

import com.springinaction.springidol.PerformanceException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by головченко on 09.02.2017.
 */
public class Go {
    public static void main(String[] args) throws PerformanceException {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-humans.xml");

        Human human1 = (Human) ctx.getBean("human1");
        human1.meDressedIn();
    }
}
