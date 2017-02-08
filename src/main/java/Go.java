import com.springinaction.springidol.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by головченко on 06.02.2017.
 */
public class Go {

    public static void main(String[] args) throws PerformanceException {

        //ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");

/*        Performer performer = (Performer) ctx.getBean("duke");
        performer.perform();

        // JUGGLING 15 BEANBAGS
        Performer duke15 = (Performer) ctx.getBean("duke15");
        //duke15.perform();

        Performer duke15_2 = (Performer) ctx.getBean("duke15");
        //duke15.perform();

        if(duke15_2 instanceof Juggler){
            ((Juggler) duke15_2).setBags(20);
        }

        duke15.perform();*/

/*        // PoeticJuggler
        Performer poeticJuggler = (Performer) ctx.getBean("jackie_chan");
        poeticJuggler.perform();*/

/*        //Auditorium Class
        Auditorium auditorium = (Auditorium)ctx.getBean("theAuditorium");
        System.out.format("Light ON: %b ",auditorium.getLightOn());*/

        //Scooter
        Instrumentalist scooter = (Instrumentalist) ctx.getBean("scooter");
        scooter.perform();

    }
}
