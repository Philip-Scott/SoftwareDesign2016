package iteso.mx;
import org.junit.Before;
import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import static org.junit.Assert.assertEquals;
/**
 * Created by Diego on 22/10/2016.
 */

public class ChocolateBoilerTest {
    ChocolateBoiler chocolate;

    @Before
    public void setup () {
        chocolate = ChocolateBoiler.getInstance();
    }

    @Test
    public void illigalRunTest () {
        assertEquals(true, chocolate.fill());
        assertEquals(false, chocolate.fill());
        assertEquals(false, chocolate.fill());

        assertEquals(false,chocolate.isEmpty());
        assertEquals(true, chocolate.boil());
        assertEquals(false, chocolate.boil());

        assertEquals(false, chocolate.fill());

        assertEquals(true, chocolate.isBoiled());

        assertEquals(true, chocolate.drain());
        assertEquals(false, chocolate.drain());
        assertEquals(false, chocolate.boil());

        assertEquals(true, chocolate.isEmpty());
    }

    @Test
    public void runthoughTest(){
        assertEquals(true, chocolate.fill());
        assertEquals(false,chocolate.isEmpty());
        assertEquals(true, chocolate.boil());
        assertEquals(true, chocolate.isBoiled());
        assertEquals(true, chocolate.drain());
        assertEquals(true,chocolate.isEmpty());
    }

    @Test
    public void multiThreadTest () {
        Thread threadA = new Thread(new Runnable() {
            public void run() {
                assertEquals(true, chocolate.fill());
                System.out.println("1");
                assertEquals(true, chocolate.boil());
                System.out.println("3");
                assertEquals(true, chocolate.drain());
                System.out.println("5");
            }
        });

        Thread threadB = new Thread(new Runnable() {
            public void run() {
                assertEquals(false, chocolate.fill());
                System.out.println("2");
                assertEquals(false, chocolate.boil());
                System.out.println("4");
                assertEquals(false, chocolate.drain());
                System.out.println("6");
            }
        });

        threadA.start();
        try {
            Thread.sleep(500);
        }catch(InterruptedException e){

        }
        threadB.start();

        //Make sure it ends
        try {
            Thread.sleep(5000);
        }catch(InterruptedException e){

        }

        assertEquals(true,chocolate.isEmpty());
    }
}
