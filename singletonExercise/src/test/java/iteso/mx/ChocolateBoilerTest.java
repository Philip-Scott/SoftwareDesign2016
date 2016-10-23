package iteso.mx;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Diego on 22/10/2016.
 */

public class ChocolateBoilerTest {
    @Test
    public void isEmptyTest(){
        ChocolateBoiler chocolate;
        ChocolateBoiler chocolate1;
        chocolate = ChocolateBoiler.getInstance();
        chocolate1 = ChocolateBoiler.getInstance();
        chocolate.fill();
        assertEquals(false,chocolate.isEmpty());
        //assertEquals(false,chocolate1.isEmpty());
        chocolate.drain();
        assertEquals(false,chocolate.isEmpty());
    }
    @Test
    public void isBoiledTest(){
        ChocolateBoiler chocolate;
        chocolate = ChocolateBoiler.getInstance();
        chocolate.boil();
        assertEquals(false,chocolate.isBoiled());
    }

}
