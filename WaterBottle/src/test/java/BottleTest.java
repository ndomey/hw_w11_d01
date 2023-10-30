import org.example.Bottle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {
    Bottle bottle;

    @Before
    public void before(){
        bottle = new Bottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, bottle.isItFull());
    }

    @Test
    public void hadASip(){
        assertEquals(90, bottle.haveASip());
    }

    @Test
    public void isItEmpty(){
        assertEquals(0, bottle.bottomUp());
    }

    @Test
    public void isItFull(){
        assertEquals(100, bottle.refill());
    }
}
