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
/*
        // Link by Name
        Human human1 = (Human) ctx.getBean("human1");
        human1.meDressedIn();*/

/*        // Link by Type
        Human human2 = (Human) ctx.getBean("human2");
        human2.meDressedIn();*/

/*
        // Link by Constructor
        Human human3 = (Human) ctx.getBean("human3");
        human3.meDressedIn(); //human5.meDressedIn(); //exception - no autowired
*/

/*        // Link by No
        Human human5 = (Human) ctx.getBean("human5");
        //human5.meDressedIn(); //exception - no autowired*/


        //autowire and explicit binding
        Human human6 = (Human) ctx.getBean("human6");
        human6.meDressedIn();
    }
}
