import com.springinaction.springidol.PerformanceException;
import com.springinaction.springidol.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by головченко on 06.02.2017.
 */
public class Go {

    public static void main(String[] args) throws PerformanceException {

        //ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");

        Performer performer = (Performer) ctx.getBean("duke");
        performer.perform();

        // JUGGLING 15 BEANBAGS
        Performer duke15 = (Performer) ctx.getBean("duke15");
        duke15.perform();



        // PoeticJuggler
        Performer poeticJuggler = (Performer) ctx.getBean("jackie_chan");
        poeticJuggler.perform();

    }
}
