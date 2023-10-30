import org.example.Planets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetsTest {

    Planets planets;

    @Before
    public void before(){
        planets = new Planets("Mars", 908973);
        }


    @Test
    public void hasName(){
        assertEquals("Mars", planets.getName());
    }

    @Test
    public void hasSize(){
        assertEquals(908973, planets.getSize());
    }

    @Test
    public void didMarsExplode(){
        assertEquals("Boom! Mars has exploded", planets.explode());
    }

}
